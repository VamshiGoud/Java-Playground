import java.util.*;
import java.util.regex.*;

class calcTest{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String expTxt = scan.nextLine();
		System.out.println(Pattern.matches("[0-9]*", expTxt));
	}
}