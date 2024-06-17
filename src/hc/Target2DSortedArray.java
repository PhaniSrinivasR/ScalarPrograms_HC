package hc;

public class Target2DSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 4, 7, 11 }, { 2, 5, 8, 12 }, { 3, 6, 9, 16 } };
		int target = 8;
		boolean res = findTarget(arr, target);
		System.out.println(res);
	}

	public static boolean findTarget(int[][] matrix, int target) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				if (matrix[row][col] == target) {
					return true;
				}
			}
		}
		return false;
	}

}
