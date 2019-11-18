class A
{
	void aameth()
	{
		System.out.println("Aa Class");
	}
	void abmeth()
	{
		System.out.println("Ab Class");
	}
	void acmeth()
	{
		System.out.println("Ac Class");
	}
}

class B extends A
{
	void Bameth()
	{
		System.out.println("Ba  Class");
	}
	void Bbmeth()
	{
		System.out.println("Bb  Class");
	}

	void acmeth()
	{
		System.out.println("Catttt  Class");
	}
}

class C extends B
{
	void Cameth()
	{
		System.out.println("Ca Class");
	}
	void Cbmeth()
	{
		System.out.println("Cb Class");
	}
	void acmeth()
	{
		System.out.println("Cc Class");
	}
}

class Inheritance
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		C c = new C();

		a.aameth();
		a.abmeth();
		a.acmeth();
		b.Bameth();
		b.Bbmeth();
		b.acmeth();
		b.abmeth();
		c.Cameth();
		c.Cbmeth();
		c.acmeth();
		c.abmeth();
	}
}