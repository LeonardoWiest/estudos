package br.ufes.inf.designpatterns.behavioral.chainofresponsibility.sleep;

/**
 * Classe executável.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.20
 */
public class Main {
	/** Método principal - executável. */
	public static void main(String[] args) throws Exception {
		// Cria 15 handlers em cadeia.
		Handler handler = new Handler();
		for (int i = 0; i < 14; i++)
			handler = new Handler(handler);

		// Envia 30 requisições.
		for (int i = 1; i <= 30; i++) {
			System.out.println("Enviando requsição " + i);
			handler.handleRequest(i);
			Thread.sleep(15);
		}
	}
}
