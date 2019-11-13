import java.util.Scanner;
class indexElement
{
	public static void main(String args[])
	{
		int x[] = {1,2,3,4,5,6,7,8,9,10};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number between 1 - 10 to find out its index");
		int y = scan.nextInt();

		for (int i = 0;i < x.length; i++)
		{
			if (x[i]==y)
			{
				System.out.println(y + " is at index "+i);
			}
		}
	}
}