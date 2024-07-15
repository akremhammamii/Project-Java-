package part1;

public class Calculation {
	
	int x = 20;
	int y = 30;
	
//	1/ case 1: Not tacking parameters and also not returned any value
	
//	void sum() {
//		//body
//		System.out.println(x + y);
//	}
	
//	2/ case 2: Not tacking parameters but returning value
	
//	int sum() {
//		return (x+y);
//	}
	
//	3/ case 3: Tacking parameters but not returned a value
	
//	void sum(int a, int b) {
//		System.out.println(a + b);
//	}
	
//	4/ case 4: Tacking parameters and also returning a value
	
	int sum(int a, int b) {
		return (a + b);
	}

	public static void main(String[] args) {
		
		Calculation  cal = new Calculation();
		//cal.sum(); // case 1
		
//		int result = cal.sum(); // case 2
//		System.out.println(result);
		
		//cal.sum(60, 5); // case 3
		
		System.out.println(cal.sum(20, 10)); //case 4
	}

}
