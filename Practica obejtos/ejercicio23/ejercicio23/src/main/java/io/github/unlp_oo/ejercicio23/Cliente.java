package io.github.unlp_oo.ejercicio23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Cliente extends Persona {

	private List<Pedido> pedidos; 
	
	
	public Cliente(String n, String d) {
		super(n,d);
		this.pedidos = new ArrayList<Pedido>();
		
	}
	

	public void agregarPedido(Pedido p) {
		this.pedidos.add(p);
	}
	
	public Map<String,Integer> getPedidosPorCategoria() {
		
		Map<String,Integer> cantidadPorCategoria = new HashMap<String,Integer>();
		this.pedidos.stream()
				.forEach(pedido -> cantidadPorCategoria.put(
						pedido.getCategoria(),
						pedido.getCantidadProductosCategoria().get(pedido.getCategoria())));
		return cantidadPorCategoria;
	}
	
}
