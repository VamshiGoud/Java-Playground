class minmax
{
	public static void main(String args[])
	{
		int x[] = {1,2,3,4,5,6,7,8};
		maxmin(x);
	}

	static void maxmin(int x[])
	{
		int max=0;

		for(int i:x)
		{
			if(max<i)
				max=i;
		}

		int min=max;
		for(int j:x)
		{
			if(min>j)
				min=j;
		}

		System.out.println(min+" "+max);

	}
}