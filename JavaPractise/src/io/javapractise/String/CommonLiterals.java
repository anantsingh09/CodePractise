package io.javapractise.String;

import java.util.Scanner;

public class CommonLiterals {

	public static void main(String[] args) {
		// Scanner obj = new Scanner(System.in);
		// System.out.println("Enter 1st //String:");
		String s1 = "abcd";
		// System.out.println("Enter 2n.d String:");
		String s2 = "aad";
		int l1, l2, count = 0;
		l1 = s1.length();
		l2 = s2.length();
		// aacd
		// abcd
		for (int i = 0; i < l1; i++) {
			for (int j = 0; j < l2; j++) {
				if ((s1.charAt(i) == s2.charAt(j))) {
					int in1 = s1.indexOf(s1.charAt(i));
					int in2 = s2.indexOf(s2.charAt(j));
					if (in1 != i && in2 != j) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
