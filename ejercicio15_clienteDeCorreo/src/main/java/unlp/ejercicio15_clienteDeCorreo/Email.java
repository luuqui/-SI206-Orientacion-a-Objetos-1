package unlp.ejercicio15_clienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new ArrayList<Archivo>();
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getCuerpo() {
		return this.cuerpo;
	}
	
	public List<Archivo> adjuntos(){
		return new ArrayList<Archivo>(adjuntos);
	}
	
	public void agregarArchivo(Archivo archivo) {
		adjuntos.add(archivo);
	}
	
	public Boolean cumple(String texto) {
		return titulo.equals(texto) || cuerpo.equals(texto);
	}
	
	public Integer tamanio() {
		return titulo.length() + cuerpo.length() + adjuntos.stream()
		.mapToInt(a -> a.tamanio())
		.sum();
	}
}
