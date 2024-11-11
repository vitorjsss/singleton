package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrianguloRetanguloTest {
    @Test
    public void testCalcularArea() {
        TrianguloRetangulo triangulo = new TrianguloRetangulo(3, 4);
        assertEquals(6, triangulo.calcularArea());
    }

    @Test
    public void testCalcularPerimetro() {
        TrianguloRetangulo triangulo = new TrianguloRetangulo(3, 4);
        assertEquals(12, triangulo.calcularPerimetro());
    }

    @Test
    public void testSetBaseComValorNegativo() {
        TrianguloRetangulo triangulo = new TrianguloRetangulo(3, 4);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            triangulo.setBase(-1);
        });

        assertEquals("A base e a altura do triângulo retângulo devem ser maiores que zero.", exception.getMessage(),
                "Deve lançar exceção quando a base for negativa.");
    }

    @Test
    public void testSetAlturaComValorNegativo() {
        TrianguloRetangulo triangulo = new TrianguloRetangulo(3, 4);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            triangulo.setAltura(-1);
        });

        assertEquals("A base e a altura do triângulo retângulo devem ser maiores que zero.", exception.getMessage(),
                "Deve lançar exceção quando a altura for negativa.");
    }
}
