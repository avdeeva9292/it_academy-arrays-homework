package by.it_academy.array.main;

import java.util.Arrays;

public class Task03 {
	/*
	 * Даны два отсортированных по возрастанию массива целых чисел A длиной N и B
	 * длиной M. Объедините эти массивы в один отсортированный по возрастанию массив
	 * C длиной N + M.
	 */

	public static void main(String[] args) {
		int[] a;
		int n = 4;
		a = new int[n];
		int[] b;
		int m = 6;
		b = new int[m];
		int[] c = new int[a.length + b.length];

		init(a);
		init(b);

		System.out.println("Массив A");
		print(a);
		System.out.println("Массив B");
		print(b);

		combine(a, b, c);

		System.out.println("Массив C");
		print(c);

		sort(c);

		System.out.println("Отсортированный массив C");
		print(c);
	}

	public static void combine(int[] a, int[] b, int[] c) {
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
			count++;
		}
		for (int j = 0; j < b.length; j++) {
			c[count++] = b[j];
		}
	}

	public static void sort(int[] c) {
		for (int i = 0; i < c.length; i++) {
			Arrays.sort(c);

		}

	}

	public static void print(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%2d]", mas[i]);
		}
		System.out.println();
	}

	public static void init(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 40);
		}
	}

}