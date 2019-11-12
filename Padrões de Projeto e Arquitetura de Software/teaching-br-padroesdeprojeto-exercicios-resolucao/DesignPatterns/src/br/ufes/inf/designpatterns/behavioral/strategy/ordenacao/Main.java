package br.ufes.inf.designpatterns.behavioral.strategy.ordenacao;

import java.text.NumberFormat;

/**
 * Classe executável.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.21
 */
public class Main {
	/** Número de termos. */
	private static final int NUM = 100000;

	/** Formatador. */
	private static final NumberFormat format = NumberFormat.getNumberInstance();
	static {
		format.setMaximumFractionDigits(1);
	}

	/** Constrói um vetor. */
	private static double[] construirVetor() {
		double[] d = new double[NUM];
		for (int i = 0; i < d.length; i++)
			d[i] = Math.random() * NUM;
		return d;
	}

	/** Imprime o vetor. */
	private static void imprimirVetor(double a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.print(format.format(a[i]) + "; ");
		System.out.println("\n");
	}

	/** Método principal - executável. */
	public static void main(String[] args) throws Exception {
		long antes, tempo;
		SortStrategy sort;
		double[] bubbleV, mergeV, quickV, insertionV;

		// Constrói quatro versões do mesmo vetor.
		System.out.print("Aguarde: montando vetores (demora um pouco) . . . ");
		bubbleV = construirVetor();
		mergeV = bubbleV.clone();
		quickV = bubbleV.clone();
		insertionV = bubbleV.clone();
		System.out.println("OK!\n");

		// Bubble sort.
		sort = new BubbleSort();
		antes = System.currentTimeMillis();
		sort.sort(bubbleV);
		tempo = System.currentTimeMillis() - antes;
		System.out.println("BubbleSort (" + tempo + " ms).");
		// imprimirVetor(bubbleV);

		// Insertion sort.
		sort = new InsertionSort();
		antes = System.currentTimeMillis();
		sort.sort(insertionV);
		tempo = System.currentTimeMillis() - antes;
		System.out.println("InsertionSort (" + tempo + " ms).");
		// imprimirVetor(insertionV);

		// Merge sort.
		sort = new MergeSort();
		antes = System.currentTimeMillis();
		sort.sort(mergeV);
		tempo = System.currentTimeMillis() - antes;
		System.out.println("MergeSort (" + tempo + " ms).");
		// imprimirVetor(mergeV);

		// Quick sort.
		sort = new QuickSort();
		antes = System.currentTimeMillis();
		sort.sort(quickV);
		tempo = System.currentTimeMillis() - antes;
		System.out.println("QuickSort (" + tempo + " ms).");
		// imprimirVetor(quickV);
	}
}
