package br.ufes.inf.designpatterns.structural.composite.tabela;

import java.util.Collection;

/**
 * Componente da tabela: a tabela em si, linhas ou colunas.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.14
 */
public interface Componente {
	/** Imprime. */
	void imprimir();

	/** Obtém os subcomponentes. */
	Collection<Componente> getSubComponentes();
}
