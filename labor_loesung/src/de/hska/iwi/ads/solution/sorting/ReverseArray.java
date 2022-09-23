package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.Reverse;

public class ReverseArray<E extends Comparable<E>> implements Reverse<E>{

	@Override
	public void reverse(E[] a, int from, int to) {

		for (int i = from; i < (to+from+1)/2; i++ ) {
			E temp = a[i];
			a[i] = a[to + from - i];
			a[to + from - i] = temp;
		}
		
	}

}
