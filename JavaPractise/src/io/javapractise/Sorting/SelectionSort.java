package io.javapractise.Sorting;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arrObj = { 10, 30, 20, 9, 32, 18 };
		int i, min;
		int length = arrObj.length;
		for (i = 0; i < length; i++) {
			min = i;
			for (int j = i + 1; j < length; j++) {
				if (arrObj[j] < arrObj[i]) {
					min = j;
					int temp = arrObj[i];
					arrObj[i] = arrObj[j];
					arrObj[j] = temp;
				}
			}
		}
		System.out.println("Sorted array after Selection Sort  Mechanism:");
		for (i = 0; i < length - 1; i++)
			System.out.println(arrObj[i]);
	}

}
