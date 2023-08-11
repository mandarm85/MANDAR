package src;

public class Test1 
{
	public static void main (String args[])
	{
	
		System.out.println("New");
		
		System.out.println(getnumber(10));
	}
	
	
	
	static int getnumber(int x)
	{
		try 
		{		
			System.out.println("In Try");
			
			 //int A= 10/0;

			
			
			 //String s = null; System.out.println(s.toString());
			 
			 
			 
			 
			
			 //char[] char_arr = { 'a', 'b', 'c', 'd', 'e' }; System.out.println(char_arr[10]);
			 
			
			
			 //int[] int_arr = new int[8]; System.out.println(int_arr[10]);
			 
			
			
			return 10;
		}
		catch (Exception e)
		{
			System.out.println("in Catch");
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			
		}
		finally
		{
			System.out.println("In Finally");
			return 100;
		}
		
		
	}
	
}






