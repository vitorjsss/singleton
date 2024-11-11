package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrianguloEquilateroTest {
    @Test
    public void testCalcularArea() {
        TrianguloEquilatero triangulo = new TrianguloEquilatero(6);
        assertEquals(15.588457268119896, triangulo.calcularArea(), 0.0001);
    }

    @Test
    public void testCalcularPerimetro() {
        TrianguloEquilatero triangulo = new TrianguloEquilatero(6);
        assertEquals(18, triangulo.calcularPerimetro());
    }

    @Test
    public void testSetLadoComValorNegativo() {
        TrianguloEquilatero triangulo = new TrianguloEquilatero(5);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            triangulo.setLado(-1);
        });

        assertEquals("O lado do triângulo equilátero deve ser maior que zero.", exception.getMessage(),
                "Deve lançar exceção quando o lado for negativo.");
    }

    @Test
    public void testSetLadoComValorZero() {
        TrianguloEquilatero triangulo = new TrianguloEquilatero(5);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            triangulo.setLado(0);
        });

        assertEquals("O lado do triângulo equilátero deve ser maior que zero.", exception.getMessage(),
                "Deve lançar exceção quando o lado for zero.");
    }
}
