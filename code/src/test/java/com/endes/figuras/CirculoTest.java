package com.endes.figuras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CirculoTest {
private Circulo circ;
	@BeforeEach
	void setUp() throws Exception {
		//String nombre, String color, double radio, Punto centro
		circ = new Circulo("circ1", "rojo", 1.0, new Punto(1.0, 1.0));
	}
	
	@Test
	void testPerimetro() {
		//fail("Not yet implemented");
		double resultadoEsperado = Math.PI;
		double resultado = circ.perimetro();
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testArea() {
		double resultadoEsperado = 2 * Math.PI;
		double resultado = circ.area();
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	void testTrasladar() {
	    // Trasladar el círculo
	    circ.trasladar(2, 3); // El círculo se traslada por (2, 3)

	    // Verificar las nuevas coordenadas del centro del círculo
	    assertEquals(3.0, circ.getCentro().getX(), 0.0001); // El centro debe moverse a (3, 4)
	    assertEquals(4.0, circ.getCentro().getY(), 0.0001);
	}

}
