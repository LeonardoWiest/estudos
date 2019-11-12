package br.ufes.inf.designpatterns.structural.bridge.listas;

/**
 * Implementação do impressor da lista que utiliza números.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.14
 */
public class ImpressorComNumeros implements ImpressorLista {
	/** Contagem atual. */
	private int numero = 1;

	/** @see br.ufes.inf.designpatterns.structural.bridge.listas.ImpressorLista#imprimirItem(java.lang.String) */
	public void imprimirItem(String item) {
		System.out.println((numero++) + ". " + item);
	}
}
