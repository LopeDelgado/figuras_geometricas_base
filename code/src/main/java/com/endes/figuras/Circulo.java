package com.endes.figuras;

public class Circulo extends FiguraGeometrica {
	double radio;
	private Punto centro;

public Circulo (String nombre, String color, double radio, Punto centro) {
	super(nombre, color);
	this.radio = radio; 
	this.centro = centro;
}

public Punto getCentro() {
	return centro;
}

public double perimetro() {
	return radio * radio * Math.PI;
}
public double area() {
	return 2 * Math.PI * radio;
}

public void rotar(double angulo) {
//	centro.rotar(angulo);
}

@Override
public void trasladar(double dx, double dy) {
    centro.trasladar(dx, dy);
}
}
