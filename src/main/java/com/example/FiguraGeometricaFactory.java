package com.example;

public class FiguraGeometricaFactory {

    private static Circulo circulo;
    private static TrianguloIsosceles trianguloIsosceles;
    private static TrianguloEquilatero trianguloEquilatero;
    private static TrianguloRetangulo trianguloRetangulo;
    private static Quadrado quadrado;

    private static FiguraGeometricaFactory instance;

    private FiguraGeometricaFactory() {
    }

    public static FiguraGeometricaFactory getInstance() {
        if (instance == null) {
            instance = new FiguraGeometricaFactory();
        }
        return instance;
    }

    public Circulo criarCirculo(double raio) {
        if (circulo != null) {
            throw new IllegalStateException("Já foi criado um círculo. Só pode haver um.");
        }
        circulo = new Circulo(raio);
        return circulo;
    }

    public TrianguloIsosceles criarTrianguloIsosceles(double base, double altura) {
        if (trianguloIsosceles != null) {
            throw new IllegalStateException("Já foi criado um triângulo isósceles. Só pode haver um.");
        }
        trianguloIsosceles = new TrianguloIsosceles(base, altura);
        return trianguloIsosceles;
    }

    public TrianguloEquilatero criarTrianguloEquilatero(double lado) {
        if (trianguloEquilatero != null) {
            throw new IllegalStateException("Já foi criado um triângulo equilátero. Só pode haver um.");
        }
        trianguloEquilatero = new TrianguloEquilatero(lado);
        return trianguloEquilatero;
    }

    public TrianguloRetangulo criarTrianguloRetangulo(double base, double altura) {
        if (trianguloRetangulo != null) {
            throw new IllegalStateException("Já foi criado um triângulo retângulo. Só pode haver um.");
        }
        trianguloRetangulo = new TrianguloRetangulo(base, altura);
        return trianguloRetangulo;
    }

    public Quadrado criarQuadrado(double lado) {
        if (quadrado != null) {
            throw new IllegalStateException("Já foi criado um quadrado. Só pode haver um.");
        }
        quadrado = new Quadrado(lado);
        return quadrado;
    }

    public void resetFactory() {
        circulo = null;
        trianguloIsosceles = null;
        trianguloEquilatero = null;
        trianguloRetangulo = null;
        quadrado = null;
    }
}
