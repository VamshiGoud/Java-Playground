import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String pali = scan.nextLine();
		Boolean isPali=true;


		for (int i = 0; i<pali.length()/2 ;i++)
		{
			if(pali.charAt(i) != pali.charAt(pali.length()-1-i))
			{
				isPali = false;
				break;
			}
		}
		
		if (isPali)
			System.out.println( pali + " is a Palindrome Number");
		else
			System.out.println( pali + " is a not a Palindrome Number");
	}
}