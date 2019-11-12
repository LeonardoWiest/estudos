package br.ufes.inf.designpatterns.behavioral.templatemethod.comparators;

import java.util.Arrays;

/**
 * Classe executável.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.21
 */
public class Main {
	/** Número de termos. */
	private static final int NUM = 10;

	/** Constrói um vetor. */
	private static Double[] construirVetor() {
		Double[] d = new Double[NUM];
		for (int i = 0; i < d.length; i++)
			d[i] = Math.random() * NUM;
		return d;
	}

	/** Método principal - executável. */
	public static void main(String[] args) throws Exception {
		// Constrói o vetor.
		Double[] v = construirVetor();

		// Ordena o vetor.
		Arrays.sort(v, new NovoComparatorDouble());

		// Imprime o vetor.
		System.out.println(Arrays.toString(v));
	}
}
