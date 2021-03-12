package com.cg.eis.exception;

import java.util.Scanner;

public class MainEmployeeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary of Employee ");
		int sal = sc.nextInt();
		try {
			if (salCheck(sal)) {
				System.out.println("Salary update !!");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static boolean salCheck(int sal) throws EmployeeException {
		boolean isCorrect = false;
		if (sal < 30000) {
			throw new EmployeeException(sal);
		} else {
			isCorrect = true;
		}
		return isCorrect;
	}

}
