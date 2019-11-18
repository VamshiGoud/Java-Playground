class printsvfim
{
	static int x = 33;

	private void printI()
	{
		System.out.println(x);
	}

	public static void main(String args[])
	{
		//Static variables cannot be used in instance methods
		printI();
	}
}