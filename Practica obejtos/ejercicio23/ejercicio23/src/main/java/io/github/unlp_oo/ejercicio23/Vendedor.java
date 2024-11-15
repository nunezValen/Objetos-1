package io.github.unlp_oo.ejercicio23;
import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona {

	private List<Producto> productos;
	
	public Vendedor(String n, String d) {
		super(n, d);
		this.productos = new ArrayList<Producto>();
		// TODO Auto-generated constructor stub
	}
	
	public void agregarProducto(Producto p) {
		this.productos.add(p);
	}
	

}
