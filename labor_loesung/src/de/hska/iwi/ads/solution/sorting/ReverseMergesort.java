package de.hska.iwi.ads.solution.sorting;

public class ReverseMergesort<E extends Comparable<E>> extends AbstractMergesort2<E> {

	public void merge(E[] a, int left, int middle, int right) {

		ReverseArray<E> reverseArray = new ReverseArray<E>();
		reverseArray.reverse(a, middle + 1, right);

		int l = left;
		int r = right;

		// i until right.....
		for (int i = left; i <= right; i++) {

			// this means: if a[l] < a[r]
			//if (l <= middle && (r < middle + 1 || a[l].compareTo(a[r]) <= 0)) {

			if (a[l].compareTo(a[r]) <= 0) {

				b[i] = a[l];
				l = l + 1;

			}

			else {

				b[i] = a[r];
				r = r - 1;

			}

		}

		System.arraycopy(b, 0, a, 0, b.length);

	}

}
