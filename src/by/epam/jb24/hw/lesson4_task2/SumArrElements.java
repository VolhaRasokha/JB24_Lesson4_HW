package by.epam.jb24.hw.lesson4_task2;

import java.util.Random;

public class SumArrElements {
	public static void main(String[] ards) {

		int[] arr = new int[20];
		int k = 4; // multiplicity by k
		ArrayCreationWithRandom(arr);
		int sum = FindSum(k, arr);
		PrintResult(sum, arr);

	}

	private static void PrintResult(int sum, int[] arr) {
		System.out.println("Array has following elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "]");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Sum of multiplicity by k elements = " + sum);

	}

	private static int FindSum(int k, int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % k == 0) {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

	private static void ArrayCreationWithRandom(int[] arr) {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(400);
		}

	}

}
