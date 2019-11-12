package br.ufes.inf.designpatterns.structural.composite.arquivos;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Pasta no sistema de arquivos.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.14
 */
public class Pasta extends Item {
	/** Filhos. */
	private Set<Item> itens = new HashSet<Item>();

	/** Construtor. */
	public Pasta(String nome) {
		super(nome);
	}

	/** @see br.ufes.inf.designpatterns.structural.composite.arquivos.Item#getTamanho() */
	public float getTamanho() {
		float tamanho = 0;
		for (Item item : itens)
			tamanho += item.getTamanho();
		return tamanho;
	}

	/** @see br.ufes.inf.designpatterns.structural.composite.arquivos.Item#getChildren() */
	public Collection<Item> getChildren() {
		return itens;
	}

	/** Adiciona um item à pasta. */
	public void adicionar(Item item) {
		itens.add(item);
	}
}
