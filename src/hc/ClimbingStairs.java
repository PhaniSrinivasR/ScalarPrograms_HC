package hc;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distinctWays = climbStairs(4);
		System.out.println(distinctWays);
	}

	public static int climbStairs(int stairs) {
		if (stairs <= 1) {
			return 1;
		}
		int prev = 1, curr = 1;
		for (int i = 2; i <= stairs; i++) {
			int temp = curr;
			curr = prev + curr;
			prev = temp;
		}
		return curr;
	}

}
