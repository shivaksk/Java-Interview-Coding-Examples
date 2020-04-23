package com.apple.begginers;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2008;
		boolean isLeapyear = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeapyear = true;
				} else {
					isLeapyear = false;
				}
			} else {
				isLeapyear = true;
			}

		} else {

			isLeapyear = false;
		}

		if (isLeapyear == true) {
			System.out.println(year + " is Leap Year ");
		} else {
			System.out.println(year + "is Not Leap Year ");
		}
	}
}
