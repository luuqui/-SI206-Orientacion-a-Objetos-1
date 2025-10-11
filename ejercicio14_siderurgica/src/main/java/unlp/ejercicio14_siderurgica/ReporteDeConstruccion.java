package unlp.ejercicio14_siderurgica;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new ArrayList<Pieza>();
	}
	
	public double volumenDeMaterial(String material) {
		return piezas.stream().
				filter(p -> p.getMaterial().equalsIgnoreCase(material)).
				mapToDouble(Pieza::volumen).
				sum();
	}
	public double superficieDeColor(String color) {
		return piezas.stream()
				.filter(c -> c.getColor().equalsIgnoreCase(color))
				.mapToDouble(Pieza::superficie)
				.sum();
	}
	
	public void addPieza(Pieza p) {
		piezas.add(p);
	}
}
