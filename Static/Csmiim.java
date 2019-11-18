class Cimism
{
	static void printInstance()
	{
		System.out.println("Printing Instace");
	}

	private void callPrintInstance()
	{
		printInstance();
	}

	public static void main(String args[])
	{
		callPrintInstance();
	}
}