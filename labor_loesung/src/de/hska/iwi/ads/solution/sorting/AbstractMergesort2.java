package de.hska.iwi.ads.solution.sorting;

import de.hska.iwi.ads.sorting.AbstractMergesort;

public abstract class AbstractMergesort2 <E extends Comparable<E>> extends AbstractMergesort <E>{

	@Override
	protected void mergesort(E[] a, int left, int right) {

		if (right > left) {

			int middle = (left + right) / 2;

			mergesort(a, left, middle);
			mergesort(a, middle + 1, right);
			merge(a, left, middle, right);

		}
		
	}
	
	public abstract void merge(E[] a, int left, int middle, int right);


}
