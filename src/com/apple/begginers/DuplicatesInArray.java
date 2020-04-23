package com.apple.begginers;

import java.util.HashSet;

public class DuplicatesInArray {

	public static void isHavingDuplicates(String[] strArray) {

		for (int i = 0; i <= strArray.length - 1; i++) {

			for (int j = i + 1; i < strArray.length; j++) {

				if ((strArray[i].equals(strArray[j])) && (i != j)) {
					System.out.println("Duplicate Elements : " + strArray[i]);
				}
			}

		}

	}
	
	public static void isHavingDupUsingHashSet(String[] strArray) {
		
		HashSet<String> hashSet = new HashSet<String>();
		
		for (String arrElement : strArray) {
			
			if(!hashSet.add(arrElement)) {
				System.out.println("Duplicate Element : "+arrElement);
			}
			
		}
		
	}

	public static void main(String[] args) {
		String[] arr = { "Shiva", "Hello", "Shiva" };
		isHavingDupUsingHashSet(arr);
	}
}
