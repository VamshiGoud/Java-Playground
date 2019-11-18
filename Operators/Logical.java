class Logical
{
	public static void main(String args[])
	{
		int x=1;
		int y=2;
		Boolean z=false;
		if(x==1 && y==2)
			System.out.println("x==1 and y==2");
		else
			System.out.println("x!=1 or y!=2");

		if(x==1 || y==1)
			System.out.println("Either x or y is equal to 1");
		else
			System.out.println("Nothing is equal to 1");
		
		if(!z)
			System.out.println("z is false");
		else
			System.out.println("z is true");

	}	
}