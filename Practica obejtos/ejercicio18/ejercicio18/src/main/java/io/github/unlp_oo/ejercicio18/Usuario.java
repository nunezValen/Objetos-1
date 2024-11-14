package io.github.unlp_oo.ejercicio18;
import java.util.*;
import io.github.unlp_oo.ejercicio14.DateLapse;

public class Usuario {
	private String nombre;
	private String dir;
	private String DNI;
	private List<Propiedad> propiedades;
	
	public Usuario(String nombre, String dir, String DNI) {
		this.nombre = nombre;
		this.dir = dir;
		this.DNI = DNI;
		this.propiedades = new ArrayList<Propiedad>();
	}
	
	public boolean realizarReserva(DateLapse periodo, Propiedad p) {
		if (p.realizarReserva(periodo)) {
			this.agregarReserva(p);
			return true;
		}
		return false;
	}
	
	public double calcularIngreso(DateLapse periodo) {
		return this.propiedades.stream().mapToDouble(p -> p.calcularIngresos(periodo)).sum();
	}
	
	
	private void agregarReserva(Propiedad p) {
		this.propiedades.add(p);
	}
	
	public Usuario() {
		this.propiedades = new ArrayList<Propiedad>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public List<Propiedad> getPropiedades() {
		return propiedades;
	}

	
	
	
	
}
