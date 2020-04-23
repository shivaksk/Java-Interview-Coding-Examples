package com.apple.begginers;

public class CharToStringConvert {

	public static void main(String[] args) {
		// using toString()
		char ch = 'c';
		String str = Character.toString(ch);
		System.out.println(str);

		// using valueof()
		String str2 = String.valueOf(ch);
		System.out.println(str2);
	}
}
