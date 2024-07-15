package part5;

public class ExceptionExamples {

	public static void main(String[] args) {
		
		//AritthmiticException
		int a = 100;
		
		try {
			System.out.println("The result is: "  +(a/0));
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Entred into catch block");
		}
		
		//NullPointerException
	
		String s = null;
		
		try {
		System.out.println(s.length());
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("Entred into catch block");
		}
		
		//NumberFormatException
		String x = "abc";
		try {
		int i = Integer.parseInt(x);
		}catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Entred into catch block");
		}
		
		
		//ArrayIndexOutOfBoundsException
		int arr[] = new int[5];
		arr[10] = 100;
		

	}

}
