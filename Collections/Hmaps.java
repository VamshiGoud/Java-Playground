import java.util.*;
class Hmaps{
	public static void main(String[] args) {
		HashMap<Integer,String> Hlist = new HashMap<Integer,String>();
		Hlist.put(1,"AA");
		Hlist.put(2,"BB");
		Hlist.put(3,"CC");
		Hlist.put(4,"DD");
		Hlist.put(5,"EE");
		Hlist.put(6,"FF");
		Hlist.put(7,"GG");
		Hlist.put(8,"HH");
		Hlist.put(9,"II");
		Hlist.put(10,"JJ");
		for(Map.Entry<Integer,String> entry:Hlist.entrySet())
			System.out.println(entry.getKey()+" "+entry.getValue());
		System.out.println("----------------Printing particular Key Value (2)----------------");
		System.out.println(Hlist.get(2));
		System.out.println("----------------Inserting a key value (11)-----------------------");
		Hlist.put(11,null);
		System.out.println(Hlist.get(11));
		System.out.println("----------------Creating clone of the HashMap-------------------");
		HashMap<Integer,String> Ulist = Hlist;
		System.out.println(Hlist.clone());
		for(Map.Entry<Integer,String> entry : Ulist.entrySet())
			System.out.println(entry.getKey()+" "+entry.getValue());
		System.out.println("-----------------Checking for a Particular key Value");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a key to check if it exists");
		if(Hlist.containsKey(scan.nextInt()))
			System.out.println("Yes, the key exists.");
		else
			System.out.println("No, The key is in your Imagination.");
		System.out.println("-----------------Printing all the Key values-------------------");
		System.out.println(Hlist.keySet());
		System.out.println("-----------------Printing all the values-------------------");
		for(Map.Entry<Integer,String> entry:Hlist.entrySet())
			System.out.println(entry.getValue());
		System.out.println("-----------------Removing an Entry from the set-------------");
		Hlist.remove(6);
		for(Map.Entry<Integer,String> entry:Hlist.entrySet())
			System.out.println(entry.getKey()+" "+entry.getValue());


	}
}