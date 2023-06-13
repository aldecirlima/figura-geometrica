package br.com.universidade.calculoarea.model;

import br.com.universidade.calculoarea.abs.FiguraGeometrica;

public class Circulo extends FiguraGeometrica {

	private double raio;

	@Override
	public double getArea() {
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	public String getDescricao() {
		return "Raio do círculo: " + raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}
