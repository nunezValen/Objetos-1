package io.github.unlp_oo.ejercicio11;
import java.util.*;
public class Inversor {
	private String nombre;
	List <Inversion> inversiones;
	
	public Inversor() {
		this.nombre = "";
		this.inversiones = new ArrayList<Inversion>();
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public List<Inversion> getInversiones() {
		return inversiones;
	}

	public void setInversiones(List<Inversion> inversiones) {
		this.inversiones = inversiones;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarInversion(Inversion i) {
		this.inversiones.add(i);
	}
	
	public double valorActual() {
		return this.inversiones.stream().mapToDouble(i -> i.calcularValor()).sum();
	}
	
}
