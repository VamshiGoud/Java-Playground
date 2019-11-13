import java.lang.Math;

class Armstrong
{
	public static void main(String args[])
	{
		int x = 1634;
		int temp = x;
		int y;
		int sum=0;
		int mult;

		int count = 0;
		while(x != 0)
		{
			x/=10;
			count++;
		}
		x = temp;
		//System.out.println(count);

		while(x>0)
		{
			y = x%10;
			sum += Math.pow(y,count);
			x/=10;
		}
		//System.out.println(sum);
 
		if(temp == sum)
			System.out.println(temp + " is a Armstrong number");
		else
			System.out.println(temp + " is a not Armstrong number");
	}
}