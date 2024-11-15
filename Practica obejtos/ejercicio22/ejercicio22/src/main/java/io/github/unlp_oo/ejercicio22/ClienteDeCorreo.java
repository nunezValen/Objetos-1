package io.github.unlp_oo.ejercicio22;
import java.util.*;

public class ClienteDeCorreo {
	private String nombre;
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	
	
	public ClienteDeCorreo() {
		this.nombre = "";
		this.carpetas = new ArrayList<Carpeta>();
	}
	
	public void recibir(Email e) {
		this.inbox.agregarEmail(e);
	}
	
	public Email buscar (String texto) {
		Email e = null;
		Iterator<Carpeta> it = this.carpetas.iterator();
		while(it.hasNext() && e == null) {
			Carpeta c = it.next();
			e = c.buscar(texto);
		}
		return e;
	}
	
	
	public int espacioOcupado() {
		return this.carpetas.stream().mapToInt(c -> c.espacioOcupado()).sum();
	}
	
}
