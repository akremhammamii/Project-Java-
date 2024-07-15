package part3;

public class FinalVariableDemo {
	
	//without final we can change the value of the variable
	final int speed = 100; 

	public static void main(String[] args) {
		
		FinalVariableDemo  fvd = new FinalVariableDemo();
		fvd.speed = 500; // Compile time error because of final keyword
		System.out.println(fvd.speed);

	}

}
