package src;

public class PallindromeNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		approach1(23466432);	
	}
	
	
	static void approach1(int Num)
	{	
		int originalNum = Num;
		int rev = 0;
		while (Num!=0)
		{
			rev = rev*10 +Num%10;
			Num= Num/10;
			//System.out.println(rev);		
		}
		if (originalNum == rev)
			System.out.println(originalNum + " Number is Pallindrome");
		else
			System.out.println(originalNum + " Number is Not Pallindrome");		
	}
}
