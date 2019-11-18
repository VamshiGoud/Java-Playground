import java.util.Scanner;
class indexof
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Character to find:");
		String str = "abcdefghijklmonpqrstuvwxyz";
		char findletter=scan.next().charAt(0);
		System.out.println("The entered character is at "+str.indexOf(findletter));
	}
}