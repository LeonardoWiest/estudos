package br.ufes.inf.designpatterns.structural.bridge.listas;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementação de lista não ordenada.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.14
 */
public class ListaNaoOrdenada extends Lista {
	/** Coleção não ordenada. */
	private List<String> itens = new ArrayList<String>();

	/** Construtor. */
	public ListaNaoOrdenada(ImpressorLista impressor) {
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
