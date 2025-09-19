package unlp.ejercicio7_figuras;

public class Cuerpo3D {
	private double altura;
	private Figura caraBasal;
	
	public Cuerpo3D() {
		
	}
	
	public Cuerpo3D(double altura, Figura caraBasal) {
		this.altura = altura;
		this.caraBasal = caraBasal;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setCaraBasal(Figura caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getVolumen() {
		return this.caraBasal.getArea() * this.altura;
	}
	
	public double getSuperficieExterior() {
		return (this.caraBasal.getPerimetro() * this.altura) + (2 * this.caraBasal.getArea());
	}
}
