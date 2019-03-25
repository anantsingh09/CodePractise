package io.javapractise.Search;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int l = obj.nextInt();
		boolean flag = false;
		int[] arrObj = new int[l];
		for (int i = 0; i < l; i++) {
			arrObj[i] = obj.nextInt();
		}
		System.out.println("Array elements are :");
		for (int i = 0; i < l; i++) {
			System.out.print(arrObj[i] + ",");
		}
		System.out.println("\nEnter the element to be searched :");
		int x = obj.nextInt();
		System.out.println("The element to be searched is :[" + x + "]");
		for (int i = 0; i < l; i++) {
			if (arrObj[i] == x)
				flag = true;
		}
		if (flag == true)
			System.out.println("value:[" + x + "] is present");
		else
			System.out.println("value:[" + x + "] is not present");

	}

}
