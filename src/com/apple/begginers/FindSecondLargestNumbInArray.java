package com.apple.begginers;

public class FindSecondLargestNumbInArray {

	public static void findSecondLargNum(int[] array) {
		int firstLargestNumber, secondLargestNumber;

		if (array[0] > array[1]) {
			firstLargestNumber = array[0];
			secondLargestNumber = array[1];
		} else {
			firstLargestNumber = array[1];
			secondLargestNumber = array[0];
		}
		// check for Remaining Elements
		for (int i = 2; i < array.length; i++) {
			if (array[i] > firstLargestNumber) {
				secondLargestNumber = firstLargestNumber;
				firstLargestNumber = array[i];
				
			} else if (array[i] < firstLargestNumber && array[i] > secondLargestNumber) {
				secondLargestNumber = array[i];
			}
		}
		System.out.println("Second Largest Number : " + secondLargestNumber);

	}

	public static void main(String[] args) {
		int[] arra = { 1, 3, 5, 2,6 };
		findSecondLargNum(arra);
	}
}
