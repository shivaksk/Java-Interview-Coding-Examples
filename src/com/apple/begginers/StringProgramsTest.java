package com.apple.begginers;

public class StringProgramsTest {

	public static void main(String[] args) {
		String s1="shiva";
		String s2="SHIVA";
		System.out.println("s1==s2 : "+s1 == s2);
		
		String s3 = new String("shiva");
		String s4 = new String("shiva");
		System.out.println("s3 == s4 : "+s3 == s4);
		
		String s5="shiva";
		StringBuffer  buffer = new StringBuffer(s1);
		System.out.println(s5.equals(buffer));
	}
}
