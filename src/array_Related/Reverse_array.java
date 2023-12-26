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


//another method

//public class Reverse_array {
//
//	public static void reverseTheArray(int[] arr) {
//		
//		int last = arr.length-1;
//		int first = 0;
//		while(last > first) {
//			int temp = arr[last];
//			arr[last] = arr[first];
//			arr[first] = temp;
//			first++;
//			last--;
//		}
//		
//		for(int m : arr) {
//			System.out.print(m +" ");
//		}
//		
//	}
//	
//	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 4, 5, 6};
//		Reverse_array.reverseTheArray(arr);
//	}
//}




//Java program to reverse array without using second array.

//public class Reverse_array {
//
//	public static void reverseTheArray(int[] arr) {
//		
//		int last = arr.length-1;
//		int first = 0;
//		
//		while(last > first) {
//			int temp = arr[last];
//			arr[last] = arr[first];
//			arr[first] = temp;
//			last--;
//			first++;
//		}
//		
//		for(int m : arr) {
//			System.out.print(m +" ");
//		}
//	}
//	
//	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 4, 5};
//		Reverse_array.reverseTheArray(arr);
//	}
//}



//another method

//public class Reverse_array {
//
//	public static void reverseTheArray(int[] arr) {
//		
//		int last = arr.length-1;
//		int first = 0;
//		
//		while(last > first) {
//			arr[first] = arr[first] + arr[last];
//			arr[last] = arr[first] - arr[last];
//			arr[first] = arr[first] - arr[last];
//			last--;
//			first++;
//		}
//		
//		for(int m : arr) {
//			System.out.print(m +" ");
//		}
//	}
//	
//	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 4, 5};
//		Reverse_array.reverseTheArray(arr);
//	}
//}