package br.com.universidade.calculoarea.model;

import br.com.universidade.calculoarea.abs.FiguraGeometrica;

public class Retangulo extends FiguraGeometrica {

	private double base;

	private double altura;

	@Override
	public double getArea() {
		return base * altura;
	}

	@Override
	public String getDescricao() {
		return String.format("Base: %.2f, altura: %.2f.", base, altura);
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
