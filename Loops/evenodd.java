import java.util.*;

class evenodd
{
	public static void main(String args[])
	{
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();

		for (int i = 0; i<20 ; i++ ) 
		{
			if(i%2==0)
				even.add(i);
			else
				odd.add(i);
		}

		System.out.println("Printing Even numbbers");
		for (int i=0; i<10 ;i++ )
			System.out.println(even.get(i)+", ");

		System.out.println("Printing odd numbbers");
		for (int j=0; j<10; j++ )
			System.out.println(odd.get(j)+", ");
	}
}