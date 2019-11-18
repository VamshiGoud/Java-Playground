class printivfsm
{
	private int x = 33;

	static void printI()
	{
		System.out.println(x);
	}

	public static void main(String args[])
	{
		//Instance variables cannot be used in static methods
		printI();
	}
}