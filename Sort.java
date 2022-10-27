package Day8;

public class Sort {

	public static void main(String[] args) {
		int[] array = {1,2,2,0,0,1,2,2,1};
		sort(array);
		display(array);
	}
	
	public static int[] sort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++) { // x n steps
            if (arr[i] > arr[i + 1]) { // x1 step
                int temp = arr[i]; // x1 step
                arr[i] = arr[i + 1]; // x1 step
                arr[i + 1] = temp; // x1 step
               
            }
        }
        return arr; // x1 step
    }
	
	// ==> Time complexity: N + 5 --> O(N)
	
	public static void display(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
