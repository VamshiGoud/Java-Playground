class Cimism
{
	private void printInstance()
	{
		System.out.println("Printing Instace");
	}

	static void callPrintInstance()
	{
		printInstance();
	}

	public static void main(String args[])
	{
		callPrintInstance();
	}
}