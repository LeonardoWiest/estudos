package br.ufes.inf.designpatterns.behavioral.strategy.ordenacao;

/**
 * BubbleSort.
 * 
 * @author http://www.cs.dartmouth.edu/~farid/teaching/cs15/cs5/lectures/0519/BubbleSort.java
 */
public class BubbleSort implements SortStrategy {
	/** @see br.ufes.inf.designpatterns.behavioral.strategy.ordenacao.SortStrategy#sort(double[]) */
	public void sort(double[] a) {
		bubbleSort(a, a.length);
	}

	public void bubbleSort(double[] a, int n)
	// Precondition: a is array to be sorted of length n
	// Postcondition: The list a[0], a[1], ..., a[n-1] is sorted in increasing order.
	// This version sorts using bubble sort.
	{
		for (int i = n - 1; i > 0; i--) {
			// The next two lines are just for demonstration purposes.
			// Remove them in a real bubble sort implementation.
			// System.out.println("Before iteration for i = " + i + ":");
			// IntIO.writeInts(a, n);

			// Bubble the largest element to the end of a[0], ..., a[i].

			for (int j = 0; j < i; j++)
				if (a[j] > a[j + 1]) {
					double temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
		}
	}
}
