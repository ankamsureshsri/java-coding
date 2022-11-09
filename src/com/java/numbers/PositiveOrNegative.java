package com.java.numbers;

public class PositiveOrNegative {
	public static void main(String[] args) {
		int num = -5;
		if (num >= 0) {
			if (num == 0) {
				System.out.println(num + " is zero");
			} else {
				System.out.println(num + " is positive");
			}

		} else {
			System.out.println(num + " is negative");
		}
	}

}
