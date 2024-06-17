package hc;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

		int left = 0;
		int right = arr.length - 1;
		int leftMax = Integer.MIN_VALUE;
		int rightMax = Integer.MIN_VALUE;
		int trappedUnits = 0;
		while (left < right) {
			leftMax = Math.max(leftMax, arr[left]);
			rightMax = Math.max(rightMax, arr[right]);
			if (leftMax < rightMax) {
				trappedUnits += leftMax - arr[left];
				left++;
			} else {
				trappedUnits += rightMax - arr[right];
				right--;
			}
		}
		System.out.println(trappedUnits);

	}

}
