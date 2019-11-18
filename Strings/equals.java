import java.util.Scanner;

class equals
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String x = "Cat";
		System.out.println("Please Enter Cat");
		String y = scan.nextLine();

		if(x.equals(y))
			System.out.println("Thank You!");
		else
			System.out.println("Why won't you listen to me?");
	}
}