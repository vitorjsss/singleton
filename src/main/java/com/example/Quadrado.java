package com.example;

public class Quadrado implements Figura {
    private double lado;

    public Quadrado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("O lado do quadrado deve ser maior que zero.");
        }
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("O lado do quadrado deve ser maior que zero.");
        }
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
