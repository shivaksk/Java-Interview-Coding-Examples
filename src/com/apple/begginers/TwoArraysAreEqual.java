package com.apple.begginers;

import java.util.Arrays;

public class TwoArraysAreEqual {

	public static void twoArraysAreEqual(int[] arr1, int[] arr2) {

		boolean equalOrNot = true;
		if (arr1.length == arr2.length) {

			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					equalOrNot = false;
				}
			}

		} else {
			equalOrNot = false;
		}

		System.out.println("First Array : " + Arrays.toString(arr1));
		System.out.println("First Array : " + Arrays.toString(arr2));
		if (equalOrNot) {
			System.out.println("Two Arrays Are Equal");
		} else {
			System.out.println("Two Arrays Are Not Equal");
		}
	}
	
	public static void areArraysEqual(int[] arry1,int[] arry2) {
		boolean areArrayEq = Arrays.equals(arry1, arry2);
		if(areArrayEq) {
			System.out.println("Arrays Are Equal");
		}else {
			System.out.println("Arrays Are Not Equal");
		}
	} 
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4};
		int[] arr2= {1,2,3,4};
		areArraysEqual(arr1, arr2);
	}
}
