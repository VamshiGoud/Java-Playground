class incdec
{
	static int indc(int typ, int x)
	{
		if(typ==1)
			return x+1;
		else if (typ==0)
			return x-1;
		else
			System.out.println("Please select a valid operator");
			return 0;
	}

	public static void main(String args[])
	{
		int x = 2;
		System.out.println(indc(0,x));
	}
}