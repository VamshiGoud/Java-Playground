import java.util.Scanner;
class smllarg
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First Number:");
		int x = scan.nextInt();
		System.out.println("Enter the Second Number:");
		int y = scan.nextInt();

		if(x==y)
			System.out.println("Both are equal");
		else if(x > y)
			System.out.println(x+" is larger and "+y+" is smaller");
		else if(x < y)
			System.out.println(y+" is larger and "+x+" is smaller");
		else
			System.out.println(x+" is uncomparable to "+y);
	}
}