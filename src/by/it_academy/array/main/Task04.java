package by.it_academy.array.main;

public class Task04 {
	/*
	 * Дан массив целых чисел A длиной N. Найдите второй по величине элемент массива
	 * без использования встроенных функций сортировки.
	 */
	public static void main(String[] args) {
		int[] a;
		int n = 10;
		a = new int[n];

		init(a);
		print(a);
		findSecondminimum(a);

	}

	public static void findSecondminimum(int[] a) {

		int firstMin = a[0];
		int secondMin = a[1];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < firstMin) {
				secondMin = firstMin;
				firstMin = a[i];
			} else if (a[i] < secondMin) {
				secondMin = a[i];
			}

		}
		System.out.print("Второй по величине элемент массива " + secondMin);
	}

	public static void init(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 40);
		}
	}

	public static void print(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%2d]", mas[i]);
		}
		System.out.println();

	}

}
