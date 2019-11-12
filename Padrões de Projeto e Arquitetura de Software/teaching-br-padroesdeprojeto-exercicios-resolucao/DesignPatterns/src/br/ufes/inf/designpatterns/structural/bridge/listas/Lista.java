package br.ufes.inf.designpatterns.structural.bridge.listas;

/**
 * Interface da hierarquia de abstração, que define uma lista.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.14
 */
public abstract class Lista {
	/** Implementador da impressão. */
	protected ImpressorLista impressor;

	/** Construtor. */
	public Lista(ImpressorLista impressor) {
		this.impressor = impressor;
	}

	/** Adiciona uma String à lista. */
	public abstract void adicionar(String s);

	/** Imprime a lista. */
	public abstract void imprimir();
}
