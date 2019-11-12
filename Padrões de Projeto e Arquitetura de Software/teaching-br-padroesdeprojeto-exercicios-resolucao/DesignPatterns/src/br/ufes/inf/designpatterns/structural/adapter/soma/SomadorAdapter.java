package br.ufes.inf.designpatterns.structural.adapter.soma;

import java.util.ArrayList;
import java.util.List;

/**
 * Adapter de objeto para adaptar o somador existe ao somador esperado.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.mm.dd
 */
public class SomadorAdapter implements SomadorEsperado {
	/** Somador existente. */
	private static SomadorExistente somador = new SomadorExistente();

	/** @see br.ufes.inf.designpatterns.structural.adapter.soma.SomadorEsperado#somaVetor(int[]) */
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < vetor.length; i++)
			lista.add(vetor[i]);
		return somador.somaLista(lista);
	}
}
