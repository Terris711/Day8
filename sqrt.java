package Day8;

import java.lang.Math;

public class sqrt {
	public static void main(String[] args) {
		double number = 16;
		double squareRoot = squareOld(number);
		double squareRoot1 = squareNew(number, 0, number);

		System.out.println(Math.round(squareRoot * 100.00) / 100.00);
		System.out.println(Math.round(squareRoot1 * 100.00) / 100.00);

	}

	public static double squareOld(double number) {
		double a;

		double squareroot = number / 2;

		do {
			a = squareroot;
			squareroot = (a + (number / a)) / 2;
		} while ((a - squareroot) != 0);

		return squareroot;
	}
	// ===> Time complexity: O(N)
	
	
	
	
	// Find square root of a number using binary search
	// square root of a number is in range [1,N]
	public static double squareNew(double number, double low, double high) {
		while (low <= high) {
			double mid = (low + high)/2;
			if (mid*mid == number) {
				return mid;
			}
			if (mid*mid < number) {
				return squareNew(number, mid + 1, high);
			} else {
				return squareNew(number, low, mid - 1);
			}
		}
		return low;
	}
	
	
	// ===> Time complexity: O(logN)
}