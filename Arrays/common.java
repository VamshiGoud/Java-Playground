import java.util.*;
class common
{
	public static void main(String args[])
	{
		int x[] = {1,2,3,4,5,6,7,8,9};
		int y[] = {1,3,8,10,56,88,4,7,89,899,8};
		int z[] = commFinder(x,y);
		for(int i: z)
		{
			System.out.println(i);
		}
	}

	static int[] commFinder(int x[],int y[])
	{
		Set<Integer> dupeEle = new HashSet<Integer>();
		for (int i=0;i<x.length; i++)
			for (int j=0; j<y.length; j++)
			{
					if (x[i]==y[j])
						dupeEle.add(x[i]);			
			}
		Integer dupes[] = new Integer[dupeEle.size()];
		dupeEle.toArray(dupes);
		int dupes2[] = new int[dupes.length];
		for (int i = 0;i<dupes.length ;i++ ) {
			dupes2[i]=dupes[i];
		}
		return dupes2; 
	}
}