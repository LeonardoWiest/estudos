package br.ufes.inf.designpatterns.behavioral.templatemethod.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Manipulador de Strings abstrato.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.21
 */
public abstract class ManipuladorAbstrato {
	/** Manipula a String. */
	public final void manipularString() throws Exception {
		// Lê a string.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Digite algo: ");
		String string = reader.readLine();

		// Transforma.
		System.out.println("Transformado: " + transformarString(string));
		System.out.println();
	}

	/** Transforma a String, ou seja, efetua a manipulação em si. */
	protected abstract String transformarString(String string);
}
