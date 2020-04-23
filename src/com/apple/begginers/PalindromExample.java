package com.apple.begginers;

public class PalindromExample {

	/*
	 * steps: 1. get the number 2. hold no in temp variable 3. reverse number 4.
	 * compare revnumber and temp variable 5. if both are same ----> Palindrome else
	 * ----> Not Palinrome
	 */

	public void isPalindrome(int number) {
		int temp = number;
		int reversedInteger = 0 ;
		int remainder;
		while (number != 0) {
			remainder = number % 10;
			reversedInteger = reversedInteger * 10 + remainder;
			number /= 10;

		}

		if (temp == reversedInteger) {

			System.out.println(temp + " = "+reversedInteger+" : is Palindrome");

		} else {
			System.out.println(temp + " = "+reversedInteger+" : is not Palindrome");
		}

	}
	
	
	

	public static void main(String[] args) {
		PalindromExample example = new PalindromExample();
		example.isPalindrome(121);
	}
}
