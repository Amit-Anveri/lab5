package q1;

import java.util.Arrays;

public class AgeException extends Exception {
	private int age;

	public AgeException(int age) {
		super();
		this.age = age;
	}

	@Override
	public String toString() {
		return "AgeException :-" + "Age should be greater then 15 but givens age is " + age;
	}

}
