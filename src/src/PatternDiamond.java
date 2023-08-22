package src;

public class PatternDiamond 
{

	public static void main(String[] args) 
	{
		int number = 20;
		int row, BlankSpace;
		int Star;
		for (row = 1; row <= number; row++) 
		{
			for (BlankSpace = 0; BlankSpace < number-row; BlankSpace++) 
			{
				System.out.print(" ");
			}

			for (Star = 1; Star <= row * 2 - 1; Star++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}

		for (row = number - 1; row > 0; row--) 
		{
			for (BlankSpace = 1; BlankSpace <= number - row; BlankSpace++) 
			{
				System.out.print(" ");
			}
			for (Star = 1; Star <= row * 2 - 1; Star++) 
			{
				System.out.print("*"); 
			}
			System.out.println();
		}
	}
}