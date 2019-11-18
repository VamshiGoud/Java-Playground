class callasmaimimm
{
	private void printInstance()
	{
		System.out.println("Printing Instace");
	}

	static void callPrintInstance()
	{
		System.out.println("Printing static");
	}

	public static void main(String args[])
	{
		callPrintInstance();
		printInstance();
	}
}

//cannot call instance methods from main or static method