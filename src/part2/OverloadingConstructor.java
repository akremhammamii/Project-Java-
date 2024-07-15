package part2;

public class OverloadingConstructor {
	
	OverloadingConstructor(int a, int b){
		System.out.println(a + b );
	}
	
	OverloadingConstructor(int a, double b){
		System.out.println(a + b);
	}
	
	OverloadingConstructor(double a, double b){
		System.out.println(a + b);
	}
	
	OverloadingConstructor(int a, int b, int c){
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {

		OverloadingConstructor co1 = new OverloadingConstructor(10, 20); //1
		OverloadingConstructor co2 = new OverloadingConstructor(10, 20.5); //2
		OverloadingConstructor co3 = new OverloadingConstructor(10.5, 20.5); //3
		OverloadingConstructor co4 = new OverloadingConstructor(10, 20, 30); // 4 
	}

}
