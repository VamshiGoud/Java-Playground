class defaultmod
{
	public static void main(String args[])
	{
		defaultsub ds = new defaultsub();
		ds.hello();
		System.out.println(ds.x);
	}
}

class defaultsub
{
	int x = 35;
	void hello()
	{
		System.out.println("Hello from the other side");
	}
}