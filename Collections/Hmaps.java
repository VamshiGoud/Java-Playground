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
	}
}