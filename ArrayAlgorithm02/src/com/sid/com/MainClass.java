package com.sid.com;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
			int j;
			int n =5;
			Scanner sc = new Scanner(System.in);
			Array02 ar = new Array02(n);
			// Inserting element into the Array
			ar.setElement(0, 1);
			ar.setElement(1, 2);
			ar.setElement(2, 3);
			ar.setElement(3, 4);
			ar.setElement(4, 5);
			 
			//displaying the element of the array
			for( j = 0; j < n; j++) {
				System.out.println("Elements of array are :"+ar.getElement(j));
			}
			// To Searching the element of the array
			System.out.println("Enter the element to search from the array ");
			int data = sc.nextInt();
			for(j = 0 ; j < n ; j++) {
				if(data == ar.getElement(j))
					break;
			}
			if(j == n) {
				System.out.println("Element not found");
			}else {
				System.out.println("Element found at index "+j);
			}
			
			//For deleting the element form the array
			System.out.println("Enter the data to delete from the array");
			int data1 = sc.nextInt();
			for(j = 0; j < n; j++) 
				if(data1 == ar.getElement(j))
			break;
			for(int k = j; k < n - 1;k++ )
				ar.setElement(k, ar.getElement(k+1));
			n--;
			
			//Again displaying the array
			
			for( j = 0; j < n; j++) {
				System.out.println("Remaining Element arr "+ar.getElement(j));
			}
			
			
			
			
			
			
			
	}

}
