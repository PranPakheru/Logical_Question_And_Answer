package array_Related;


//problem statement below...
//Java Program to find sum of array elements.

public class Sum_of_array {

	public static int sumOfArray(int[] arr) {
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};	//can give any array here...
		int result = Sum_of_array.sumOfArray(arr);
		System.out.println("The sum of given array is: " +result);
	}
}
