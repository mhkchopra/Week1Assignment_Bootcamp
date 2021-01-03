package isa;

public class Teacher extends Person {

	static String SubjectTeacher;
	
	public Teacher(String name, String address, int ContactNumber)  
	{
		super(name, address, ContactNumber); //Declaring super
	}
	
	//Polymorphism
	@Override
	public void domesticLoation() {
		System.out.println("Location of an employee is Banglore");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher T = new Teacher("leo", "Melbourne", 445);
		T.SubjectTeacher = "Maths";
		System.out.println("Name of the Subject teach by Teacher is : " +SubjectTeacher);
		T.EmployeeId();
		T.ContactNumber();
		T.name();
		T.domesticLoation();
		
	}

}
