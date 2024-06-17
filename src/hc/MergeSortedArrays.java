package hc;

public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 3, 5 };
		int[] arr2 = { 2, 4, 6 };
		
		int m = arr1.length;
		int n = arr2.length;
		int[] sortedArr = new int[m + n];
		int i = 0, j = 0, k = 0;

		while (i < m && j < n) {
			if (arr1[i] < arr2[j]) {
				sortedArr[k++] = arr1[i++];
			} else {
				sortedArr[k++] = arr2[j++];
			}
		}

		while (i < m) {
			sortedArr[k++] = arr1[i++];
		}

		while (j < n) {
			sortedArr[k++] = arr2[j++];
		}

		for (int val : sortedArr) {
			System.out.print(val + " ");
		}

	}

}
