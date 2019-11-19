import java.util.*;

class Alist{
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("Vamshi");
		al.add("Raju");
		al.add("Shyam");
		al.add("Babu");
		al.add("Sabu");
		al.add("Mangal Pandey");
		al.add("Jansi Lakshmi Bhai");
		al.add("Sameer Subramanyam");
		al.add("Somu");
		al.add("Ramu");
		
		Iterator itr = al.iterator();

		while(itr.hasNext())
			System.out.println(itr.next());

		System.out.println("-------------Adding element at specific index(5)-----------------");
		al.add(5,"Hello");
		itr = al.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("----------------Removeing an element from the List(Vamshi)-----------");
		al.remove("Vamshi");
		itr = al.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("--------------------Particular Index (6)-------------------------");
		System.out.println(al.get(6));
		System.out.println("-------------------------Size of ArrayList----------------------");
		System.out.println(al.size());
		System.out.println("------------------- Check if the given element is present----------------------");
		System.out.print("Checiking for the element 'Sabu': "+al.contains("Sabu"));
		System.out.println("------------------------Removing all the elements in the List-------------------");
		al.clear();
	}
}