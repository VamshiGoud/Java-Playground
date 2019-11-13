class findmiss
{
	public static void main(String args[])
	{
		int x[]=new int[100];
		int jmp=0;
		for (int i=1;i<=100 ;i++ )
			if(i!=53)
				x[i-jmp-1]=i;
			else
				jmp=1;

		for(int i:x)
			System.out.println(i);

		System.out.println(findmissing(x));
	}

	static int findmissing(int x[])
	{
		int missing=0;
		for (int i = 0;i<x.length;i++) 
		{
			if(x[i]+1!=x[i+1]){
				missing= x[i]+1;
				break;
			}
		}
		return missing;
	}
}