package part1;

public class StudentMain {

	public static void main(String[] args) {
		
		//Object ==> Instance of a class
		Student student = new Student(10235, "Manel", 'A');

		//1 Assign values to variables by using reference variable
		student.sid = 101010;
		student.sname = "Foued";
		student.grade = 'A';
		student.display();
		
		//2 Assign values to variables by using method
		student.getValues(102020, "Sarra", 'A');
		student.display();
		
		//3 Assign values to variables by using constructor
		student.display();


	}

}
