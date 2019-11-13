class findele
{
	public static void main(String args[])
	{
		int x[] = {1,2,3,4,5,23,7,8,9,10,12};
		findelem(x,12,23);
	}

	static  void findelem(int x[],int y,int z)
	{
		for(int i:x)
			if(i==y)
				System.out.println("Found "+i+"!");
			else if(i==z)
				System.out.println("Found "+i+"!");
	}
}