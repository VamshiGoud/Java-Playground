import java.lang.Math;

class lasdif
{
	public static void main(String args[])
	{
		int x[] = {1,2,3,4,5,6,7,8};
		diffmaxmin(x);
	}

	static void diffmaxmin(int x[])
	{
		int max=0;

		for(int i:x)
		{
			if(max<i)
				max=i;
		}

		int min=max;
		for(int j:x)
		{
			if(min>j)
				min=j;
		}

		System.out.println(Math.abs(min-max));

	}
}