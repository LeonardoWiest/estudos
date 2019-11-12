package br.ufes.inf.designpatterns.behavioral.chainofresponsibility.slots;

/**
 * Classe executável.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.20
 */
public class Main {

	/** Método principal - executável. */
	public static void main(String[] args) {
		// Sequência de moedas.
		Moeda[] moedas = new Moeda[] { new Moeda(25), new Moeda(10), new Moeda(50), new Moeda(5), new Moeda(100), new Moeda(10), new Moeda(10), new Moeda(50), new Moeda(25), new Moeda(25), new Moeda(100) };

		// Cadeia de slots.
		Slot cadeia = new Slot(1, new Slot(5, new Slot(10, new Slot(25, new Slot(50, new Slot(100))))));

		// Simulando a compra de um refrigerante que custa $ 1,00.
		for (int i = 0; cadeia.obterValorTotal() < 100; i++) {
			System.out.println("Colocou moeda de " + moedas[i].getValor() + " centavos...");
			cadeia.receber(moedas[i]);
		}
		int troco = cadeia.obterValorTotal() - 100;
		System.out.println("Recebeu um refrigerante ($ 1,00). Seu troco: " + troco + " centavos.");
		System.out.println();

		// Nova cadeia de slots.
		cadeia = new Slot(1, new Slot(5, new Slot(10, new Slot(25, new Slot(50, new Slot(100))))));

		// Simulando a compra de um salgadinho que custa $ 2,50.
		for (int i = 0; cadeia.obterValorTotal() < 250; i++) {
			System.out.println("Colocou moeda de " + moedas[i].getValor() + " centavos...");
			cadeia.receber(moedas[i]);
		}
		troco = cadeia.obterValorTotal() - 250;
		System.out.println("Recebeu um chips ($ 2,50). Seu troco: " + troco + " centavos.");
	}
}
