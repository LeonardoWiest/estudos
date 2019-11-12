package br.ufes.inf.designpatterns.structural.composite.tabela;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * A tabela.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.14
 */
public class Tabela implements Componente {
	/** Lista de linhas. */
	private List<Componente> linhas = new ArrayList<Componente>();

	/** Construtor. */
	public Tabela() {}

	/** @see br.ufes.inf.designpatterns.structural.composite.tabela.Componente#imprimir() */
	public void imprimir() {}

	/** @see br.ufes.inf.designpatterns.structural.composite.tabela.Componente#getSubComponentes() */
	public Collection<Componente> getSubComponentes() {
		return linhas;
	}

	/** Adiciona uma linha. */
	public void adicionar(Linha l) {
		linhas.add(l);
	}
}
