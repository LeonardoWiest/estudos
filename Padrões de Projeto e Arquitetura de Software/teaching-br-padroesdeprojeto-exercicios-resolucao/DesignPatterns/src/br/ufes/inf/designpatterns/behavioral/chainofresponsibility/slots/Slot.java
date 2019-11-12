package br.ufes.inf.designpatterns.behavioral.chainofresponsibility.slots;

/**
 * Slot que recolhe moedas de um determinado valor.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.20
 */
public class Slot {
	/** Valor aceito pelo slot. */
	private int valorAceito;

	/** Próximo slot na cadeia. */
	private Slot proximo;

	/** Valor total das moedas já coletadas. */
	private int valorTotal = 0;

	/** Construtor. */
	public Slot(int valorAceito) {
		this.valorAceito = valorAceito;
	}

	/** Construtor. */
	public Slot(int valorAceito, Slot proximo) {
		this(valorAceito);
		this.proximo = proximo;
	}

	/** Recebe uma moeda. */
	public void receber(Moeda moeda) {
		// Verifica se a moeda cabe neste slot.
		if (moeda.getValor() == valorAceito) {
			// Incrementa o valor total.
			valorTotal += valorAceito;
		}

		// Passa para o próximo slot, se houver.
		else if (proximo != null) {
			proximo.receber(moeda);
		}
	}

	/** Obtém o valor total em toda a cadeia. */
	public int obterValorTotal() {
		return valorTotal + ((proximo == null) ? 0 : proximo.obterValorTotal());
	}
}
