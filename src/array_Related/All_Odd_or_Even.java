package array_Related;

import java.util.ArrayList;
import java.util.List;

//problem statement below
//Java Program to print all even numbers in array.


public class All_Odd_or_Even {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
		
		System.out.println("even numbers: " +All_Odd_or_Even.allEven(arr));
		System.out.println("odd numbers: " +All_Odd_or_Even.allOdd(arr));
		
	}
	
	public static List<Integer> allEven(int[] arr) {
		
		List<Integer> list = new ArrayList<>();
		for(int m : arr) {
			if(m%2==0) {
				list.add(m);
			}
		}
		
		return list;
	}
	
	public static List<Integer> allOdd(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for(int m : arr) {
			if(m%2!=0) {
				list.add(m);
			}
		}
		return list;
	}
}
