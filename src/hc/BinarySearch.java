package hc;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int target = 6;
		int targetIndex = findTarget(arr, target);

		System.out.println(targetIndex);

	}

	public static int findTarget(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;
		int mid = 0;

		while (start <= end) {
			mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else if (arr[mid] < target) {
				start = mid + 1;
			}
		}
		return -1;

	}

}
