package oops;

public class constractor {
	int empid;
	String empname;
	int salary;
	int deptno;
	
	constractor (int id, String name, int sal, int dno)
	{
		empid=id;	
		empname=name;
		salary=sal;
		deptno=dno;
	}
	
	void display() 
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
	}
	
	public static void main(String args[])
	{
		constractor emp1=new constractor (1000, "Liudmyla", 4500, 10);
		emp1.display();		
		
	}
	
}
