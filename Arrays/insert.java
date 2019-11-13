class insert
{
	public static void main(String args[])
	{
		int x[] = {1,2,3,4,5,6,7,8,9};
		x = insertele(x,8,3);
		for(int i: x)
			System.out.println(i);

	}

	static int[] insertele(int x[],int y,int at)
	{
		x[at] = y;
		return x;
	}
}