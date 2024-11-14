package io.github.unlp_oo.ejercicio12;
import java.util.*;

public class Reporte {
	
	private List<Pieza> piezas;
	
	
	
	public void agregarPieza(Pieza p) {
		this.piezas.add(p);
	}
	
	public double volumenDeMaterial(String material) {
		return this.piezas
				.stream().filter(p -> p.getMaterial().equals(material))
				.mapToDouble(p -> p.getVolumen()).sum();
	}
	
	public double superficieDeColor (String color) {
		return this.piezas
				.stream().filter(p -> p.getColor().equals(color))
				.mapToDouble(p -> p.getSuperficie()).sum();
	}
}
