package unlp.ejercicio14_siderurgica;

public class PrismaRectangular extends Pieza{
	
	private double ladoMayor;
	private double ladoMenor;
	private double altura;
	
	public PrismaRectangular(String material, String color, 
			double ladoMayor, double ladoMenor, double altura) {
		super(material, color);
		this.altura = altura;
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
	}
	
	@Override
	public double volumen() {
		return (ladoMayor * ladoMenor * altura);
	}
	@Override
	public double superficie() {
		return (2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura));
	}
}
