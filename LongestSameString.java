package Day8;

public class LongestSameString {

	public static void main(String[] args) {
		String[] strs1 = {"flower", "flow", "flight"};
		String[] strs2 = {"dog", "racecar", "car"};
		String[] strs3 = {"cat", "concation", "hcat"};
		String[] strs4 = {"Doflamingo", "Doflaminho", "Doflaminhhang"};
		
		System.out.println(findLongestSubstr(strs1));
		System.out.println(findLongestSubstr(strs2));
		System.out.println(findLongestSubstr(strs3));
		System.out.println(findLongestSubstr(strs4));
		
	}
	
	public static String findLongestSubstr(String[] strs) {
		String result = "";
		char temp = strs[0].charAt(0); // prefix
		int count = 0;
		
		while (count < strs[0].length()) { // x n steps (with n is the length of first string)
			temp = strs[0].charAt(count);
			
			for (int i = 0; i < strs.length; i++) { // x N steps (with n is the number of strings in assessment)
				if (strs[i].charAt(count) != temp) {
					return result;
				}
			}
			
			result += temp;
			count++;
		}
		return result;
	}
}

// Time complexity: O(N)