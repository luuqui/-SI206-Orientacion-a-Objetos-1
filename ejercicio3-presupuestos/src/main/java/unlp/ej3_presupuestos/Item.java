package unlp.ej3_presupuestos;

public class Item {
private String detalle;
private int cant;
private double costoUnitario;

public Item(String detalle, int cant, double costoUnitario) {
	this.detalle = detalle;
	this.cant = cant;
	this.costoUnitario = costoUnitario;
}

public double getCostoUnitario() {
	return this.costoUnitario;
}

public double costo() {
	return this.costoUnitario * this.cant;
}
}
