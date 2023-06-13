package br.com.universidade.calculoarea.main;

import java.util.ArrayList;
import java.util.List;

import br.com.universidade.calculoarea.abs.FiguraGeometrica;
import br.com.universidade.calculoarea.model.Circulo;
import br.com.universidade.calculoarea.model.Retangulo;
import br.com.universidade.calculoarea.model.Triangulo;

public class Main {

	public static void main(String[] args) {

		Retangulo retangulo = new Retangulo();
		retangulo.setNome("Retângulo");
		retangulo.setBase(9.1);
		retangulo.setAltura(5.2);

		Triangulo triangulo = new Triangulo();
		triangulo.setNome("Triângulo");
		triangulo.setBase(4.5);
		triangulo.setAltura(3.9);

		Circulo circulo = new Circulo();
		circulo.setNome("Circulo");
		circulo.setRaio(2.5);

		// Adiciona as figuras geometricas em uma lista
		List<FiguraGeometrica> listaFigurasGeometricas = new ArrayList<>();
		listaFigurasGeometricas.add(retangulo);
		listaFigurasGeometricas.add(triangulo);
		listaFigurasGeometricas.add(circulo);

		// Mostra dados das figuras geometricas
		for (FiguraGeometrica figuraGeometrica : listaFigurasGeometricas) {
			System.out.println(figuraGeometrica.getDescricao());
			System.out.printf("Area da figura: %.2f \n", figuraGeometrica.getArea());
		}

	}

}
