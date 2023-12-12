package array_Related;


//problem statement below...
//Write a program in Java for, How to compare two array is equal in size or not.

public class Compare_size {
	
	public static void compairTheSize(int x, int y) {
		if(x == y) {
			System.out.println("The array size is same.");
		}
		else {
			System.out.println("The size is not same.");
		}
	}
	
	//you can put custom array below...
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {6, 7, 8, 9, 10};
		Compare_size.compairTheSize(arr1.length, arr2.length);
	}
}
