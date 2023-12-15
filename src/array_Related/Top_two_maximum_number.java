package array_Related;


//problem statement below...
//Write a program in Java to find top two maximum number in array?

//for example [1, 3, 5, 7, 2, 4, 6, 8] top two are: 8 & 7

public class Top_two_maximum_number {

	public static void topTwoMaxNum(int[] arr) {
		
		int first = arr[0];
		int second = arr[1];
		
		int i=0;
		while(i<arr.length) {
			if(first<arr[i]) {
				first = arr[i];
			}
			i++;
		}
		
		int j=0;
		while(j<arr.length) {
			if(first != arr[j]) {
				if(second < arr[j]) {
					second = arr[j];
				}
			}
			j++;
		}
		
		System.out.println("First biggest is: " +first);
		System.out.println("Second biggest is: " +second);
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 2, 4, 6, 8};		//can give any array here
		Top_two_maximum_number.topTwoMaxNum(arr);
	}
}
