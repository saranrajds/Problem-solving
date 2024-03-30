package tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class PushZerosToEnd {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of element : ");
		int n = scanner.nextInt();
		System.out.println("Enter element one by one");
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Enter "+(i+1)+" value : ");
			arr[i] = scanner.nextInt();
		}
		
		int x = 0, y = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] != 0) {
                arr[x] = arr[i];
                if (x != i) {
                    arr[i] = 0;
                }
                x++;
            }
				
		}
		
	
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		// 2nd way
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter the number of element : ");
//		int n = scanner.nextInt();
//		System.out.println("Enter element one by one");
//		int[] arr = new int[n];
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		
//		for (int i = 0; i < n; i++) {
//			System.out.print("Enter "+(i+1)+" value : ");
//			arr[i] = scanner.nextInt();
//			
//			if(arr[i] != 0)
//			{
//				numbers.add(arr[i]);
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//			if(i < numbers.size())
//				arr[i] = numbers.get(i);
//			else 
//				arr[i] = 0;
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
	}
}
