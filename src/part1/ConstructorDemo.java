package part1;

public class ConstructorDemo {
	
	int x;
	int y;

	//Default constructor
	ConstructorDemo(){
		x = 20;
		y = 30;
	}
	
	//Parameterized constructor
	ConstructorDemo(int a, int b){
		x = a;
		y = b;
	}
	
	void display() {
		System.out.println(x + y);
	}
	

	public static void main(String[] args) {

//		ConstructorDemo cd = new ConstructorDemo(); // Invoke default constructor
//		cd.display();
		
		ConstructorDemo cd = new ConstructorDemo(100, 400);
		cd.display();
		
	}

}
