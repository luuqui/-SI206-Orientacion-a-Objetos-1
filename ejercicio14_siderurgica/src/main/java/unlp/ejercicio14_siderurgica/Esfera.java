package unlp.ejercicio14_siderurgica;

public class Esfera extends Pieza{

	private double radio;
	
	public Esfera(String material, String color, double radio) {
		super(material, color);
		this.radio = radio;
	}

	@Override
	public double volumen() {
		return (4.0/3.0 * Math.PI * Math.pow(radio, 3));
	}

	@Override
	public double superficie() {
		return 4 * Math.PI * Math.pow(radio, 2);
	}
}
