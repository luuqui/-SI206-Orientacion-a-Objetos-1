package unlp.ejercicio11_ganchos;

public class CajaDeAhorro extends Cuenta{
	
	public CajaDeAhorro() {
		super();
	}

	@Override
	protected boolean puedeExtraer(double monto) {
		return this.getSaldo() >= monto + (monto * 0.02) ? true : false;
	}

	@Override
	protected void extraerSinControlar(double monto) {
		super.extraerSinControlar(monto + (monto * 0.02));
	}

	@Override
	public void depositar(double monto) {
		super.depositar(monto - (monto * 0.02));
	}
	
	

}
