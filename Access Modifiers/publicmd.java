package aaa;
import bbb.*;

class publicmd
{
	public static void main(String args[])
	{
		System.out.println("Hello from pack aaa");
		publicmdpack t = new publicmdpack();
		System.out.println(t.getx());
		t.setx(56);
		System.out.println(t.getx());
	}
}