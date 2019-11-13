class eoArray
{
	public static void main(String args[])
	{
		int x[] = {1,2,3,4,5,6,7,8,9,10,12};
		eoprinter(x);
	}

	static void eoprinter(int x[])
	{
		int evenc = 0;
		int oddc = 0;

		for(int i:x)
			if(i%2==0)
				evenc++;
			else
				oddc++;

		System.out.println("The array contains "+evenc+" even and "+oddc + " odd numbers");
	}
}