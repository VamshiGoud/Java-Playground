class switchcase
{
	public static void main(String args[])
	{
		int x = 35;

		switch(x%2)
		{
			case 0:
				System.out.println(x+" is a even number");
				break;

			default:
				System.out.println(x+" is odd number");
		}
	}
}