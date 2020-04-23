package com.apple.begginers;

public class primeNumber {

	public void isPrime(int givneNumber) {
		boolean flag = false;
		for (int i = 2; i <= givneNumber / 2; ++i) {

			if (givneNumber % 2 == 0) {
				flag = true;
				break;
			}
		}

		if (!flag) {
			System.out.println(givneNumber + " is prime Number");
		} else {
			System.out.println(givneNumber + " : is Not Prime Number");
		}
	}

	public void isPrimeNumberCheck(int number) {

		// 0 and 1 are not prime numbers
		int i, m = 0, flag = 0;

		m = number / 2;
		if (number == 0 || number == 1) {
			System.out.println("Given Number are not Prime Number");
		} else {

			for (i = 2; i < m; i++) {
				if (number % i == 0) {
					System.out.println(number + " : is not Prime");
					flag = 1;
					break;
				}
			}

			if (flag == 0) {
				System.out.println(number + " :Is prime number");
			}
		}

	}

	public static void main(String[] args) {
		primeNumber number = new primeNumber();
		number.isPrimeNumberCheck(1);
	}
}
