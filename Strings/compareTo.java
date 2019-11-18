class compareTo
{
	public static void main(String args[])
	{
		String x = "Vamshi";
		String y = "vamshi";
		String z = "vamshi";
		String w = "CatFish";

		if(x.equalsIgnoreCase(y))
			System.out.println(x+" and "+y+" are same Ignoring case");
		else
			System.out.println(x+" and "+y+" are not same");

		if(y.compareTo(z)==0)
			System.out.println(y+" and "+z+" are same, using CompareTo() method");
		else
			System.out.println(y+" and "+z+" are not same");

		if(w.startsWith("Ca"))
			System.out.println(w+" starts with 'Ca'");

		if(w.endsWith("sh"))
			System.out.println(w+" ends with 'sh'");


	}
}