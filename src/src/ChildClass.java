package src;

public class ChildClass extends ParentClass
{

	public ChildClass() 
	{
		int a = 1;
		System.out.println("Child Class Constructor  →  "+ a);
	}
	

	public static void main(String[] args) 
	{
		
		
		 //ParentClass p = new ParentClass(); p.demo(); 
		 ChildClass c = new ChildClass();
		 
		
		
	}
	
	public void demo(int a)
	{
		System.out.println("Child class Demo method →  "+ a);
		super.demo();
		System.out.println(a +" "+super.a);
		System.out.println(a);
		System.out.println(this.a);
	}


}
