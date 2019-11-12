package br.ufes.inf.designpatterns.behavioral.observer.janelas;

/**
 * Classe executável.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.21
 */
public class Main {
	/** Método principal - executável. */
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Janela().setVisible(true);
			}
		});
	}
}
