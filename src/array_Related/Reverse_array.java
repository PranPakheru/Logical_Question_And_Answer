package array_Related;


//problem statement below...
//Java program to print array in reverse Order.

public class Reverse_array {

	public static void reverseTheArray(int[] arr) {
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] +" ");
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		Reverse_array.reverseTheArray(arr);
	}
}
