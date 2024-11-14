package ar.edu.unlp.info.oo1.ejercicio4;
import java.util.ArrayList;
import java.util.List;
public class Balanza {
	private List<Producto> productos;
	
	
	
	public Balanza(List p, double precioTotal, double pesoTotal) {
		this.productos = p;
	}

	public Balanza() {
		this.productos = new ArrayList();
	}
	
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public void ponerEnCero() {
		this.productos.clear();
	}
	
	public void agregarProducto (Producto p) {
		this.productos.add(p);
	}
	
	public List <Producto> getProductos(){
		return this.productos;
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(this.getPrecioTotal(),this.getPesoTotal(),this.getCantidadDeProductos());
		return ticket;
	}

	public int getCantidadDeProductos() {
		return this.productos.size();
	}

	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(p -> p.getPrecio()).sum();
	}

	public double getPesoTotal() {
		return this.productos.stream().mapToDouble(p -> p.getPeso()).sum();
	}


	
	
	
}
