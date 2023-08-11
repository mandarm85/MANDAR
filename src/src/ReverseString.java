package src;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		//approach1("MANDAR");
		approach2("MANDAR");
		//approach3("MANDAR MUSRIF");

	}
	
	
	static void approach1 (String str)
	{		
		String Rev = "";
		char ch;
	
		System.out.println(str + " ------ Before Reversing");
		for (int i= str.length()-1 ;i>=0;i--)
		{
			//System.out.println(i);
			ch = str.charAt(i);
			Rev = Rev+ ch;
		}
		System.out.println(Rev + " ------ After Reversing");
	}
	
	static void approach2 (String str)
    {	
		
        if ((str==null)||(str.length() <= 1))
           System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            approach2(str.substring(0,str.length()-1));
        }
    }
	
	static void approach3 (String str)
   {	
		if ((str!=null)||(str.length()>=1))
        {
        	System.out.print(str.charAt(str.length()-1));
        	approach2(str.substring(0,str.length()-1));
        }
        else
        {
            System.out.println(str);
        }
    }
	
	
	
	

}
