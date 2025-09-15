package ar.edu.unlp.info.oo1.ej_balanza;

public class Balanza {
	private int cantDeProds;
	private double precioTotal;
	private double pesoTotal;
	
	public Balanza() {
		this.cantDeProds = 0;
		this.pesoTotal = 0;
		this.precioTotal = 0;
	}
	
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	public int getCantidadDeProductos() {
		return this.cantDeProds;
	}
	
	public void ponerEnCero(){
		this.cantDeProds = 0;
		this.pesoTotal = 0;
		this.precioTotal = 0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantDeProds++;
		this.precioTotal+= producto.getPrecio();
		this.pesoTotal+=producto.getPeso();
	}
	
	public Ticket emitirTicket() {
		return new Ticket(this.cantDeProds, this.pesoTotal, this.precioTotal);
	}
}
