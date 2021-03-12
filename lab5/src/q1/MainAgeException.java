package q1;

import java.util.Scanner;

public class MainAgeException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		try {
			if (ageCheck(age)) {
				System.out.println("Age added");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static boolean ageCheck(int age) throws AgeException {
		// TODO Auto-generated method stub
		boolean isCorrect = false;
		if (age < 15) {
			throw new AgeException(age);
		} else {
			isCorrect = true;
		}
		return isCorrect;
	}

}
