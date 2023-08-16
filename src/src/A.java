package src;

public class A
{
	int A = 1;

	public A() 
	{
		System.out.println("Constructor A");
	}

	public static void main(String []args)
	{
		
		//B b = new B(); 
		C c = new C();
		
		c.methodA();
		c.methodB();
		c.methodC();
		System.out.println(c.A);
		System.out.println(c.B);
		System.out.println(c.C);
		
		
		System.out.println(c.getClass());
		B b= new B();
		System.out.println(b.getClass());
		A a = new A();
		System.out.println(a.getClass());

		
		

	}
	
	public void methodA()
	{
		System.out.println("Method A");
		
	}

}
