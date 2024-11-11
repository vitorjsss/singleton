package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FiguraGeometricaFactoryTest {

    private FiguraGeometricaFactory factory;

    @BeforeEach
    public void setUp() {
        factory = FiguraGeometricaFactory.getInstance();
    }

    @AfterEach
    public void tearDown() {
        factory.resetFactory();
    }

    @Test
    public void testCriacaoDeCirculoUnico() {
        Circulo circulo1 = factory.criarCirculo(5);
        assertNotNull(circulo1);
    }

    @Test
    public void testTentativaDeCriarOutroCirculo() {
        factory.criarCirculo(5);

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            factory.criarCirculo(10);
        });

        assertEquals("Já foi criado um círculo. Só pode haver um.", exception.getMessage());
    }

    @Test
    public void testCriacaoDeTrianguloIsoscelesUnico() {
        TrianguloIsosceles triangulo1 = factory.criarTrianguloIsosceles(5, 7);
        assertNotNull(triangulo1);
    }

    @Test
    public void testTentativaDeCriarOutroTrianguloIsosceles() {
        factory.criarTrianguloIsosceles(5, 7);

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            factory.criarTrianguloIsosceles(6, 8);
        });

        assertEquals("Já foi criado um triângulo isósceles. Só pode haver um.", exception.getMessage());
    }

    @Test
    public void testCriacaoDeTrianguloEquilateroUnico() {
        TrianguloEquilatero triangulo1 = factory.criarTrianguloEquilatero(5);
        assertNotNull(triangulo1);
    }

    @Test
    public void testTentativaDeCriarOutroTrianguloEquilatero() {
        factory.criarTrianguloEquilatero(5);

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            factory.criarTrianguloEquilatero(6);
        });

        assertEquals("Já foi criado um triângulo equilátero. Só pode haver um.", exception.getMessage());
    }

    @Test
    public void testCriacaoDeTrianguloRetanguloUnico() {
        TrianguloRetangulo triangulo1 = factory.criarTrianguloRetangulo(3, 4);
        assertNotNull(triangulo1);
    }

    @Test
    public void testTentativaDeCriarOutroTrianguloRetangulo() {
        factory.criarTrianguloRetangulo(3, 4);

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            factory.criarTrianguloRetangulo(6, 8);
        });

        assertEquals("Já foi criado um triângulo retângulo. Só pode haver um.", exception.getMessage());
    }

    @Test
    public void testCriacaoDeQuadradoUnico() {
        Quadrado quadrado1 = factory.criarQuadrado(4);
        assertNotNull(quadrado1);
    }

    @Test
    public void testTentativaDeCriarOutroQuadrado() {
        factory.criarQuadrado(4);

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            factory.criarQuadrado(5);
        });

        assertEquals("Já foi criado um quadrado. Só pode haver um.", exception.getMessage());
    }
}
