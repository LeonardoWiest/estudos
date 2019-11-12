package br.ufes.inf.designpatterns.structural.composite.tabela;

import java.util.Collection;

/**
 * Célula da tabela.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.14
 */
public class Celula implements Componente {
	/** Conteúdo da célula. */
	private String conteudo;

	/** Construtor. */
	public Celula(String conteudo) {
		this.conteudo = conteudo;
	}

	/** @see br.ufes.inf.designpatterns.structural.composite.tabela.Componente#imprimir() */
	public void imprimir() {
		// Limita o conteúdo a exatamente 15 caracteres.
		conteudo = conteudo + "               ";
		conteudo = conteudo.substring(0, 15);

		// Imprime na mesma linha e com borda lateral.
		System.out.print(" | " + conteudo);
	}

	/** @see br.ufes.inf.designpatterns.structural.composite.tabela.Componente#getSubComponentes() */
	public Collection<Componente> getSubComponentes() {
		return null;
	}
}
