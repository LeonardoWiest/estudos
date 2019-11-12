package br.ufes.inf.designpatterns.behavioral.templatemethod.strings;

/**
 * Manipulador que inverte a string.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.21
 */
public class ManipuladorInverter extends ManipuladorAbstrato {
	/** @see br.ufes.inf.designpatterns.behavioral.templatemethod.strings.ManipuladorAbstrato#transformarString(java.lang.String) */
	protected String transformarString(String string) {
		StringBuffer buffer = new StringBuffer(string.length());
		for (int i = string.length(); i > 0; i--)
			buffer.append(string.charAt(i - 1));
		return buffer.toString();
	}
}
