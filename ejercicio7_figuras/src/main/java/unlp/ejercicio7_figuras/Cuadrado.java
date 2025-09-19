package unlp.ejercicio7_figuras;

public class Cuadrado extends Figura{
	
	private double lado;
	
	public Cuadrado() {
	}

	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double getPerimetro() {
		return lado * 4;
	}

	@Override
	public double getArea() {
		return lado * lado;
	}

}
