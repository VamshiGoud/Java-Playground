class A
{
	public int x = 1;
	public int y = 2;
	public void printx()
	{
		System.out.println(x);
	}

	public void printy()
	{
		System.out.println(y);
	}
}
class B extends A
{
	public int z = 3;
	public int w = 20;
	public void printz()
	{
		System.out.println(z);
	}
	public void printw()
	{
		y=3;
		System.out.println(w);
	}
}

class C extends B
{
	public int i = 10;
	public int j = 63;
	public void printi()
	{
		System.out.println(i);
	}
	public void printj()
	{
		w = 45;
		System.out.println(j);
	}


}


class datmem
{
	public static void main(String args[])
	{
			A a = new A();
	B b = new B();
	C c = new C();

	a.printx();
	a.printy();
	b.printz();
	b.printw();
	b.printy();
	c.printi();
	c.printj();
	c.printw();
	}
}