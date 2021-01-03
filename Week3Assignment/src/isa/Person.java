package isa;

public class Person {
	
	String name;
	String address;
	static int ContactNumber;

	public static void main(String[] args) {
		
	}
		
		public Person(String name,String address,int ContactNumber) {
			this.name = name;
			this.address = address;
			this.ContactNumber = ContactNumber;
		}
		//defining 	polymorphism
		public void domesticLoation() {
			System.out.println("Location of an employee is Noida");
		
		}
		
		public void internationalLoation() {
			System.out.println("Location of an employee is Sydney");
		
		}
		
		public void EmployeeId() {
			System.out.println("Person has same id as of Teacher and Employee : A1255");
		}
		
		public void name() {
			System.out.println("Person has same name as of Teacher and Employee: Joe");
		}
	
		public void address() {
			System.out.println("Person has same addess as of Teacher and Employee : Wellington");
		}
		public void ContactNumber() {
			System.out.println("Person has same No. as of Teacher and Employee : 0471121");
		}

}
