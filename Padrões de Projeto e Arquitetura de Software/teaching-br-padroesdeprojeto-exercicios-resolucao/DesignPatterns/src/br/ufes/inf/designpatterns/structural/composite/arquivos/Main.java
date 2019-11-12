package br.ufes.inf.designpatterns.structural.composite.arquivos;

/**
 * Classe executável.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.14
 */
public class Main {
	/** Método principal - executável. */
	public static void main(String[] args) {
		Pasta A = new Pasta("Programas");
		Pasta A1 = new Pasta("Java");
		A.adicionar(A1);
		Pasta A2 = new Pasta("NetBeans");
		A.adicionar(A2);
		Pasta A3 = new Pasta("Eclipse");
		A.adicionar(A3);

		Pasta B = new Pasta("Documentos");
		Pasta B1 = new Pasta("Pós Java");
		B.adicionar(B1);
		Pasta B2 = new Pasta("Serviço");
		B.adicionar(B2);

		Pasta C = new Pasta("Lixeira");

		A1.adicionar(new Arquivo("javac.exe", 49f));
		A1.adicionar(new Arquivo("java.exe", 49f));
		A1.adicionar(new Arquivo("src.zip", 17631f));

		A2.adicionar(new Arquivo("netbeans.exe", 44f));
		A2.adicionar(new Arquivo("build_info", 1f));

		A3.adicionar(new Arquivo("eclipse.exe", 108f));
		A3.adicionar(new Arquivo("startup.jar", 31f));

		B1.adicionar(new Arquivo("DesignPatterns.pdf", 1635f));
		B1.adicionar(new Arquivo("slide1.pdf", 202f));

		B2.adicionar(new Arquivo("ProjetoAtrasado.doc", 1000f));

		// Imprime tudo.
		Pasta raiz = new Pasta("Raiz");
		raiz.adicionar(A);
		raiz.adicionar(B);
		raiz.adicionar(C);
		raiz.imprimirRecursivo("-");
	}
}
