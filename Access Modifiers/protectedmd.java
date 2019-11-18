package com;
class protectedmd
{
	public static void main(String args[])
	{
		Test t = new Test();
		t.hello();
		System.out.println(t.x);
	}
}

class Test
{
	protected int x = 10;
	protected void hello()
	{
		System.out.println("calling protected method hello");
	}
}