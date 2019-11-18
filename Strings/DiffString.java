class DiffString
{
	public static void main(String args[])
	{
		String x1 = "Direct method";
		String x2 = new String("Through Constructor");
		char chars[] = {'T','h','r','o','u','g','h',' ','c','h','a','r',' ','a','r','r','a','y'};
		String x3 = new String(chars);

		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);

	}
}