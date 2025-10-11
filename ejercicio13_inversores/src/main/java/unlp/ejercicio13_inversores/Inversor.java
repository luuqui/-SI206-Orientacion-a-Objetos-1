package unlp.ejercicio13_inversores;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		this.inversiones = new ArrayList<Inversion>();
	}
	
	public void agregarInversion(Inversion inversion) {
		inversiones.add(inversion);
	}
	
	public void sacarInversion(Inversion inversion) {
		inversiones.remove(inversion);
	}
	
	public double getValorActualCartera() {
		double total = 0;
		for(Inversion inv: inversiones) {
			total += inv.getValorActual();
		}
		return total;
	}
}
