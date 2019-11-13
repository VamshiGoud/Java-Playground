class copyArray
{
	public static void main(String args[])
	{
		int x[] = new int[5];
		int y[] = {1,2,3,4,5}; 
		System.arraycopy(y,0,x,0,x.length);
		for(int i : x)
		{
			System.out.println(i);
		}
	}


}