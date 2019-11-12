package br.ufes.inf.designpatterns.structural.composite.arquivos;

import java.util.Collection;

/**
 * Arquivo no sistema de arquivos.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.14
 */
public class Arquivo extends Item {
	/** Tamanho. */
	private float tamanho;

	/** Construtor. */
	public Arquivo(String nome, float tamanho) {
		super(nome);
		this.tamanho = tamanho;
	}

	/** @see br.ufes.inf.designpatterns.structural.composite.arquivos.Item#getTamanho() */
	public float getTamanho() {
		return tamanho;
	}

	/** @see br.ufes.inf.designpatterns.structural.composite.arquivos.Item#getChildren() */
	public Collection<Item> getChildren() {
		return null;
	}

}
