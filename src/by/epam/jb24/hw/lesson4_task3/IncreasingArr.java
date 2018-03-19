package by.epam.jb24.hw.lesson4_task3;

public class IncreasingArr {

	public static void main(String[] args) {
		double[] firstArrInc = { 0.5, 0.7, 0.8, 0.9, 2, 85.5, 100 };
		double[] secondArrNotInc = { 0.5, 0.3, 0.8, 0.9, 2, 85.5, 1 };
		double[] thirdArrNotInc = { 1, 0.5, 0.7, 0.8, 0.9, 2, 85.5, 1 };
		double[] fourthArrNotInc = { 0.5, 0.7, 0.8, 0.9, 2, 85.5, -1};

		boolean resultOfInc = CheckIncrising(firstArrInc);
		PrintResult(firstArrInc, resultOfInc);

		resultOfInc = CheckIncrising(secondArrNotInc);
		PrintResult(secondArrNotInc, resultOfInc);

		resultOfInc = CheckIncrising(thirdArrNotInc);
		PrintResult(thirdArrNotInc, resultOfInc);

		resultOfInc = CheckIncrising(fourthArrNotInc);
		PrintResult(fourthArrNotInc, resultOfInc);

	}

	private static void PrintResult(double[] arr, boolean rez) {
		System.out.print("Massive: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[" + arr[i] + "]");
		}

		if (rez) {
			System.out.println(" is incremental");
		} else {
			System.out.println(" is decremental");
		}
	}

	private static boolean CheckIncrising(double[] arr) {
		boolean rez = true;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				rez = false;
				break;
			}
		}
		return rez;
	}
}