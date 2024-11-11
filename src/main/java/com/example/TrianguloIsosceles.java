package com.example;

public class TrianguloIsosceles implements Figura {
    private double base;
    private double lado;

    public TrianguloIsosceles(double base, double lado) {
        if (base <= 0 || lado <= 0) {
            throw new IllegalArgumentException("A base e os lados devem ser maiores que zero.");
        }
        this.base = base;
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("A base deve ser maior que zero.");
        }
        this.base = base;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("O lado deve ser maior que zero.");
        }
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double altura = Math.sqrt(lado * lado - (base * base) / 4);
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * lado + base;
    }
}
