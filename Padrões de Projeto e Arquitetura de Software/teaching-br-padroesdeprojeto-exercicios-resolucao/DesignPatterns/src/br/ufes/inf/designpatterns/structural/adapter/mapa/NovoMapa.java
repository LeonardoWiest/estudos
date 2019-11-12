package br.ufes.inf.designpatterns.structural.adapter.mapa;

import java.util.HashMap;

/**
 * Adapter de classe que provê um novo construtor para HashMap.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.11
 */
public class NovoMapa extends HashMap {
	/** Construtor. */
	public NovoMapa(Object[][] pares) {
		// O vetor de pares deve ter duas linhas.
		if (pares.length != 2)
			throw new IllegalArgumentException();

		// Obtém vetores representando as colunas.
		Object[] chaves = pares[0];
		Object[] colunas = pares[1];

		// Monta o mapa.
		for (int i = 0; i < chaves.length; i++)
			put(chaves[i], colunas[i]);
	}
}
