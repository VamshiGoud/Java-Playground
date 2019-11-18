interface intern
{
	void hello();
	void world();
}

class twoMethInterface implements intern
{
	public void hello()
	{
		System.out.println("Hello, World");
	}

	public static void main(String args[])
	{
		twoMethInterface t = new twoMethInterface();
		t.hello();
	}
}