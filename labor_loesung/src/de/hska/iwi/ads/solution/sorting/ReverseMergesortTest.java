package de.hska.iwi.ads.solution.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ReverseMergesortTest {

	@Test
	void testReverseMergesort1() {
		ReverseMergesort<Integer> reverseMergesort = new ReverseMergesort<Integer>();
		Integer[] a = { 28, 0, 20, 70, 9, 10, 191 };

		reverseMergesort.sort(a);

		assertArrayEquals(new Integer[] { 0, 9, 10, 20, 28, 70, 191 }, a);
	}

	@Test
	void testReverseMergesort2() {
		ReverseMergesort<Integer> reverseMergesort = new ReverseMergesort<Integer>();
		Integer[] a = { 21, 24, 21, 24, 25 };

		reverseMergesort.sort(a);

		assertArrayEquals(new Integer[] { 21, 21, 24, 24, 25 }, a);
	}
	
	@Test
	void testReverseMergesort3() {
		ReverseMergesort<Integer> reverseMergesort = new ReverseMergesort<Integer>();
		Integer[] a = { 0, 28, 20, 70, 9, 10, 191, 6, 5, 1, 3, 2, 4 };

		reverseMergesort.sort(a);

		assertArrayEquals(new Integer[] { 0, 1, 2, 3, 4, 5, 6, 9, 10, 20, 28, 70, 191 }, a);
	}

	@Test
	void testReverseMergesort4() {
		ReverseMergesort<Integer> reverseMergesort = new ReverseMergesort<Integer>();
		Integer[] a = { 0, 28, 20, 70, 9, 10, 191, 6, 5, 1, 3, 2, 4, 201, 200 };

		reverseMergesort.sort(a);

		assertArrayEquals(new Integer[] { 0, 1, 2, 3, 4, 5, 6, 9, 10, 20, 28, 70, 191, 200, 201 }, a);
	}

	@Test
	void testReverseMergesort5() {
		ReverseMergesort<Integer> reverseMergesort = new ReverseMergesort<Integer>();
		Integer[] a = { 0, 28, 20, 70, 9, 10, 191, 6, 5, 1, 3, 2, 4, 200, 201 };

		reverseMergesort.sort(a);

		assertArrayEquals(new Integer[] { 0, 1, 2, 3, 4, 5, 6, 9, 10, 20, 28, 70, 191, 200, 201 }, a);
	}

	@Test
	void testReverseMergesort6() {
		ReverseMergesort<Integer> reverseMergesort = new ReverseMergesort<Integer>();
		Integer[] a = { 0, 28, 20, 70, 9, 10, 191, 6, 5, 1, 3, 2, 4, 200, 201, 199 };

		reverseMergesort.sort(a);

		assertArrayEquals(new Integer[] { 0, 1, 2, 3, 4, 5, 6, 9, 10, 20, 28, 70, 191, 199, 200, 201 }, a);
	}
	
	@Test
	void testReverseMergesort7() {
		ReverseMergesort<Integer> reverseMergesort = new ReverseMergesort<Integer>();
		Integer[] a = { 2,1 };

		reverseMergesort.sort(a);

		assertArrayEquals(new Integer[] { 1,2 }, a);
	}
	
	@Test
	void testReverseMergesort8() {
		ReverseMergesort<Integer> reverseMergesort = new ReverseMergesort<Integer>();
		Integer[] a = { 56 };

		reverseMergesort.sort(a);

		assertArrayEquals(new Integer[] { 56 }, a);
	}

	@Test
	void testReverseMergesort9() {
		ReverseMergesort<Integer> reverseMergesort = new ReverseMergesort<Integer>();

		Integer[] a = new Integer[100000];
		for (int i = 0; i < 100000; i++) {
			a[i] = 0;
		}
		Integer[] b = new Integer[100000];
		for (int i = 0; i < 100000; i++) {
			b[i] = 0;
		}

		reverseMergesort.sort(a);

		assertArrayEquals(a, b);
	}

	@Test
	void testReverseMergesortStable1() {
		ReverseMergesort<Student> reverseMergesort = new ReverseMergesort<Student>();

		Student student1 = new Student("Alex", 21);
		Student student2 = new Student("Bob", 24);
		Student student3 = new Student("Charlie", 21);
		Student student4 = new Student("Diana", 24);
		Student student5 = new Student("Emma", 25);

		Student[] students = { student1, student2, student3, student4, student5 };

		reverseMergesort.sort(students);

		assertArrayEquals(new Student[] { student1, student3, student2, student4, student5 }, students);

	}

	@Test
	void testReverseMergesortStable2() {
		ReverseMergesort<Student> reverseMergesort = new ReverseMergesort<Student>();

		Student student1 = new Student("A", 21);
		Student student2 = new Student("B", 24);
		Student student3 = new Student("C", 21);
		Student student4 = new Student("D", 24);
		Student student5 = new Student("E", 25);
		Student student6 = new Student("F", 21);
		Student student7 = new Student("G", 25);
		Student student8 = new Student("H", 24);
		Student student9 = new Student("I", 21);

		Student[] students = { student1, student2, student3, student4, student5, student6, student7, student8,
				student9 };

		reverseMergesort.sort(students);

		assertArrayEquals(new Student[] { student1, student3, student6, student9, student2, student4, student8,
				student5, student7 }, students);

	}

}
