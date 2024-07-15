package accessModifiers;


class A{
	
//	private int data = 20;
//	private void m1() {};
	
//	int data  = 30;
//	void m1() {
//		System.out.println(data);
//	}
	
	protected int data  = 50;
	protected void m1() {
		System.out.println(data);
	}
}

public class Simple {

	public static void main(String[] args) {
		
		A aobj = new A();
		aobj.data = 20;
		aobj.m1();

	}

}
