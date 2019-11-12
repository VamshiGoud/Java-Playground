class goblocvar
{
	//Declaring a Global variable
	static String var ="I'm Global";

	public static void main(String args[])
	{
		gob();
		loc();
	}

	static void gob()
	{
		System.out.println(var);
	}

	static void loc()
	{
		//Declaring a Local variable
		String var = "I'm Loco!";

		System.out.println(var);
	}
}