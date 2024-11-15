package ar.edu.unlp.info.oo1.distribuidora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FacturaTest {

	private Usuario usuario;
	private Factura factura;

	@BeforeEach
	public void setUp() {
		usuario = new Usuario("Mercedes", "Calle Sosa 99, San Miguel de Tucuman");
		factura = new Factura(2000, 200, usuario);
	}

	@Test
	public void testInicializar() {
		assertEquals(200, factura.getDescuento());
		assertEquals(2000, factura.getMontoEnergiaActiva());
		assertEquals(factura.getFecha(), LocalDate.now());
		assertEquals(usuario, factura.getUsuario());
	}

	@Test
	public void testMontoTotal() {
		assertEquals(1800, factura.getMontoTotal());
	}

}
