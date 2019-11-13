class Average
{
	public static void main(String args[])
	{
		int y[] = {2,3,2,3};
		AverageArray(y);
	}

	static void AverageArray(int x[])
	{
		int sum=0;
		for(int i:x)
			sum+=i;

		System.out.println(sum/x.length);
	}
}