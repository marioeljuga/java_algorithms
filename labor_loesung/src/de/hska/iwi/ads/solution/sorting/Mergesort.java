package de.hska.iwi.ads.solution.sorting;

public class Mergesort<E extends Comparable<E>> extends AbstractMergesort2<E> {

	public void merge(E[] a, int left, int middle, int right) {

		int l = left;
		int r = middle + 1;

		// i until right.....
		for (int i = left; i <= right; i++) {

			// this means: if a[l] < a[r]
			// if first statement is true, second statement wont be evaluated, therefore this is safe
			if (l <= middle && ( r > right || a[l].compareTo(a[r]) <= 0 )) {
				b[i] = a[l];
				l = l + 1;

			}

			else {

				b[i] = a[r];
				r = r + 1;

			}

		}

		System.arraycopy(b, 0, a, 0, b.length);

	}

}
