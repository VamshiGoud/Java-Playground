import java.util.Scanner;
class TestContains
{
	public static void main(String args[])
	{
		int x[] = {1,2,3,4,5,6,7,8,9,10};
		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
		Boolean flag = false;

		for(int i:x)
			if (i==y)
			{
				System.out.println("Yes, the array has the value "+y);
				flag = true;
				break;				
			}

		if(!flag)
			System.out.println("No, the array does not contain the value "+y);
	}
}