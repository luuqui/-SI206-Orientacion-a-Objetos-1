package unlp.ejercicio7_figuras;

public class Circulo extends Figura{
	
	private double radio;
	private double diametro;
	
	public Circulo() {
	}

	public Circulo(double radio) {
		this.radio = radio;
		this.diametro = radio * 2;
	}
	
	public double getDiametro() {
		return this.diametro;
	}
	
	public void setDiametro(double diametro) {
		this.diametro = diametro;
		this.radio = diametro / 2;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
		this.diametro = radio * 2;
	}

	@Override
	public double getPerimetro() {
		return Math.PI * this.diametro;
	}

	@Override
	public double getArea() {
		return Math.PI * (this.radio * this.radio);
	}

}
