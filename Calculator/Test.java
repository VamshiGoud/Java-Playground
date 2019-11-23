import java.util.*;
import java.util.regex.*;

class Test{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String exp = scan.nextLine();
		float result = 0;
		Boolean calcing = true;
		Boolean isSingle = false;
		ArrayList<String> numlst = new ArrayList<String>(Arrays.asList(exp.split("[+-/*//]+")));
		ArrayList<String> opslst = new ArrayList<String>(Arrays.asList(exp.split("[0123456789]+")));
		
		for(String e:numlst)
			System.out.println(e);
		System.out.println("--------------------------");

		for(int i = 0; i<opslst.size();i++)
			if(opslst.get(i).length()<1){
				opslst.remove(i);
				System.out.println("Right here");
			}
			else
				System.out.println(opslst.get(i));
		System.out.println("--------------------------");

		if(!Character.isDigit(exp.charAt(0))){
			System.out.println("The First Operator is "+opslst.get(0));
			System.out.println("------------------------");
			opslst.remove(0);
			for(String f:opslst)
				System.out.println(f);
			 System.out.println("--------------------------");
		}

		for(String f:opslst)
			if(f.length()>1){
				System.out.println("Please enter a valid Expression "+f);
				break;
			}
		System.out.println("----------------------------");
		for(String g:opslst)
			System.out.println(g);

		System.out.println("--------------------------");
		System.out.println(opslst.size());
		for(String h:numlst)
			System.out.println(h);
		System.out.println(numlst.get(0));
		
		result = Integer.parseInt(numlst.get(0));
		numlst.remove(0);

		//System.out.println(result+1);

		if(numlst.size()==opslst.size()){
			for (int i = 0;i<opslst.size() ;i++) {
				switch(opslst.get(i)){
					case "+":
						result += Integer.parseInt(numlst.get(i));
						System.out.println(result);
						break;
					case "-":
						result -= Integer.parseInt(numlst.get(i));
						System.out.println(result);
						break;
					case "*":
						result *= Integer.parseInt(numlst.get(i));
						System.out.println(result);
						break;
					case "/":
						result /= Integer.parseInt(numlst.get(i));
						System.out.println(result);
						break;
					default:
						System.out.println("something went wrong");
				}
			}
		}


		System.out.println(result);
	}
}