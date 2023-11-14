package number_Related;

import java.util.Scanner;

//problem statement below...
//Write a program  to print the Fibonacci series using iteration.

//a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. 
//The simplest is the series 0, 1, 1, 2, 3, 5, 8, etc.
//below is iterative method.
//public class Fibonacci_Series {
//
//	public void fibonacciSeries(int n) {
//		int first = 0;
//		int second = 1;
//		int result = 0;
//		for(int i=0; i<n; i++) {
//			if(i<=1) {
//				result = i;
//			}
//			else {
//				result = first + second;
//				first = second;
//				second = result;
//			}
//			System.out.print(result +", ");
//		}
//	}
//	
//	public static void main(String[] args) {
//		Fibonacci_Series fibo = new Fibonacci_Series();
//		System.out.println("The Fibonacci series of 9 is: ");
//		fibo.fibonacciSeries(9);
//	}
//	
////	//for custom input
////	public static void main(String[] args) {
////		Fibonacci_Series fibo = new Fibonacci_Series();
////		Scanner scan = new Scanner(System.in);
////		System.out.println("Enter a number: ");
////		int n = scan.nextInt();
////		scan.close();
////		System.out.println("The Fibonacci series of " +n  +" is: ");
////		fibo.fibonacciSeries(n);
////	}
//}



//another method, Recursion Method
public class Fibonacci_Series {

	public int fibonacciSeries(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else {
			return (fibonacciSeries(n-1) + fibonacciSeries(n-2));
		}
	}
	
	public static void main(String[] args) {
		Fibonacci_Series fibo = new Fibonacci_Series();
		System.out.println("The Fibonacci series of 9 is: ");
		int n = 9;
		
		for(int i=0; i<n; i++) {
			System.out.print( fibo.fibonacciSeries(i) +", ");
		}
	}
	
//	//for custom input
//	public static void main(String[] args) {
//		Fibonacci_Series fibo = new Fibonacci_Series();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int n = scan.nextInt();
//		scan.close();
//		System.out.println("The Fibonacci series of " +n  +" is: ");
//		
//		for(int i=0; i<n; i++) {
//			System.out.print( fibo.fibonacciSeries(i) +", ");
//		}
//	}
}
