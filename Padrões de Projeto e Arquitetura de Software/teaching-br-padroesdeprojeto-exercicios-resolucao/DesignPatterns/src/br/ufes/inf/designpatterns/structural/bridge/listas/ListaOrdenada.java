package br.ufes.inf.designpatterns.structural.bridge.listas;

import java.util.Set;
import java.util.TreeSet;

/**
 * Implementação de lista ordenada.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.14
 */
public class ListaOrdenada extends Lista {
	/** Coleção ordenada. */
	private Set<String> itens = new TreeSet<String>();

	/** Construtor. */
	public ListaOrdenada(ImpressorLista impressor) {
		super(impressor);
	}

	/** @see br.ufes.inf.designpatterns.structural.bridge.listas.Lista#adicionar(java.lang.String) */
	public void adicionar(String s) {
		itens.add(s);
	}

	/** @see br.ufes.inf.designpatterns.structural.bridge.listas.Lista#imprimir() */
	public void imprimir() {
		for (String s : itens)
			impressor.imprimirItem(s);
	}
}
