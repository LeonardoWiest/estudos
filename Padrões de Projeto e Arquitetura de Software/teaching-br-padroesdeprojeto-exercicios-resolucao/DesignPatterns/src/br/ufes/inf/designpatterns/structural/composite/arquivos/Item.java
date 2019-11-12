package br.ufes.inf.designpatterns.structural.composite.arquivos;

import java.util.Collection;

/**
 * Um item do sistema de arquivos. Pode ser uma pasta ou um outro arquivo.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.14
 */
public abstract class Item {
	/** Nome. */
	private String nome;

	/** Construtor. */
	public Item(String nome) {
		this.nome = nome;
	}

	/** Getter for nome. */
	public String getNome() {
		return nome;
	}

	/** Obtém o tamanho. */
	public abstract float getTamanho();

	/** Obtém filhos. */
	public abstract Collection<Item> getChildren();

	/** Imprimir recursivo. */
	public void imprimirRecursivo(String prefixo) {
		// Imprime a si mesmo primeiro.
		System.out.println(prefixo + " " + getNome() + " [" + getTamanho() + " KB]");

		// Adiciona uma tabulação ao prefixo.
		prefixo = "\t" + prefixo;

		// Imprime todos os filhos, se possuir.
		Collection<Item> filhos = getChildren();
		if (filhos != null) {
			for (Item item : filhos) {
				item.imprimirRecursivo(prefixo);
			}
		}
	}
}
