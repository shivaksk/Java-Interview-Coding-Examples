package com.apple.begginers;

import java.util.Iterator;

public class ReverseredString {

	public void reverseString(String str) {

		String[] words = str.split(" ");
		String revStrinbg="";

		for (int i = 0; i < words.length; i++) {

			String word = words[i];
			String revWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				revWord = revWord + word.charAt(j);

			}
			revStrinbg = revStrinbg+revWord+" ";
		}
		System.out.println("Given String : "+str);
		System.out.println("Reveresed String : "+revStrinbg);
	}

	public static void main(String[] args) {
		ReverseredString reverseredString = new ReverseredString();
		reverseredString.reverseString("shiva kumar kaithi");
	}
}
