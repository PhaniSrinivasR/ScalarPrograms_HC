package hc;

public class ThreeLargestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, -5, 3, 45, 11, 23, -15 };
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		int sum = arr[n - 1] + arr[n - 2] + arr[n - 3];
		System.out.println(sum);

	}

}
