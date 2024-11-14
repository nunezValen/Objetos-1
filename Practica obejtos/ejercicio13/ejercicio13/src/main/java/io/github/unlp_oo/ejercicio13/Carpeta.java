package io.github.unlp_oo.ejercicio13;
import java.util.*;

public class Carpeta {
	private List<Email> emails;
	private String nombre;
	
	public Carpeta () {
		this.nombre ="";
		this.emails = new ArrayList<Email>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarEmail(Email e) {
		this.emails.add(e);
	}
	
	private void borrarMail(Email e) {
		this.emails.remove(e);
	}
	
	public void mover(Email e, Carpeta destino) {
		destino.agregarEmail(e);
		this.borrarMail(e);
	}
	
	public Email buscar(String texto) {
		Iterator<Email> it = this.emails.iterator();
		while(it.hasNext()) {
			Email e = it.next();
			if (e.getCuerpo().equals(texto) || e.getTitulo().equals(texto)) {
				return e;
			}
		}
		return null;
	}
	
	
	public int espacioOcupado() {
		
		return this.nombre.length() + this.emails.stream().mapToInt(e -> e.espacioOcupado()).sum();
	}
	
	
}
