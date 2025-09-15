package ar.edu.unlp.info.oo1.ej_balanza;

import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private int cantProds;
	private double pesoTot;
	private double precioTot;
	
	public Ticket(int cantProds, double pesoTot, double precioTot) {
		this.fecha = LocalDate.now();
		this.cantProds = cantProds;
		this.pesoTot = pesoTot;
		this.precioTot = precioTot;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
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
