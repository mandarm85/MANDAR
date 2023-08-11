package src;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
		approach1(1234);
		approach2(1234);
		approach3(1234);


	}
	
	static void approach1(int Num)
	{		
		System.out.println("Approach1");
		int Rev = 0;
		System.out.println(Num);
		while(Num!=0)
		{
			Rev = Rev *10 +Num%10;
			Num = Num/10;
		}
		System.out.println(Rev);
	}
	
	static void approach2(int Num)
	{	
		System.out.println("Approach2");
		System.out.println(Num);
		StringBuffer S = new StringBuffer(String.valueOf(Num));
		System.out.println(S.reverse());
	}
	
	static void approach3(int Num)
	{	
		System.out.println("Approach3");
		System.out.println(Num);
		StringBuilder S = new StringBuilder(String.valueOf(Num));
		System.out.println(S.reverse());
	}
}
