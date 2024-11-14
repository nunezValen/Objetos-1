package io.github.unlp_oo.ejercicio15;
import java.util.*;

public class Usuario {
	private String nombre;
	private String domicilio;
	private List<Consumo> consumos;

	public Usuario() {
		this.nombre = "";
		this.domicilio = "";
		this.consumos = new ArrayList<Consumo> ();
	}
	
	public void agregarConsumo(Consumo c) {
		this.consumos.add(c);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public Factura getFactura() {
		Factura f = new Factura (this, this.consumos.get(this.consumos.size()));
		return f;
	}
	
	public List<Consumo> getConsumos(){
		return this.consumos;
	}
	
}
