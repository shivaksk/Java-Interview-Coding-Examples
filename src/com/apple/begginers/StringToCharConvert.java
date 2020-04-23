package com.apple.begginers;

public class StringToCharConvert {

	public static void main(String[] args) {
		String str = "Shiva kumar";
		for(int i=0;i<str.length();i++) 
		{
			char ch = str.charAt(i);
			System.out.println("Char : "+ch);
		}
	}
}
