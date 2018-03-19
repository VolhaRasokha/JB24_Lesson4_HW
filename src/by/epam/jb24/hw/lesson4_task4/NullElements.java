package by.epam.jb24.hw.lesson4_task4;

public class NullElements {

	public static void main(String[] args) {
		int[] arr = {0, 2, 1, 0, 4, 8, 0, 0, 0, 4};

		arrWithNullCreation(arr);

	}

	private static void arrWithNullCreation(int[] arr) {
		int calc = 0;
		int[] arrWithNull;

		// to find length of new array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				calc = calc + 1;
			}
		}

		if (calc == 0) {
			System.out.println("There is not 0 in the array");
			return;
		} else {
			// to fill new array
			arrWithNull = new int[calc];
			int temp = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 0) {
					arrWithNull[temp] = i;
					temp = temp + 1;
				}
			}
			
			System.out.println("Massive from number of 0 elements: ");
			for (int i = 0; i < arrWithNull.length; i++)
				System.out.print("[" + arrWithNull[i] + "]");
		}
	}

}
