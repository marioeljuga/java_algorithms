package de.hska.iwi.ads.solution.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ReverseArrayTest {

	@Test
	void testReverseArray1() {
		ReverseArray<Integer> reverseArray = new ReverseArray<Integer>();
		Integer[] a = { 1, 2, 3, 4, 5 };

		reverseArray.reverse(a, 0, 4);

		assertArrayEquals(new Integer[] { 5, 4, 3, 2, 1 }, a);
	}

	@Test
	void testReverseArray2() {
		ReverseArray<Integer> reverseArray = new ReverseArray<Integer>();
		Integer[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };

		reverseArray.reverse(a, 0, 4);

		assertArrayEquals(new Integer[] { 5, 4, 3, 2, 1, 6, 7, 8 }, a);
	}

	@Test
	void testReverseArray3() {
		ReverseArray<Integer> reverseArray = new ReverseArray<Integer>();
		Integer[] a = { 0, 20, 70, 28, 9, 10, 191 };

		reverseArray.reverse(a, 2, 3);

		assertArrayEquals(new Integer[] { 0, 20, 28, 70, 9, 10, 191 }, a);
	}
	
	@Test
	void testReverseArray4() {
		ReverseArray<Integer> reverseArray = new ReverseArray<Integer>();
		Integer[] a = { 0, 20, 70, 28, 9, 10, 191 };

		reverseArray.reverse(a, 2, 2);

		assertArrayEquals(new Integer[] { 0, 20, 70, 28, 9, 10, 191 }, a);
	}
	
	@Test
	void testReverseArray5() {
		ReverseArray<Integer> reverseArray = new ReverseArray<Integer>();
		Integer[] a = { 0, 20, 70, 28, 9, 10, 191 };

		reverseArray.reverse(a, 5, 6);

		assertArrayEquals(new Integer[] { 0, 20, 70, 28, 9, 191, 10 }, a);
	}


}
