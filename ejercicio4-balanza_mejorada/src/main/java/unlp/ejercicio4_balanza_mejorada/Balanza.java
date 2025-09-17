package unlp.ejercicio4_balanza_mejorada;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Balanza {
	private int cantDeProds;
	private double precioTotal;
	private double pesoTotal;
	private List<Producto> prods;
	
	public Balanza() {
		this.cantDeProds = 0;
		this.pesoTotal = 0;
		this.precioTotal = 0;
		this.prods = new ArrayList<>();
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
		this.prods.clear();
	}
	
	public void agregarProducto(Producto producto) {
		this.cantDeProds++;
		this.precioTotal+= producto.getPrecio();
		this.pesoTotal+=producto.getPeso();
		this.prods.add(producto);
	}
	
	public List<Producto> getProductos(){
		return Collections.unmodifiableList(this.prods);
	}
	
	public Ticket emitirTicket() {
		return new Ticket(this.cantDeProds, this.pesoTotal, this.precioTotal, this.prods);
	}
}
