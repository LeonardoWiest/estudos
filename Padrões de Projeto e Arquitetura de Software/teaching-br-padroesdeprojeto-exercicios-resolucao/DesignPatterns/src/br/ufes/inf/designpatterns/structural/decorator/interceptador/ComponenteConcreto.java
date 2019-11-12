package br.ufes.inf.designpatterns.structural.decorator.interceptador;

/**
 * TODO: class description.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.14
 */
public class ComponenteConcreto implements Componente {
	/** @see br.ufes.inf.designpatterns.structural.decorator.interceptador.Componente#executarTarefa() */
	public void executarTarefa() {
		System.out.print("Dormingo 2 segundos... ");

		try {
			Thread.sleep(2000);
		}
		catch (Exception e) {
			System.out.println("Erro!");
			return;
		}

		System.out.println(" OK!");
	}
}
