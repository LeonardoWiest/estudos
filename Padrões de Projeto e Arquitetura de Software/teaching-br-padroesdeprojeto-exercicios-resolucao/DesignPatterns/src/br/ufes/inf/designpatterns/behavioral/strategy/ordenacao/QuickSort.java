package br.ufes.inf.designpatterns.behavioral.strategy.ordenacao;

/**
 * QuickSort.
 * 
 * @author http://www.cs.princeton.edu/introcs/42sort/
 */
public class QuickSort implements SortStrategy {
	/** @see br.ufes.inf.designpatterns.behavioral.strategy.ordenacao.SortStrategy#sort(double[]) */
	public void sort(double[] a) {
		quicksort(a);
	}

	// shuffle the array a
	public void shuffle(double[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			int r = (int) (Math.random() * (i + 1)); // int between 0 and i
			double swap = a[r];
			a[r] = a[i];
			a[i] = swap;
		}
	}

	/****************************************************************************************************************
	 * Quicksort code from Sedgewick 7.1, 7.2.
	 ***************************************************************************************************************/
	public void quicksort(double[] a) {
		shuffle(a); // to guard against worst-case
		quicksort(a, 0, a.length - 1);
	}

	public void quicksort(double[] a, int left, int right) {
		if (right <= left)
			return;
		int i = partition(a, left, right);
		quicksort(a, left, i - 1);
		quicksort(a, i + 1, right);
	}

	public int partition(double[] a, int left, int right) {
		int i = left - 1;
		int j = right;
		while (true) {
			while (a[++i] < a[right]) // find item on left to swap
			; // a[right] acts as sentinel
			while (a[right] < a[--j])
				// find item on right to swap
				if (j == left)
					break; // don't go out-of-bounds
			if (i >= j)
				break; // check if pointers cross
			exch(a, i, j); // swap two elements into place
		}
		exch(a, i, right); // swap with partition element
		return i;
	}

	// exchange a[i] and a[j]
	private void exch(double[] a, int i, int j) {
		double swap = a[i];
		a[i] = a[j];
		a[j] = swap;
	}
}
