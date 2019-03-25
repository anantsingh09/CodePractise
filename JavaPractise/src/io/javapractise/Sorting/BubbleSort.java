package io.javapractise.Sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n = obj.nextInt();
		int[] arrObj = new int[n];
		System.out.println("Enter the elements of an Array :");
		for (int i = 0; i < n; i++) {
			arrObj[i] = obj.nextInt();
		}
		int l = arrObj.length;
		for (int i = 0; i < l - 1; i++) {
			for (int j = 0; j < l - i - 1; j++) {
				// {10,40,32,67,34}
				if (arrObj[j] > arrObj[j + 1]) {
					int temp = arrObj[j + 1];
					arrObj[j + 1] = arrObj[j];
					arrObj[j] = temp;
				}
			}
		}
		System.out.println("final sorted Array:");
		for (int i = 0; i < arrObj.length; i++) {
			System.out.println(arrObj[i]);
		}

	}

}
