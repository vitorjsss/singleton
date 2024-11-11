package com.example;

public class TrianguloRetangulo implements Figura {
    private double base;
    private double altura;

    public TrianguloRetangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("A base e a altura do triângulo retângulo devem ser maiores que zero.");
        }
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("A base e a altura do triângulo retângulo devem ser maiores que zero.");
        }
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("A base e a altura do triângulo retângulo devem ser maiores que zero.");
        }
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(base * base + altura * altura);
        return base + altura + hipotenusa;
    }
}
