package com.cg.eis.exception;

public class EmployeeException extends Exception {
	private int salary;

	public EmployeeException(int salary) {
		super();
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeException [salary=" + salary + "] has to be more than 30000";
	}

}
