class split
{
	public static void main(String args[])
	{
		String x = "Hi!, My Names is Vamshi Goud, But you can call me Vamshi Goud.";
		String y[] = x.split(" ");
		for(String i:y)
			System.out.println(i);
	}
}