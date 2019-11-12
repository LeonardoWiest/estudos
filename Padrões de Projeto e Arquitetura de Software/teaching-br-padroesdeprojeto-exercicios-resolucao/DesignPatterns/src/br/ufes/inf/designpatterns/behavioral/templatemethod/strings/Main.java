package br.ufes.inf.designpatterns.behavioral.templatemethod.strings;

/**
 * Classe executável.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.21
 */
public class Main {
	/** Método principal - executável. */
	public static void main(String[] args) throws Exception {
		// Manipula de várias formas.
		ManipuladorAbstrato manipulador;

		System.out.println("Transforma em maiúsculo.");
		manipulador = new ManipuladorMaiusculo();
		manipulador.manipularString();

		System.out.println("Transforma em minúsculo.");
		manipulador = new ManipuladorMinusculo();
		manipulador.manipularString();

		System.out.println("Duplica.");
		manipulador = new ManipuladorDuplicar();
		manipulador.manipularString();

		System.out.println("Inverte.");
		manipulador = new ManipuladorInverter();
		manipulador.manipularString();
	}
}
