package ar.edu.unlp.info.oo1.ejercicio3;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class Presupuesto {
	private java.time.LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto() {
		this.cliente = "";
		this.fecha = LocalDate.now();
		this.items = new ArrayList<Item>();
	}
	public Presupuesto(String cli) {
		this.cliente = cli;
		this.fecha = LocalDate.now();
		this.items = new ArrayList<Item>();
	}
	
	
	public void agregarItem (Item i) {
		this.items.add(i);
	}
	
	public double calcularTotal() {
		return this.items.stream().mapToDouble(item -> item.costo()).sum();
		/* otra resolucion sin streams
		 *  double total = 0;
    		Iterator<Item> iterator = this.items.iterator();
    
    		while (iterator.hasNext()) {
        	Item item = iterator.next();
        	total += item.costo();
		 * 
		 */
	}

	public java.time.LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(java.time.LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
	
}
