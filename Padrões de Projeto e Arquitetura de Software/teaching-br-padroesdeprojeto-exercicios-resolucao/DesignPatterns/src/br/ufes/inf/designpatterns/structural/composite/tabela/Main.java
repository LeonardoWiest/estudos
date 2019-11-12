package br.ufes.inf.designpatterns.structural.composite.tabela;

import java.util.Collection;

/**
 * Classe executável.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.14
 */
public class Main {
	/** Imprime recursivamente os componentes. */
	public static void imprimirRecursivo(Componente c) {
		// Imprime os filhos se tiver.
		Collection<Componente> filhos = c.getSubComponentes();
		if (filhos != null)
			for (Componente f : filhos)
				imprimirRecursivo(f);

		// Imprime o componente.
		c.imprimir();
	}

	/** Método principal - executável. */
	public static void main(String[] args) {
		// Constrói uma tabela.
		Tabela tabela = new Tabela();

		Linha linha = new Linha();
		linha.adicionar(new Celula(""));
		linha.adicionar(new Celula("Criação"));
		linha.adicionar(new Celula("Estrutura"));
		linha.adicionar(new Celula("Comportamento"));
		tabela.adicionar(linha);

		linha = new Linha();
		linha.adicionar(new Celula("Classe"));
		linha.adicionar(new Celula("Factory Method"));
		linha.adicionar(new Celula("Adapter"));
		linha.adicionar(new Celula("Interpreter"));
		tabela.adicionar(linha);

		linha = new Linha();
		linha.adicionar(new Celula(""));
		linha.adicionar(new Celula(""));
		linha.adicionar(new Celula(""));
		linha.adicionar(new Celula("Template Method"));
		tabela.adicionar(linha);

		linha = new Linha();
		linha.adicionar(new Celula("Objeto"));
		linha.adicionar(new Celula(". . ."));
		linha.adicionar(new Celula(". . . "));
		linha.adicionar(new Celula(". . . "));
		tabela.adicionar(linha);

		// Imprime os componentes.
		imprimirRecursivo(tabela);
	}
}
