package br.ufes.inf.designpatterns.structural.composite.tabela;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Linha da tabela.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.14
 */
public class Linha implements Componente {
	/** Lista de células. */
	private List<Componente> celulas = new ArrayList<Componente>();

	/** Construtor. */
	public Linha() {}

	/** @see br.ufes.inf.designpatterns.structural.composite.tabela.Componente#imprimir() */
	public void imprimir() {
		// Imprime a borda lateral.
		System.out.println(" |");

		// Imprime a linha.
		int tamanho = (celulas.size() * 17) + 5;
		char[] linha = new char[tamanho];
		for (int i = 0; i < tamanho; i++)
			linha[i] = '-';
		System.out.println(" " + new String(linha));
	}

	/** @see br.ufes.inf.designpatterns.structural.composite.tabela.Componente#getSubComponentes() */
	public Collection<Componente> getSubComponentes() {
		return celulas;
	}

	/** Adiciona uma célula. */
	public void adicionar(Celula c) {
		celulas.add(c);
	}
}
