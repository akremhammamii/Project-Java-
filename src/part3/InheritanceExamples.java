package part3;

class A { //Parent
	
	String name;
	void display() {
		System.out.println(name);
	}
}


class B extends A{ //B is child class, A is parent class
	
	int b;
	void print() {
		System.out.println(b);
	}
}

//Multilevel

class C extends B {
	
	int c;
	void show() {
		System.out.println(c);
	}
}



public class InheritanceExamples {

	public static void main(String[] args) {
		
		//Single
		A aobj = new A();
		aobj.name = "Manel";
		aobj.display();
		
		B bobj = new B();
		bobj.b = 200;
		bobj.print();
		bobj.name = "Halima";
		bobj.display();
		
		//Multilevel
		C cobj = new C();
		cobj.c = 50;
		cobj.show();
		
		cobj.b = 20;
		cobj.print();
		
		cobj.name = "Ahmed";
		cobj.display();
		

	}

}
