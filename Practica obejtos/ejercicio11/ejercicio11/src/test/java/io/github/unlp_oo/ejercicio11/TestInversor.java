package io.github.unlp_oo.ejercicio11;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestInversor {
	
	Inversor inv;
	
	@BeforeEach
	void setUp () throws Exception{
		inv = new Inversor();
	}
	
	
	@Test
	void testConstructor() {
		assertEquals("", inv.getNombre());
	}
		
	@Test
	void TestValorActual() {
		inv.se
	}
	
}
