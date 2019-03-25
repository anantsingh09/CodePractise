package io.javapractise.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int array[] = { 1, 3, 3, 2, 5 };
		int l = array.length, c = 0;
		int[] out = new int[l];
		for (int i = 0; i < l; i++) {
			int count = 0;
			for (int j = 0; j < l; j++) {
				if (array[i] == array[j])
					count++;
			}
			if (count < 2)
				out[c++] = array[i];
		}
		for (int i = 0; i < out.length; i++)
			if (out[i] != 0)
				System.out.println(out[i]);
	}
}
