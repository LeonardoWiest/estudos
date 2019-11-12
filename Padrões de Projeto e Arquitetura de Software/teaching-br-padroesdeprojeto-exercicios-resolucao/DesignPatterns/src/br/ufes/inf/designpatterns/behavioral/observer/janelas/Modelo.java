package br.ufes.inf.designpatterns.behavioral.observer.janelas;

import java.util.Observable;

/**
 * Modelo único para todos os componentes gráficos.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.21
 */
public class Modelo extends Observable {
	/** Valor do modelo. */
	private int valor;

	/** Getter for valor. */
	public int getValor() {
		return valor;
	}

	/** Setter for valor. */
	public void setValor(int valor) {
		if (this.valor != valor)
			setChanged();

		this.valor = valor;

		notifyObservers();
	}
}
