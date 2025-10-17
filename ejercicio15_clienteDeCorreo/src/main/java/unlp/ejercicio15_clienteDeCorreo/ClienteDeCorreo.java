package unlp.ejercicio15_clienteDeCorreo;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		this.inbox = new Carpeta("inbox");
		this.carpetas = new ArrayList<Carpeta>();
	}
	
	public void recibir(Email email) {
		inbox.agregarMail(email);
	}
	
	public Email buscar(String texto) {
		return this.carpetas.stream()
				.map(c -> c.encontrar(texto))
				.filter(e -> e != null)
				.findFirst().orElse(null);
	}
	
	public Integer espacioOcupado() {
		return this.carpetas.stream().mapToInt(c -> c.sumarTotal()).sum();
	}
	
	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
}
