package unlp.ejercicio15_clienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new ArrayList<Email>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void mover(Email email, Carpeta destino) {
		destino.agregarMail(email);
		emails.remove(email);
	}
	
	public List<Email> getEmails(){
		return new ArrayList<>(emails);
	}
	
	public Integer sumarTotal() {
		return this.emails.stream().mapToInt(e -> e.tamanio()).sum();
	}
	
	public Email encontrar(String texto) {
		return this.emails.stream().filter(e -> e.cumple(texto)).findFirst().orElse(null);
	}
	
	public void agregarMail(Email email) {
		emails.add(email);
	}
}
