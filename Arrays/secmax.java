class secmax
{
	public static void main(String args[])
	{
		int x[] = {1,5,6,4,7,8,2,3,3,3,5,8,85,5,8,5,8,99};
		System.out.println(secmaxfun(x));
	}

	static int secmaxfun(int x[])
	{
		int max=0;
		int secmax = 0;
		
		for(int i:x)
			if(max<i)
				max=i;

		for(int j:x)
			if (secmax<j && j!=max)
				secmax = j;

		return secmax;
	}
}