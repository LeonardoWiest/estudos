package br.ufes.inf.designpatterns.structural.bridge.refrigerante;

/**
 * Classe executável.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.01
 */
public class Main {
	/** Método principal - executável. */
	public static void main(String[] args) {
		// Coca-cola média.
		AbstracaoTamanho cocaMedia = new TamanhoMedio(new CocaCola());
		cocaMedia.beber();

		// Guaraná pequeno.
		AbstracaoTamanho guaranaPequeno = new TamanhoPequeno(new Guarana());
		guaranaPequeno.beber();

		// Fanta grande.
		AbstracaoTamanho fantaGrande = new TamanhoGrande(new Fanta());
		fantaGrande.beber();
	}
}
