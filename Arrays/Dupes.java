import java.util.*;
class Dupes
{
	public static void main(String args[])
	{
		int x[] = {1,1,5,6,3,7,8,6,6,2,2,9,9};
		int y[] = dupeFinder(x);
		for(int i: y)
		{
			System.out.println(i);
		}
	}

	static int[] dupeFinder(int x[])
	{
		Set<Integer> dupeEle = new HashSet<Integer>();
		for (int i=0;i<x.length; i++)
			for (int j=0; j<x.length; j++)
			{
					if (x[i]==x[j] && i!=j)		
						dupeEle.add(x[j]);			
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