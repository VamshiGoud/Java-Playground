class instanceIntern
{
	public void hello()
	{
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		interfacetest t = new interfacetest();
		t.hello();
	}

}

interface interfacetest
{
	void hello();
}