package io.javapractise.Arrays;

import java.util.Scanner;

public class RotateArrayLeft {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n = obj.nextInt();
		int[] arrObj = new int[n];
		System.out.println("Enter the elements of an Array :");
		for (int i = 0; i < n; i++) {
			arrObj[i] = obj.nextInt();
		}
		System.out.println("Entered Array :");
		for (int i = 0; i < n; i++) {
			System.out.println(arrObj[i]);
		}
		System.out.println("Enter the value of N:");
		int d = obj.nextInt();
		int l = arrObj.length;

		for (int i = 0; i < d; i++) {
			int temp = arrObj[0];
			for (int j = 0; j < 4; j++) {
				arrObj[j] = arrObj[j + 1];
				if (j == l - 2) {
					arrObj[l - 1] = temp;
				}
			}
		}
		System.out.println("array after " + d + " left iterations");
		for (int i = 0; i < l; i++) {
			System.out.println(arrObj[i]);
		}
	}
}
