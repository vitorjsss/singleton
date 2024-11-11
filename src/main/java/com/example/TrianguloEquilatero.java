package com.example;

public class TrianguloEquilatero implements Figura {
    private double lado;

    public TrianguloEquilatero(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("O lado do triângulo equilátero deve ser maior que zero.");
        }
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("O lado do triângulo equilátero deve ser maior que zero.");
        }
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 3 * lado;
    }
}
