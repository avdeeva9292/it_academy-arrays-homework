package by.it_academy.array.main;

public class Task01 {
	/*
	 * Дан одномерный целочисленный массив A длиной N и число K. Реализуйте алгоритм
	 * циклического сдвига элементов массива на K позиций вправо. Элементы,
	 * выходящие за пределы массива, должны перемещаться в начало.
	 */
	public static void main(String[] args) {
		int[] a;
		int n = 7;
		a = new int[n];
		
		init(a);
		print(a);

		swap(a, 1);
		print(a);
	}

	public static void swap(int[] a, int k) {

		for (int i = 0; i < k; i++) {
			int m = a[a.length - 1];
			for (int j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[0] = m;
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
