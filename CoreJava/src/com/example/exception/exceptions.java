package com.example.exception;

public class exceptions {

	public static void main(String[] args) {
		int numOne = 12;
		int numTwo = 0;

		int result;

		try {
			result = numOne / numTwo;
			System.out.println("DIVISION RESULT = " + result);
		} catch (ArithmeticException ex) {
			System.out.println("ERROR - " + ex.getLocalizedMessage());
		} catch (Exception ex) {
			System.out.println("ERROR - " + ex.getLocalizedMessage());
		}
		result = numOne + numTwo;
		System.out.println("SUM RESULT = " + result);
	}
}
