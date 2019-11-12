package br.ufes.inf.designpatterns.structural.bridge.listas;

/**
 * Implementação do impressor da lista que utiliza números.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.14
 */
public class ImpressorComLetras implements ImpressorLista {
	/** Contagem atual. */
	private char letra = 'a';

	/** @see br.ufes.inf.designpatterns.structural.bridge.listas.ImpressorLista#imprimirItem(java.lang.String) */
	public void imprimirItem(String item) {
		System.out.println((letra++) + ") " + item);
	}
}
