package q2;

import java.util.Scanner;

public class MainEmpNameException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee first name: ");
		String firstName = sc.nextLine();
		System.out.println("Enter Employee second name:");
		String lastName = sc.nextLine();
		try {
			if (checkName(firstName, lastName)) {
				System.out.println("Name Verified and entered!!");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private static boolean checkName(String firstName, String lastName) throws EmpNameException {
		boolean isCorrect = false;
		if (firstName.length() == 0 || lastName.length() == 0) {
			throw new EmpNameException(firstName, lastName);

		} else {
			isCorrect = true;
		}
		return isCorrect;
	}

}
