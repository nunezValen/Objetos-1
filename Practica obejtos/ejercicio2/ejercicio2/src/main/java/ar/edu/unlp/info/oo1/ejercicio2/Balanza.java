package ar.edu.unlp.info.oo1.ejercicio2;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	
	
	public Balanza(int cantidadDeProductos, double precioTotal, double pesoTotal) {
		this.cantidadDeProductos = cantidadDeProductos;
		this.precioTotal = precioTotal;
		this.pesoTotal = pesoTotal;
	}

	public Balanza() {
		this.cantidadDeProductos = 0;
		this.pesoTotal = 0;
		this.precioTotal = 0;
	}
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	
	public void agregarProducto (Producto p) {
		this.precioTotal += p.getPrecio();
		this.cantidadDeProductos++;
		this.pesoTotal+=p.getPeso();
	}
	
	public Ticket emitirTicket() {
		
		Ticket ticket = new Ticket(this.precioTotal, this.pesoTotal, this.cantidadDeProductos);
		
		return ticket;
		
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}


	
	
	
}
