class AddArray
{
	public static void main(String args[])
	{
		int y[] = {1,2,3,4};
		addInts(y);
	}

	static void addInts(int x[])
	{
		int sum=0;
		for(int i:x)
			sum+=i;

		System.out.println(sum);
	}
}