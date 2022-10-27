package Day8;

import Day5.Result;

public class RomanNum {

	public static void main(String[] args) {
		String[] test1 = { "I", "I", "I" };
		String[] test2 = { "I", "V" };
		String[] test3 = { "I", "X" };
		String[] test4 = { "L", "V", "I", "I", "I" };
		String[] test5 = { "M", "C", "M", "X", "C", "I", "V" };
		
		displayResult(test1);
		displayResult(test2);
		displayResult(test3);
		displayResult(test4);
		displayResult(test5);
	}

	public static int roman2Int(String[] num) {
		int result = 0; // x1 step
		for (int i = 0; i < num.length; i++) { // x n steps with n is the number of roman characters
			if (num[i].equals("I")) {
				if (i + 1 < num.length && num[i + 1].equals("V")) { // x3 steps
					result += 4;
					i++;
					continue;
				}

				if (i + 1 < num.length && num[i + 1].equals("X")) { // x3 steps
					result += 9;
					i++;
					continue;
				}
				result += 1; // x1 step
			}

			if (num[i].equals("V")) { // x2 steps
				result += 5;
			}

			if (num[i].equals("X")) { // x3 steps
				if (i + 1 < num.length && num[i + 1].equals("L")) {
					result += 40;
					i++;
					continue;
				}

				if (i + 1 < num.length && num[i + 1].equals("C")) { // x3 steps
					result += 90;
					i++;
					continue;
				}
				
				result += 10; // x1 step
			}

			if (num[i].equals("L")) { // x2 steps
				result += 50;
			}

			if (num[i].equals("C")) {
				if (i + 1 < num.length && num[i + 1].equals("D")) {// x3 steps
					result += 400;
					i++;
					continue;
				}

				if (i + 1 < num.length && num[i + 1].equals("M")) { // x3 steps
					result += 900;
					i++;
					continue;
				}
				
				result += 100; // x1 step
			}

			if (num[i].equals("D")) { // x2 steps
				result += 500;
			}

			if (num[i].equals("M")) { // x2 steps
				result += 1000;
			}
		}

		return result; // x1 step
	}
	
	// ==> time complexity: best case: n + 2 --> O(N)       worst case: n + 15 ---> O(N)

	public static void displayRoman(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
	public static void displayResult(String[] arr) {
		System.out.print("Number ");
		displayRoman(arr);
		System.out.println(" is: " + roman2Int(arr));

	}
	

}
