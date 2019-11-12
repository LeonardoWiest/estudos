package br.ufes.inf.designpatterns.structural.decorator.interceptador;

/**
 * Classe executável.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.14
 */
public class Main {
	/** Método principal - executável. */
	public static void main(String[] args) {
		// log -> verificador-de-minuto -> cronômetro -> componente-concreto
		Componente comp = new InterceptadorLog(new InterceptadorVerificaMinuto(new InterceptadorCronometro(new ComponenteConcreto())));

		comp.executarTarefa();
	}
}
