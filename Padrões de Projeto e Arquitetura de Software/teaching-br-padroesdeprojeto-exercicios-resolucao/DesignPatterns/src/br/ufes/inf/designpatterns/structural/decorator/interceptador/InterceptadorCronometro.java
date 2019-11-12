package br.ufes.inf.designpatterns.structural.decorator.interceptador;

/**
 * Interceptador cronômetro.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.14
 */
public class InterceptadorCronometro implements Componente {
	/** Componente. */
	private Componente componente;

	/** Construtor. */
	public InterceptadorCronometro(Componente componente) {
		this.componente = componente;
	}

	/** @see br.ufes.inf.designpatterns.structural.decorator.interceptador.Componente#executarTarefa() */
	public void executarTarefa() {
		long antes = System.currentTimeMillis();
		componente.executarTarefa();
		long depois = System.currentTimeMillis();
		System.out.println("[CRN] " + (depois - antes) + " ms");
	}
}
