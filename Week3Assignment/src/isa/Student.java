package isa;

public class Student extends Person {
	
	static int StudentId;
	public Student(String name, String address, int ContactNumber) {
		super(name, address, ContactNumber);
		// TODO Auto-generated constructor stub
	}



	public static void main(String[] args) {
		Student S = new Student("lee", "Sydney", 45111);
		S.StudentId = 45544;
		System.out.println("Student id is : " +StudentId);
		S.address();
		S.name();
	}
}
