package unlp.ejercicio15_clienteDeCorreo;

public class Archivo {
	private String nombre;
	
	public Archivo(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Integer tamanio(){
		return nombre.length();
	}
}
