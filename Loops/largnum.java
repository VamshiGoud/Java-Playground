import java.util.Scanner;

class largnum
{
	public static void main(String args[])
	{
		int x;
		int y;
		int z;

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter first num:");
		x = inp.nextInt();
		System.out.println("Enter second num:");
		y = inp.nextInt();
		System.out.println("Enter third num:");
		z = inp.nextInt();

		if(x < y)
			if(y < z)
				System.out.println("The " + z + " is Biggest amoung the three numbers");
			else
				System.out.println("The " + y + " is Biggest amoung the three numbers");
		else
			if(x < z)
				System.out.println("The " + z + " is Biggest amoung the three numbers");
			else
				System.out.println("The " + x + " is Biggest amoung the three numbers");

	}	
}