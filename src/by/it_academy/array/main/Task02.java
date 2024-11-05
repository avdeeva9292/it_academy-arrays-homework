package by.it_academy.array.main;

public class Task02 {
	/*Дан массив символов A длиной N. Определите, является ли этот массив палиндромом
	(читается одинаково слева направо и справа налево).*/
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 5, 4, 3, 2, 1 };

		System.out.println(isYes(a));
	}

	public static boolean isYes(int[] a) {
		for (int i = 0, j = a.length - 1; i < a.length / 2; i++, j--) {
			if (a[i] != a[j]) {
				return false;
			}
		}
		return true;
	}
}
