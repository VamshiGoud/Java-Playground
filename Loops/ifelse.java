class ifelse
{
	public static void main(String args[])
	{
		int x = 10;
		int y = 30;
		int z = 20;

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