package io.github.unlp_oo.ejercicio24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestConductor {

	Usuario conductor;
	
	@BeforeEach
	void setUp() {
		Vehiculo v = new Vehiculo("Fitito", 0, 0, 0, null);
		conductor = new Conductor("Juan", 0, v);
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
