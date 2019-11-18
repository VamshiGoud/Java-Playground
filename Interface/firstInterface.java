interface fInterface
{
	final int x = 32;
	void print();
}

class firstInterface implements fInterface
{
	public void print()
	{
		System.out.println(x);
	}
	public static void main(String args[])
	{
		firstInterface t = new firstInterface();
		t.print();
	}
}