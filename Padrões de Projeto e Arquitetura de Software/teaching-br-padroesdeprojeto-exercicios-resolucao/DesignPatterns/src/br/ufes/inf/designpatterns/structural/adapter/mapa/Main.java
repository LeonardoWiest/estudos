package br.ufes.inf.designpatterns.structural.adapter.mapa;

import java.util.Iterator;
import java.util.Map;

/**
 * Classe executável.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.01
 */
public class Main {
	/** Método principal - executável. */
	public static void main(String[] args) {
		// Cria os pares em uma matriz.
		Object[][] pares = new String[][] { { "Sun", "IBM", "FSF", "Berkley", "Microsoft", "Apple" }, { "Solaris", "OS/2", "GNU/Linux", "BSD", "Windows", "MacOS" } };

		// Cria um novo mapa com a matriz.
		Map mapa = new NovoMapa(pares);

		// Imprime os valores.
		for (Iterator iter = mapa.entrySet().iterator(); iter.hasNext();) {
			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
	}
}
