import java.util.*;
import java.util.regex.*;

class Test2{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String exp = scan.nextLine();
		float result = 0;
		Boolean isSingle = true;
		Boolean isValid = true;
		ArrayList<String> numlst = new ArrayList<String>(Arrays.asList(exp.split("[+-/*//]+")));
		ArrayList<String> opslst = new ArrayList<String>(Arrays.asList(exp.split("[0123456789]+")));
		
		//Checking for valid Expression operators
		for(String ops:opslst){
			System.out.println(ops);
			// if(ops.length()>1){
			// 	isValid = false;
			// 	break;
			// }
		}

		for(String num:numlst){
			System.out.println(num);
			// if (Pattern.matches("[0-9]*", num)) {
			// 	isValid=false;
			// 	break;
			// }
		}
			
		if(isValid){
				result = Integer.parseInt(numlst.get(0));
				numlst.remove(0);

		//System.out.println(result+1);

				if(true){
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
					System.out.println(result);

				}
			
		}	else
					System.out.println("Please Enter a Valid Expression");

	}

}