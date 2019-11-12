class Signature 
{
	public static void main(String args[])
	{
		DisplayName();
		DisplayName("Vamshi");
	}

	static void DisplayName()
	{
		System.out.println("No name is provided in the arguments");
	}

	static void DisplayName(String name)
	{
		System.out.println("The name is "+name);
	}
}