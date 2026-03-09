package com.endes.figuras;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PuntoTest {

	@BeforeEach
	void setUp() throws Exception {
		//X,Y
		Punto punto1 = new Punto(0, 0);
	}

	@Test
	void testDistancia() {
        // Crear dos puntos
        Punto p1 = new Punto(0, 0); // Punto en el origen
        Punto p2 = new Punto(3, 4); // Punto en las coordenadas (3, 4)
        
        // Calcular la distancia entre p1 y p2
        double distanciaCalculada = p1.distancia(p2);
        
        // La distancia esperada es 5 (por el teorema de Pitágoras: √(3² + 4²) = 5)
        double distanciaEsperada = 5.0;
        
        // Asegurarnos de que la distancia calculada es igual a la esperada
        assertEquals(distanciaEsperada, distanciaCalculada, 0.0001); // El tercer parámetro es la tolerancia de error
	}
	
    @Test
    public void testTrasladar() {
        // Crear un punto
        Punto p = new Punto(1, 1); // Punto inicial en (1, 1)
        
        // Trasladar el punto
        p.trasladar(3, 4); // Debe moverse a (1+3, 1+4) = (4, 5)
        
        // Verificar que las nuevas coordenadas son las esperadas
        assertEquals(4.0, p.getX(), 0.0001); // Comprobar coordenada X
        assertEquals(5.0, p.getY(), 0.0001); // Comprobar coordenada Y
    }

}
