package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CirculoTest {
    @Test
    public void testCalcularArea() {
        Circulo circulo = new Circulo(5);
        assertEquals(78.53981633974483, circulo.calcularArea(), 0.0001);
    }

    @Test
    public void testCalcularPerimetro() {
        Circulo circulo = new Circulo(5);
        assertEquals(31.41592653589793, circulo.calcularPerimetro(), 0.0001);
    }

    @Test
    public void testSetRaioComValorNegativo() {
        Circulo circulo = new Circulo(5);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            circulo.setRaio(-1);
        });

        assertEquals("O raio deve ser maior que zero.", exception.getMessage(),
                "Deve lançar exceção quando o raio for negativo.");
    }

    @Test
    public void testSetRaioComValorZero() {
        Circulo circulo = new Circulo(5);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            circulo.setRaio(0);
        });

        assertEquals("O raio deve ser maior que zero.", exception.getMessage(),
                "Deve lançar exceção quando o raio for zero.");
    }
}
