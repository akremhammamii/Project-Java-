package part1;

public class Empl {
	
	int eid;
	String ename;
	double sal;
	int deptno;
	String job;
	
	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(deptno);
		System.out.println(job);
	}

	public static void main(String[] args) {
		
		// Creating object 1
		Empl empl =  new Empl();
		empl.eid = 101;
		empl.ename = "Asma";
		empl.sal = 90.50;
		empl.deptno = 10;
		empl.job = "Test Automation";
		empl.display();
		
		// Creating object 2
		Empl empl2 = new Empl();
		empl2.eid = 102;
		empl2.ename = "Halima";
		empl2.sal = 80.50;
		empl2.deptno = 6;
		empl2.job = "DevOps";

	}

}
