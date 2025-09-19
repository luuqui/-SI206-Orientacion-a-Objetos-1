package unlp.ejercicio8_genealogia_salvaje;

import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fecha;
	private Mamifero padre = null;
	private Mamifero madre = null;
	
	public Mamifero() {
	}
	
	public Mamifero(String identificador) {
		this.identificador = identificador;
		this.especie = null;
		this.fecha = null;
	}
	
	public Mamifero(String identificador, String especie, LocalDate fecha) {
		this.identificador = identificador;
		this.especie = especie;
		this.fecha = fecha;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public Mamifero getPadre() {
		return padre;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getMadre() {
		return madre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() {
		return (this.madre != null) ? this.madre.getPadre() : null;
	}
	
	public Mamifero getAbuelaMaterna() {
		return (this.madre != null) ? this.madre.getMadre() : null;
	}
	
	public Mamifero getAbueloPaterno() {
		return (this.padre != null) ? this.padre.getPadre() : null;
	}
	
	public Mamifero getAbuelaPaterna() {
		return (this.padre != null) ? this.padre.getMadre() : null;
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		if(unMamifero==null) return false;
		if(this.padre == unMamifero || this.madre == unMamifero) return true;
		boolean tienePadre = (this.padre != null) ? padre.tieneComoAncestroA(unMamifero) : false;
		boolean tieneMadre = (this.madre != null) ? madre.tieneComoAncestroA(unMamifero): false;
		return (tienePadre || tieneMadre);
	}
}
