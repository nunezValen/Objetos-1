package ar.edu.unlp.info.oo1.ejercicio4;
import java.time.LocalDate;
public class Ticket {
	private java.time.LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	public Ticket (double precio, double peso, int cantidadProductos) {
		this.precioTotal=precio;
		this.pesoTotal=peso;
		this.cantidadDeProductos=cantidadProductos;
		this.fecha = LocalDate.now();
	}
	
	public double impuesto() {
		return this.precioTotal * 0.21;
	}

	public java.time.LocalDate getFecha() {
		return fecha;
	}

	

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	

	public double getPesoTotal() {
		return pesoTotal;
	}

	

	public double getPrecioTotal() {
		return precioTotal;
	}


	
	
	
}
