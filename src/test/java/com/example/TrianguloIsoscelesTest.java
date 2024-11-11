package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrianguloIsoscelesTest {

    @Test
    public void testCalcularArea() {
        TrianguloIsosceles triangulo = new TrianguloIsosceles(6, 8);
        assertTrue(triangulo.getLado() > triangulo.getBase() / 2, "O lado deve ser maior que a metade da base.");
        assertEquals(22.25, triangulo.calcularArea(), 0.01);
    }

    @Test
    public void testCalcularPerimetro() {
        TrianguloIsosceles triangulo = new TrianguloIsosceles(6, 8);
        assertTrue(triangulo.getLado() > triangulo.getBase() / 2, "O lado deve ser maior que a metade da base.");
        assertEquals(22, triangulo.calcularPerimetro(), 0.01);
    }

    @Test
    public void testSetBaseComValorNegativo() {
        TrianguloIsosceles triangulo = new TrianguloIsosceles(5, 7);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            triangulo.setBase(-1);
        });
        assertEquals("A base deve ser maior que zero.", exception.getMessage());
    }

    @Test
    public void testSetLadoComValorNegativo() {
        TrianguloIsosceles triangulo = new TrianguloIsosceles(5, 7);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            triangulo.setLado(-1);
        });
        assertEquals("O lado deve ser maior que zero.", exception.getMessage());
    }
}
