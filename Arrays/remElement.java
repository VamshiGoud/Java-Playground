import java.util.*;

class remElement
{
	public static void main(String args[])
	{
		List<Integer> y = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
		System.out.println(y.toString());
		int x = 20;
		remele(y,x);
		System.out.println(y.toString());

	}

	static void remele(List<Integer> x,int y)
	{
		int z= 0;
		for (int i = 0;i < x.size(); i++)
		{
			if (x.get(i)==y)
			{
				z=i;
				break;
			}
		}
		x.remove(z);
	}

}