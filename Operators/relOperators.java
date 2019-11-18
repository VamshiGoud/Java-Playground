import java.util.Scanner;
class relOperators
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int x = scan.nextInt();
		System.out.println("Enter the Second Number:");
		int y = scan.nextInt();

		if(x==y)
			System.out.println(x+" is equal to "+y);
		else if(x!=y)
			System.out.println(x+" is not equal to "+y);
		else if(x < y)
			System.out.println(x+" is less than "+y);
		else if(x > y)
			System.out.println(x+"is greater than "+y);
		else
			System.out.println(x+" is uncomparable to "+y);
	}
}