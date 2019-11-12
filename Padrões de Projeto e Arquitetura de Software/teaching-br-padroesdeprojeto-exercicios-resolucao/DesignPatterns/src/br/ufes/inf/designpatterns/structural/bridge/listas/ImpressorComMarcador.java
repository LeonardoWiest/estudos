package br.ufes.inf.designpatterns.structural.bridge.listas;

/**
 * Implementação do impressor da lista que utiliza números.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.14
 */
public class ImpressorComMarcador implements ImpressorLista {
	/** Contagem atual. */
	private char marcador = '-';

	/** Construtor. */
	public ImpressorComMarcador() {}

	/** Construtor. */
	public ImpressorComMarcador(char marcador) {
		this.marcador = marcador;
	}

	/** @see br.ufes.inf.designpatterns.structural.bridge.listas.ImpressorLista#imprimirItem(java.lang.String) */
	public void imprimirItem(String item) {
		System.out.println(marcador + " " + item);
	}
}
