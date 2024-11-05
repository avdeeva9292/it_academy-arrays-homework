package by.it_academy.array.main;

import java.util.Random;

public class Task06 {
	/*
	 * Дан массив целых чисел A длиной N. Создайте новый массив B, содержащий все
	 * уникальные элементы массива A в порядке их первого вхождения.
	 */
	public static void main(String[] args) {

		int n;
		int[] a;
		int[] b;

		n = 10;
		a = new int[n];

		init(a);
		System.out.println("Исходный массив");
		print(a);

		b = getIniqueMass(a);
		System.out.println("Массив с уникальными элементами");
		print(b);

	}

	public static int[] getIniqueMass(int[] mass) {
		int[] b;
		boolean isInArray;

		b = new int[mass.length];

		int count = 0;

		for (int i = 0; i < mass.length; i++) {
			isInArray = true;
			for (int j = 0; j < i; j++) {
				if (mass[i] == mass[j]) {
					isInArray = false;
					continue;
				}
			}
			if (isInArray) {
				b[count] = mass[i];
				count++;
			}
		}
		mass = new int[count];
		for (int i = 0; i < count; i++) {
			mass[i] = b[i];
		}
		return mass;
	}

	public static void print(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%2d]", mas[i]);
		}
		System.out.println();
	}

	public static int[] init(int[] mas) {
		Random rnd = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rnd.nextInt(10);
		}
		return mas;
	}
}
