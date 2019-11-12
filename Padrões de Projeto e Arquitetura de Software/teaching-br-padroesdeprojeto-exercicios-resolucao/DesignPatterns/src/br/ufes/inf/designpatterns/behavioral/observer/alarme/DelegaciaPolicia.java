package br.ufes.inf.designpatterns.behavioral.observer.alarme;

import java.util.Observable;
import java.util.Observer;

/**
 * Delegacia de polícia.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.21
 */
public class DelegaciaPolicia implements Observer {
	/** @see java.util.Observer#update(java.util.Observable, java.lang.Object) */
	public void update(Observable observable, Object param) {
		System.out.println("[DelegaciaPolicia] Alarme disparado!\n");
	}
}
