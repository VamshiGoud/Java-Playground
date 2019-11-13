class reverse
{
	public static void main(String args[])
	{
		int x[] = {1,2,3,4,5,6};
		for(int i:x)
			System.out.println(i);

		x = reverser(x);
		for(int j:x)
			System.out.println(j);
	}

	static int[] reverser(int x[])
	{
		int y[] = new int[x.length];
		for (int i=0;i<x.length;i++)
		{
			y[x.length-1-i] = x[i];
		}
		return y;
	}

}