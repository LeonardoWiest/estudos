package br.ufes.inf.designpatterns.behavioral.strategy.ordenacao;

/**
 * The MergeSort class uses the merge sort algorithm to sort an array of integers into non-decreasing order.
 * 
 * @author http://www.dickinson.edu/~braught/courses/cs132f02/code/MergeSort.src.html
 */
public class MergeSort implements SortStrategy {
	private double[] list;

	/** @see br.ufes.inf.designpatterns.behavioral.strategy.ordenacao.SortStrategy#sort(double[]) */
	public void sort(double[] a) {
		mergeSort(a);
	}

	/**
	 * Recursive helper method which sorts the array referred to by whole using the merge sort algorithm.
	 * 
	 * @param whole
	 *          the array to be sorted.
	 * @return a reference to an array that holds the elements of whole sorted into non-decreasing order.
	 */
	private double[] mergeSort(double[] whole) {
		if (whole.length == 1) {
			return whole;
		}
		else {
			// Create an array to hold the left half of the whole array
			// and copy the left half of whole into the new array.
			double[] left = new double[whole.length / 2];
			System.arraycopy(whole, 0, left, 0, left.length);

			// Create an array to hold the right half of the whole array
			// and copy the right half of whole into the new array.
			double[] right = new double[whole.length - left.length];
			System.arraycopy(whole, left.length, right, 0, right.length);

			// Sort the left and right halves of the array.
			left = mergeSort(left);
			right = mergeSort(right);

			// Merge the results back together.
			merge(left, right, whole);

			return whole;
		}
	}

	/**
	 * Merge the two sorted arrays left and right into the array whole.
	 * 
	 * @param left
	 *          a sorted array.
	 * @param right
	 *          a sorted array.
	 * @param whole
	 *          the array to hold the merged left and right arrays.
	 */
	private void merge(double[] left, double[] right, double[] whole) {
		int leftIndex = 0;
		int rightIndex = 0;
		int wholeIndex = 0;

		// As long as neither the left nor the right array has
		// been used up, keep taking the smaller of left[leftIndex]
		// or right[rightIndex] and adding it at both[bothIndex].
		while (leftIndex < left.length && rightIndex < right.length) {
			if (left[leftIndex] < right[rightIndex]) {
				whole[wholeIndex] = left[leftIndex];
				leftIndex++;
			}
			else {
				whole[wholeIndex] = right[rightIndex];
				rightIndex++;
			}
			wholeIndex++;
		}

		double[] rest;
		int restIndex;
		if (leftIndex >= left.length) {
			// The left array has been use up...
			rest = right;
			restIndex = rightIndex;
		}
		else {
			// The right array has been used up...
			rest = left;
			restIndex = leftIndex;
		}

		// Copy the rest of whichever array (left or right) was
		// not used up.
		for (int i = restIndex; i < rest.length; i++) {
			whole[wholeIndex] = rest[i];
			wholeIndex++;
		}
	}
}
