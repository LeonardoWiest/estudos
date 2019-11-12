package br.ufes.inf.designpatterns.behavioral.templatemethod.comparators;

import java.util.Comparator;

/**
 * Comparador de números double.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 2005.07.21
 */
public class NovoComparatorDouble implements Comparator<Double> {
	/** @see java.util.Comparator#compare(T, T) */
	public int compare(Double d1, Double d2) {
		Double d1z = d1 - Math.floor(d1);
		Double d2z = d2 - Math.floor(d2);
		return d1z.compareTo(d2z);
	}
}
