package br.ufes.inf.designpatterns.structural.bridge.listas;

/**
 * Interface dos implementadores da impressão da lista na tela, que pode ser numerada, com letras, com marcadores, etc.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.mm.dd
 */
public interface ImpressorLista {
	/** Imprime um item da lista na tela. */
	void imprimirItem(String item);
}
