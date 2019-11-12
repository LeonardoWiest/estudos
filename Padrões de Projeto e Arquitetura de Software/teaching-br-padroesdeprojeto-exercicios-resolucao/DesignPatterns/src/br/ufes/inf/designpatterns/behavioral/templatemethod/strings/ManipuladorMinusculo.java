package br.ufes.inf.designpatterns.behavioral.templatemethod.strings;

/**
 * Manipulador que transforma tudo em minúsculo.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.21
 */
public class ManipuladorMinusculo extends ManipuladorAbstrato {
	/** @see br.ufes.inf.designpatterns.behavioral.templatemethod.strings.ManipuladorAbstrato#transformarString(java.lang.String) */
	protected String transformarString(String string) {
		return string.toLowerCase();
	}
}
