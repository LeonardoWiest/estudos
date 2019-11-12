package br.ufes.inf.designpatterns.behavioral.observer.alarme;

import java.util.Observable;

/**
 * Sensor que é observado pelo sistema de alarme.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.21
 */
public class Sensor extends Observable {
	/** Contador de sensores. */
	private static int contador = 0;

	/** Número do sensor. */
	private int numero = ++contador;

	/** Dispara o sensor. */
	public void disparar() {
		System.out.println("[Sensor " + numero + "] Movimento detectado! Alertando sistema.\n");

		setChanged();
		notifyObservers();
	}

	/** @see java.lang.Object#toString() */
	public String toString() {
		return "sensor #" + numero;
	}
}
