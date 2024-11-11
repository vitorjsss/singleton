package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadradoTest {
    @Test
    public void testCalcularArea() {
        Quadrado quadrado = new Quadrado(4);
        assertEquals(16, quadrado.calcularArea());
    }

    @Test
    public void testCalcularPerimetro() {
        Quadrado quadrado = new Quadrado(4);
        assertEquals(16, quadrado.calcularPerimetro());
    }

    @Test
    public void testSetLadoComValorNegativo() {
        Quadrado quadrado = new Quadrado(4);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            quadrado.setLado(-1);
        });

        assertEquals("O lado do quadrado deve ser maior que zero.", exception.getMessage(),
                "Deve lançar exceção quando o lado for negativo.");
    }

    @Test
    public void testSetLadoComValorZero() {
        Quadrado quadrado = new Quadrado(4);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            quadrado.setLado(0);
        });

        assertEquals("O lado do quadrado deve ser maior que zero.", exception.getMessage(),
                "Deve lançar exceção quando o lado for zero.");
    }
}
