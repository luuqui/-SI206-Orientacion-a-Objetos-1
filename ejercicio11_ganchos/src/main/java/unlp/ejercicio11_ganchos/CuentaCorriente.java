package unlp.ejercicio11_ganchos;

public class CuentaCorriente extends Cuenta{
	
	private double limite;
	
	public CuentaCorriente() {
		super();
		this.limite = 0;
	}
	
	public CuentaCorriente(double limite) {
		super();
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	protected boolean puedeExtraer(double monto) {
		return monto <= (this.getSaldo() + this.limite);
	}

}
