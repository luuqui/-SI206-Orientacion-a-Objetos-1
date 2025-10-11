package unlp.ejercicio13_inversores;

public class Accion implements Inversion{
	
	private String nombre;
	private int cantidad;
	private double valorUnitario;

	public Accion(String nombre, int cantidad, double valorUnitario) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
	}

	@Override
	public double getValorActual() {
		return valorUnitario * cantidad;
	}

}
