package io.github.unlp_oo.ejercicio12;

public abstract class Pieza {
	private String material;
	private String color;
	
	public Pieza () {
		this.material = "";
		this.color = "";
	}
	
	public abstract double getVolumen();
	public abstract double getSuperficie();
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
