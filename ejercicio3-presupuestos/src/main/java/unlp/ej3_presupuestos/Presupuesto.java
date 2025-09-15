package unlp.ej3_presupuestos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
private LocalDate fecha;
private String cliente;
private List<Item> items;

public Presupuesto(String cl) {
	this.fecha = LocalDate.now();
	this.cliente = cl;
	this.items = new ArrayList<>();
}

public LocalDate getFecha() {
	return this.fecha;
}

public String getCliente() {
	return this.cliente;
}

public double calcularTotal() {
	return this.items.stream()
			.mapToDouble(it -> it.costo())
			.sum();
}

public void agregarItem(Item it) {
	items.add(it);
}
}
