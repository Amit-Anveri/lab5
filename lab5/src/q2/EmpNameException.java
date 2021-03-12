package q2;

public class EmpNameException extends Exception {
	private String firstName;
	private String lastName;

	public EmpNameException(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee Name Exception : First name or Last name cannot be blank";
	}

}
