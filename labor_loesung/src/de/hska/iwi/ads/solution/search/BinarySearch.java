package de.hska.iwi.ads.solution.search;

import de.hska.iwi.ads.search.Search;

public class BinarySearch <E extends Comparable<E>> implements Search<E>{
	
	boolean keyFound = false;
	int lastComparison;

	private int standardSearch(E[] a, E key, int left, int right) {
		
		if (left > right) {
			
			if (keyFound == true) {
				
				return left;
				
			}
			
			lastComparison = left;
			// key not found
			return -1;
		}
		
		int middle = (left + right) / 2;
		
		if (a[middle] == key) {
			
			// key found, but let's continue in case there are duplicates
			keyFound = true;
			right = middle - 1;
			return standardSearch(a, key, left, right);
			
		}
		
		// this means: if middle > key
		else if (a[middle].compareTo(key) > 0) {
			
			right = middle - 1;
			return standardSearch(a, key, left, right);

		}

		// this means: if middle < key
		// else if (a[middle].compareTo(key) < 0) {
		else {
			
			left = middle + 1;
			return standardSearch(a, key, left, right);

		}
		
	}
	
	public int search(E[] a, E key, int left, int right) {
		
		int i;

		if (key.compareTo(a[left]) < 0) {

			i = left - 1;
			return i;

		}

		if (key.compareTo(a[right]) > 0) {

			i = right + 1;
			return i;

		}

		int result = standardSearch(a, key, left, right);
		
		if (result >= 0) {
			
			return result;

		}
		
		return lastComparison;

		
	}


}