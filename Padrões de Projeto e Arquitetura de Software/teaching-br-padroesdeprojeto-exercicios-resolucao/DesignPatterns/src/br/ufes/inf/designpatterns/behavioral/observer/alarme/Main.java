package br.ufes.inf.designpatterns.behavioral.observer.alarme;

/**
 * Classe executável.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.21
 */
public class Main {
	/** Método principal - executável. */
	public static void main(String[] args) {
		// Cria os objetos.
		Sensor[] sensores = new Sensor[10];
		SistemaAlarme sistemaAlarme = new SistemaAlarme();
		DelegaciaPolicia delegaciaPolicia = new DelegaciaPolicia();
		CiaSeguros ciaSeguros = new CiaSeguros();

		// Monta a estrutura de observadores e observáveis.
		for (int i = 0; i < sensores.length; i++) {
			sensores[i] = new Sensor();
			sensores[i].addObserver(sistemaAlarme);
		}
		sistemaAlarme.addObserver(ciaSeguros);
		sistemaAlarme.addObserver(delegaciaPolicia);

		// Dispara um sensor aleatoriamente.
		int num = (int) Math.round(Math.random() * 10);
		sensores[num].disparar();
	}
}
