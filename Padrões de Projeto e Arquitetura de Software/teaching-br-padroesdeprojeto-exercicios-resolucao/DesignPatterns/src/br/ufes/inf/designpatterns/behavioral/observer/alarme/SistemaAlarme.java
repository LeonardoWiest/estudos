package br.ufes.inf.designpatterns.behavioral.observer.alarme;

import java.util.Observable;
import java.util.Observer;

/**
 * Sistema de alarme.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.21
 */
public class SistemaAlarme extends Observable implements Observer {
	/** @see java.util.Observer#update(java.util.Observable, java.lang.Object) */
	public void update(Observable observable, Object param) {
		// Algum sensor disparou.
		System.out.println("[SistemaAlarme] Movimento detectado no " + observable);
		System.out.println("[SistemaAlarme] Disparar alarme!\n");

		setChanged();
		notifyObservers();
	}
}
