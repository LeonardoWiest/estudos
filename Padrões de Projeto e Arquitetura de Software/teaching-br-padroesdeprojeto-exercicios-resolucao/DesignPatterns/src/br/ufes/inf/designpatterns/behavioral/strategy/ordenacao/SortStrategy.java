package br.ufes.inf.designpatterns.behavioral.strategy.ordenacao;

/**
 * Estratégia de ordenação.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.21
 */
public interface SortStrategy {
	/** Ordena um vetor de doubles. */
	void sort(double[] a);
}
