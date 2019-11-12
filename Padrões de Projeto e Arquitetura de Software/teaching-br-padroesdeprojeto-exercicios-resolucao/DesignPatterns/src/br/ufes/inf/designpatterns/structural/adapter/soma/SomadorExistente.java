package br.ufes.inf.designpatterns.structural.adapter.soma;

import java.util.List;

/**
 * Classe existente, que sabe somar uma lista de inteiros.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.11
 */
public class SomadorExistente {
	/** Soma uma lista de inteiros. */
	public int somaLista(List<Integer> lista) {
		int resultado = 0;
		for (int i : lista)
			resultado += i;
		return resultado;
	}
}
