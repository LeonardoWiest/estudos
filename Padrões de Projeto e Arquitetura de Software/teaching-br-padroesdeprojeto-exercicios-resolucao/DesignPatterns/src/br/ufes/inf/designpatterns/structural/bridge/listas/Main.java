package br.ufes.inf.designpatterns.structural.bridge.listas;

/**
 * Classe executável.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.01
 */
public class Main {
	/** Método principal - executável. */
	public static void main(String[] args) {
		// Lista ordenada e numerada.
		Lista lista = new ListaOrdenada(new ImpressorComNumeros());
		lista.adicionar("Letra C");
		lista.adicionar("Letra B");
		lista.adicionar("Letra D");
		lista.adicionar("Letra A");
		lista.imprimir();

		System.out.println();

		// Lista não-ordenada com letras.
		lista = new ListaNaoOrdenada(new ImpressorComLetras());
		lista.adicionar("Um");
		lista.adicionar("Dois");
		lista.adicionar("Três");
		lista.adicionar("Quatro");
		lista.imprimir();

		System.out.println();

		// Lista ordenada com marcador "*";
		lista = new ListaOrdenada(new ImpressorComMarcador('*'));
		lista.adicionar("Prototype");
		lista.adicionar("Abstract Factory");
		lista.adicionar("Factory Method");
		lista.adicionar("Builder");
		lista.adicionar("Singleton");
		lista.imprimir();

		System.out.println();

		// Lista não-ordenada com marcador padrão.
		lista = new ListaNaoOrdenada(new ImpressorComMarcador());
		lista.adicionar("Proxy");
		lista.adicionar("Flyweight");
		lista.adicionar("Façade");
		lista.adicionar("Decorator");
		lista.adicionar("Composite");
		lista.adicionar("Bridge");
		lista.adicionar("Adapter");
		lista.imprimir();
	}
}
