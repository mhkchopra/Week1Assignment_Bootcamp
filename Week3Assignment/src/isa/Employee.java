package isa;


public class Employee extends Person {

	public Employee(String name, String address, int ContactNumber) {
		super(name, address, ContactNumber);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E = new Employee("joe", "wellinton", 1);
		E.EmployeeId();
		E.name();
		E.address();
	}

}
