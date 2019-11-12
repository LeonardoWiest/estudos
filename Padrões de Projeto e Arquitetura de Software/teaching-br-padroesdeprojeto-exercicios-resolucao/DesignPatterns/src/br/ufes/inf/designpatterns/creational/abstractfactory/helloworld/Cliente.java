package br.ufes.inf.designpatterns.creational.abstractfactory.helloworld;

/**
 * Cliente da fábrica abstrata. Cria uma das fábricas concretas aleatoriamente e envia o "Hello, World!".
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.01
 */
public class Cliente {
	/** Fábrica abstrata de impressores. */
	private FabricaAbstrata fabrica;

	/** Construtor. */
	public Cliente() {
		// Gera um número aleatório entre 0 e 1.
		double rand = Math.random();

		// Se o número for menor que 0,5, usa o console. Caso contrário usa o arquivo.
		if (rand <= 0.5)
			fabrica = new FabricaConcretaConsole();
		else fabrica = new FabricaConcretaArquivo();
	}

	/** Cria um impressor e envia o "Hello, World!". */
	public void enviarHelloWorld() {
		Impressor impressor = fabrica.criarImpressor();
		System.out.println("Utilizando " + impressor.getClass().getSimpleName());
		impressor.imprimir("Hello, World!");
	}
}
