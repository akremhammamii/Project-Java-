package part4;

interface ABC {
	int x = 20;
	void m1();
}

interface XYZ{
	int y = 120;
		void m2();
}

public class MultipleInheritance implements ABC, XYZ {
	
	public void m1() {
		System.out.println(x);
	}
	
	public void m2() {
		System.out.println(y);
	}

	public static void main(String[] args) {
		MultipleInheritance mi = new MultipleInheritance();
		mi.m1();
		mi.m2();

	}

}
