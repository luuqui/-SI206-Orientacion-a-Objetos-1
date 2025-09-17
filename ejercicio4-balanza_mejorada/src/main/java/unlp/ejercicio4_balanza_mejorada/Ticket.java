package unlp.ejercicio4_balanza_mejorada;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ticket {
	private LocalDate fecha;
	private int cantProds;
	private double pesoTot;
	private double precioTot;
	private List<Producto> productos;
	
	public Ticket(int cantProds, double pesoTot, double precioTot, List<Producto> productos) {
		this.fecha = LocalDate.now();
		this.cantProds = cantProds;
		this.pesoTot = pesoTot;
		this.precioTot = precioTot;
		this.productos = new ArrayList<>(productos);
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public List<Producto> getProductos(){
		return Collections.unmodifiableList(this.productos);
	}
	
	public int getCantidadDeProductos() {
		return this.cantProds;
	}
	
	public double getPesoTotal() {
		return this.pesoTot;
	}
	
	public double getPrecioTotal() {
		return this.precioTot;
	}
	
	public double impuesto(){
		return (this.precioTot * 0.21);
	}
}
