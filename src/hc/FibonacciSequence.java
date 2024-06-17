package hc;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> fibanocciSequence = getFibanocciSequence(5);
		System.out.println(fibanocciSequence);

	}

	public static List<Integer> getFibanocciSequence(int n) {
		List<Integer> res = new ArrayList<>();
		int a = 0;
		int b = 1;

		res.add(a);
		res.add(b);
		for (int i = 2; i < n; i++) {
			int c = a + b;
			a = b;
			b = c;
			res.add(c);
		}
		return res;

	}

}
