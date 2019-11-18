class privatemod
{
	private int x = 10;

	private static void hello()
	{
		System.out.println("calling Private Hello in main class");
	}

	public static void main(String args[])
	{
		hello();
		Test t = new Test();
		t.publicHello();
		t.privatehello();
	}
}

class Test
{
	private int x = 10;
	private void privatehello()
	{
		System.out.println("calling Private Hello");
	}

	public void publicHello()
	{
		System.out.println("calling Public Hello");
	}
}