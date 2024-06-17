package hc;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int factorial = 1;

		while (n > 0) {
			factorial *= n;
			n--;
		}
		System.out.println(factorial);

	}

}
