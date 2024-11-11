package com.example;

public class Main {
    public static void main(String[] args) {
        // Teste da fábrica e criação de figuras geométricas
        FiguraGeometricaFactory factory = FiguraGeometricaFactory.getInstance();

        // Criando um círculo
        Circulo circulo = factory.criarCirculo(5);
        System.out.println("Círculo - Raio: " + circulo.getRaio() + " - Área: " + circulo.calcularArea()
                + " - Perímetro: " + circulo.calcularPerimetro());

        // Criando um quadrado
        Quadrado quadrado = factory.criarQuadrado(4);
        System.out.println("Quadrado - Lado: " + quadrado.getLado() + " - Área: " + quadrado.calcularArea()
                + " - Perímetro: " + quadrado.calcularPerimetro());

        // Criando um triângulo equilátero
        TrianguloEquilatero trianguloEquilatero = factory.criarTrianguloEquilatero(6);
        System.out.println("Triângulo Equilátero - Lado: " + trianguloEquilatero.getLado() + " - Área: "
                + trianguloEquilatero.calcularArea() + " - Perímetro: " + trianguloEquilatero.calcularPerimetro());

        // Criando um triângulo isósceles
        TrianguloIsosceles trianguloIsosceles = factory.criarTrianguloIsosceles(6, 8);
        System.out.println("Triângulo Isósceles - Base: " + trianguloIsosceles.getBase() + " - Lado: "
                + trianguloIsosceles.getLado() + " - Área: " + trianguloIsosceles.calcularArea() + " - Perímetro: "
                + trianguloIsosceles.calcularPerimetro());

        // Criando um triângulo retângulo
        TrianguloRetangulo trianguloRetangulo = factory.criarTrianguloRetangulo(3, 4);
        System.out.println("Triângulo Retângulo - Base: " + trianguloRetangulo.getBase() + " - Altura: "
                + trianguloRetangulo.getAltura() + " - Área: " + trianguloRetangulo.calcularArea() + " - Perímetro: "
                + trianguloRetangulo.calcularPerimetro());
    }
}
