package io.github.unlp_oo.ejercicio23;

import java.util.HashMap;
import java.util.Map;


public class Pedido {
	private Producto producto;
	private int cantidad;
	private FormaDePago formaDePago;
	private TipoDeEnvio envio;
	
	public Pedido(Producto p, int cant, FormaDePago fp, Cliente c,TipoDeEnvio envio) {
		if (p.venderProductos(cant)) {
			this.formaDePago = fp;
			this.cantidad = cant;
			this.producto = p;
			this.envio = envio;
			c.agregarPedido(this);
		}
	}
	
	public Map<String, Integer> getCantidadProductosCategoria() {
		Map<String,Integer> mapa = new HashMap<String,Integer>();
		mapa.put(this.producto.getCategoria(), this.cantidad);
		return mapa;
	}
	
	public String getCategoria() {
		return this.producto.getCategoria();
	}
	
	public double getCostoTotal() {
		return this.cantidad * 
				this.producto.getPrecio() *
				this.formaDePago.calcularAdicional() + this.envio.getAdicionalPorEnvio();
	}
	
	
}
