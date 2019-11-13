class Prime
{
	public static void main(String args[])
	{
		int x = 3;
		int y = x/2;
		Boolean prime=true;

		if(x==0 || x==1)
			System.out.println(x + " is Not a prime number");
		else
			for (int i = 2;i <= y ;i++)
			{
				if(x%i==0)
				{
					System.out.println(x + " is Not a prime number");
					prime = false;
					break;
				}
			}

		if(prime)
			System.out.println(x + " is a prime number");

	}
}