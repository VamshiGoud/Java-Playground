import java.util.regex.*;
import java.util.Scanner;

class Regex
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String x = scan.nextLine();
		if(Pattern.matches(".a.",x))
			System.out.println("Pattern Matches "+x);
		else
			System.out.println(x+" is not Correct");
	}
}