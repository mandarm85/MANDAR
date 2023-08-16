package src;

public class ParentClass extends GrandParent
{
	int a = 100;
	ParentClass()
	{
		int a = 10;
		System.out.println("Parent Class Constructor →  "+a);
	}
	
	ParentClass(int a)
	{
		System.out.println("Parent Class Parameterized Constructor →  " + a);
	}


	public void demo()
	{
		System.out.println("Parent class Demo method →  "+ a);
		super.demo();
		System.out.println(a +" "+super.a);
		
	}
	
}
