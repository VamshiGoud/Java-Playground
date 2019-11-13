import java.util.*;
class dupeRem
{
	public static void main(String args[])
	{
		int x[] = {1,1,5,6,3,7,8,6,6,2,2,9,9};

		for(int i: x)
			System.out.println(i);

		Set<Integer> dupeEle = new HashSet<Integer>();
		for (int i=0;i<x.length; i++)	
			dupeEle.add(x[i]);
		Integer dupes[] = new Integer[dupeEle.size()];
		dupeEle.toArray(dupes);
		int y[] = new int[dupes.length];
		for (int i = 0;i<dupes.length ;i++ ) {
			y[i]=dupes[i];
		}

		System.out.println("After removing duplicates");
		for(int i: y)
			System.out.println(i);
	}
}