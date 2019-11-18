import java.util.Scanner;
class equorn
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		int x = scan.nextInt();
		System.out.println("Please enter the second number:");
		int y = scan.nextInt();
		if(x==y)
			System.out.println("Yes, "+x+" and "+y+" are equal");
		else if(x!=y)
			System.out.println("No, "+x+" and "+y+" are not equal");
	}
}