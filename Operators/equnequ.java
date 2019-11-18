import java.util.Scanner;
class equnequ
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number 3:");
		int x = scan.nextInt();

		if(x!=3)
			System.out.println("You've entered "+x+" which is not 3.");
		else
			System.out.println("Thank you!");
	}
}