package Day8;

import Day5.Result;

public class RomanNum {

	public static void main(String[] args) {
		String test1 = "III";
		String test2 = "IV";
		String test3 = "IX";
		String test4 = "LVIII";
		String test5 = "MCMXCIV";

		System.out.println(roman2Int(test1));
		System.out.println(roman2Int(test2));
		System.out.println(roman2Int(test3));
		System.out.println(roman2Int(test4));
		System.out.println(roman2Int(test5));
	}

	public static int roman2Int(String num) {
		int result = 0;
		int currentVal = 0;
		int nextVal = 0;

		for (int i = 0; i < num.length(); i++) {
			currentVal = romanConverter(num.charAt(i));

			if (currentVal == -1) {
				return -1;
			}

			if (i + 1 < num.length()) {
				nextVal = romanConverter(num.charAt(i + 1));

				if (currentVal < nextVal) {
					result -= currentVal;
				} else {
					result += currentVal;
				}
			} else {
				result += currentVal;
			}
		}
		return result;
	}

	public static int romanConverter(char input) {
		switch (input) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return -1;
		}
	}

	// ==> time complexity: best case: n + 2 --> O(N) worst case: n + 15 ---> O(N)

}
