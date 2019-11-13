import java.util.Scanner;
class MFSwitch
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter your Gender:");
		String gender = scan.nextLine();

		switch(gender)
		{
			case "M":
			case "m":
			case "Male":
			case "male":
				System.out.println("Your are a Male Human");
				break;

			case "f":
			case "F":
			case "Female":
			case "female":
				System.out.println("Your are a Female Human");
				break;		
		}
	}
}