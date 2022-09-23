package de.hska.iwi.ads.solution.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Student implements Comparable<Student> {

	String name;
	Integer age;

	public Student(String name, Integer age) {

		this.name = name;
		this.age = age;

	}

	@Override
	public int compareTo(Student s) {

		return this.age.compareTo(s.age);

	}

}

public class MergesortTest {

	@Test
	void testMergesort1() {
		Mergesort<Integer> mergeSort = new Mergesort<Integer>();
		Integer[] a = { 0, 28, 20, 70, 9, 10, 191 };

		mergeSort.sort(a);

		assertArrayEquals(new Integer[] { 0, 9, 10, 20, 28, 70, 191 }, a);
	}

	@Test
	void testMergesort2() {
		Mergesort<Integer> mergeSort = new Mergesort<Integer>();
		Integer[] a = { 21, 24, 21, 24, 25 };

		mergeSort.sort(a);

		assertArrayEquals(new Integer[] { 21, 21, 24, 24, 25 }, a);
	}

	@Test
	void testMergesort3() {
		Mergesort<Integer> mergeSort = new Mergesort<Integer>();
		Integer[] a = { 0, 28, 20, 70, 9, 10, 191, 6, 5, 1, 3, 2, 4 };

		mergeSort.sort(a);

		assertArrayEquals(new Integer[] { 0, 1, 2, 3, 4, 5, 6, 9, 10, 20, 28, 70, 191 }, a);
	}

	@Test
	void testMergesort4() {
		Mergesort<Integer> mergeSort = new Mergesort<Integer>();
		Integer[] a = { 0, 28, 20, 70, 9, 10, 191, 6, 5, 1, 3, 2, 4, 201, 200 };

		mergeSort.sort(a);

		assertArrayEquals(new Integer[] { 0, 1, 2, 3, 4, 5, 6, 9, 10, 20, 28, 70, 191, 200, 201 }, a);
	}

	@Test
	void testMergesort5() {
		Mergesort<Integer> mergeSort = new Mergesort<Integer>();
		Integer[] a = { 0, 28, 20, 70, 9, 10, 191, 6, 5, 1, 3, 2, 4, 200, 201 };

		mergeSort.sort(a);

		assertArrayEquals(new Integer[] { 0, 1, 2, 3, 4, 5, 6, 9, 10, 20, 28, 70, 191, 200, 201 }, a);
	}

	@Test
	void testMergesort6() {
		Mergesort<Integer> mergeSort = new Mergesort<Integer>();
		Integer[] a = { 0, 28, 20, 70, 9, 10, 191, 6, 5, 1, 3, 2, 4, 200, 201, 199 };

		mergeSort.sort(a);

		assertArrayEquals(new Integer[] { 0, 1, 2, 3, 4, 5, 6, 9, 10, 20, 28, 70, 191, 199, 200, 201 }, a);
	}
	
	@Test
	void testMergesort7() {
		Mergesort<Integer> mergeSort = new Mergesort<Integer>();
		Integer[] a = { 2,1 };

		mergeSort.sort(a);

		assertArrayEquals(new Integer[] { 1,2 }, a);
	}
	
	@Test
	void testMergesort8() {
		Mergesort<Integer> mergeSort = new Mergesort<Integer>();
		Integer[] a = { 56 };

		mergeSort.sort(a);

		assertArrayEquals(new Integer[] { 56 }, a);
	}


	@Test
	void testMergesort9() {
		Mergesort<Integer> mergeSort = new Mergesort<Integer>();

		Integer[] a = new Integer[100000];
		for (int i = 0; i < 100000; i++) {
			a[i] = 0;
		}
		Integer[] b = new Integer[100000];
		for (int i = 0; i < 100000; i++) {
			b[i] = 0;
		}

		mergeSort.sort(a);

		assertArrayEquals(a, b);
	}

	@Test
	void testMergesortStable1() {
		Mergesort<Student> mergeSort = new Mergesort<Student>();

		Student student1 = new Student("Alex", 21);
		Student student2 = new Student("Bob", 24);
		Student student3 = new Student("Charlie", 21);
		Student student4 = new Student("Diana", 24);
		Student student5 = new Student("Emma", 25);

		Student[] students = { student1, student2, student3, student4, student5 };

		mergeSort.sort(students);

		assertArrayEquals(new Student[] { student1, student3, student2, student4, student5 }, students);

	}

	@Test
	void testMergesortStable2() {
		Mergesort<Student> mergeSort = new Mergesort<Student>();

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

		mergeSort.sort(students);

		assertArrayEquals(new Student[] { student1, student3, student6, student9, student2, student4, student8,
				student5, student7 }, students);
	}

}
