package com.apple.begginers;

public class ReverseStringTwo {

	public String reverseGivenString(String input) {

		StringBuffer buffer = new StringBuffer(input);
		int length = buffer.length();

		for (int i = 0; i < length / 2; i++) {
			Character currentChar = buffer.charAt(i);
			//System.out.println("currentChar : " + currentChar);
			int otherEnd = length - i - 1;
			//System.out.println("otherEnd : " + otherEnd);
			buffer.setCharAt(i, buffer.charAt(otherEnd));
			buffer.setCharAt(otherEnd, currentChar);
		}
		return buffer.toString();
	}
	
	
	public void printReverse(String s,int positionLength) {
		
		if(positionLength > -1) {
			System.out.print(s.charAt(positionLength));
			printReverse(s, positionLength-1);
		}
	}
	public static void main(String[] args) {
		ReverseStringTwo reverseStringTwo= new ReverseStringTwo();
		reverseStringTwo.printReverse("shiva",4);
	}
}
