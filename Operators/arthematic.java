class arthematic
{
	public static void main(String args[])
	{
		System.out.println(mathOp('+',3,2));
	}

	static int mathOp(char op,int x, int y)
	{
		switch(op)
		{
			case '+':
				return x+y;

			case '-':
				return x-y;

			case '*':
				return x*y;

			case '/':
				return x/y;

			default:
				System.out.println("Please enter a valid operator");
				return 0;
		}
	}
}