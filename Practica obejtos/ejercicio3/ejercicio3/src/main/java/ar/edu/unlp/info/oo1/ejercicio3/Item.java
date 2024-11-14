package ar.edu.unlp.info.oo1.ejercicio3;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	
	public Item () {
		this.detalle = "";
		this.cantidad = 0;
		this.costoUnitario = 0;
	}
	

	public Item  (String d, int c, double cu) {
		this.cantidad = c;
		this.costoUnitario = cu;
		this.detalle = d;
	}
	
	public double costo() {
		return (this.cantidad * this.costoUnitario);
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
	
	
	
}
