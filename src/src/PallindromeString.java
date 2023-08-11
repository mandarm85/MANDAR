package src;

public class PallindromeString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub		
		approach1("ABCBA");
	}
	
	static void approach1(String str)
	{
		String temp = str;
		String rev="";
		char ch;
		for (int i = str.length()-1;i>=0;i--)
		{
			ch = str.charAt(i);
			rev = rev+ch;
		}
		if (rev.equals(temp))
			System.out.println(temp+" is Pallindrome");
		else 
			System.out.println(temp+ " is not Pallindrome");
	}

}
