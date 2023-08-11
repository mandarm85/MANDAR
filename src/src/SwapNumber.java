/**
 * 
 */
package src;

public class SwapNumber 
{

	public static void main(String[] args) 
	{
		Approach1(10,20);
		Approach2(10,20);
		Approach3(10,20);
		Approach4(10,20);
		Approach5(10,20);
	}
	static void Approach1(int A, int B)
	{
		System.out.println("Approach1");
		int C = 0;
		System.out.println(A+" "+B);
		C=A;
		A=B;
		B =C;
		System.out.println(A+" "+B);
	}
	
	static void Approach2(int A, int B)
	{
		System.out.println("Approach2");
		System.out.println(A+" "+B);
		A = A+B;
		B = A-B;
		A = A-B;
		System.out.println(A+" "+B);
	}
	
	static void Approach3(int A, int B)
	{
		System.out.println("Approach3");
		System.out.println(A+" "+B);
		A = A*B;
		B = A/B;
		A = A/B;
		System.out.println(A+" "+B);
	}
	
	static void Approach4(int A, int B)
	{
		System.out.println("Approach4");
		System.out.println(A+" "+B);
		A = A^B;
		B = A^B;
		A = A^B;
		System.out.println(A+" "+B);
	}
	
	static void Approach5(int A, int B)
	{
		System.out.println("Approach5");
		System.out.println(A+" "+B);
		B=A+B-(A=B);
		System.out.println(A+" "+B);
	}
	

}
