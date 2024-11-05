package by.it_academy.array.main;

import java.util.Random;

public class Task05 {
	/*
	 * Дан массив целых чисел A длиной N, содержащий числа в диапазоне от 1 до K.
	 * Создайте массив F длиной K, где каждый элемент F[i] содержит количество
	 * вхождений числа i в массиве A.
	 */
	public static void main(String[] args) {

		int n = 5;
		int k = 7;
		int[] a;
		int[] f;
		int temp;

		a = new int[n];
		init(a);
		System.out.println("Исходный массив целых чисел содержащий числа от 1 до " + k);
		print(a);

		f = new int[k];
		for (int i = 0; i < f.length; i++) {
			temp = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == i) {
					temp++;
				}
			}
			f[i] = temp;
		}
		System.out.println("Массив числа вхождений числа i в исходном массиве");
		print(f);
	}

	public static int[] init(int[] mas) {
		Random rnd = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rnd.nextInt(10);
		}
		return mas;
	}

	public static void print(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%2d]", mas[i]);
		}
		System.out.println();
	}
}