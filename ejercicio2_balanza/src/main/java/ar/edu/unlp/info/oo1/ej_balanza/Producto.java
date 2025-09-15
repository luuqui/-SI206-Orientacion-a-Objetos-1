package ar.edu.unlp.info.oo1.ej_balanza;

public class Producto {
	private double peso;
	private double precioPKilo;
	private String desc;
	
	public Producto(String desc, double peso, double precioPkilo) {
		this.desc = desc;
		this.peso = peso;
		this.precioPKilo = precioPkilo;
	}
	
	public void setPrecioPorKilo(double precio) {
		this.precioPKilo = precio;
	}
	
	public String getDescripcion() {
		return this.desc;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public double getPrecioPorKilo() {
		return this.precioPKilo;
	}
	
	public double getPrecio() {
		return (this.peso * this.precioPKilo);
	}
}
