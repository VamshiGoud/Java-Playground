import java.util.Scanner;
import java.io.*;
class ioExcp{
	public static void main(String[] args) {
		try{
			Scanner scan = new Scanner(System.in);
			String e = scan.nextLine();
			System.out.println(e);
			File file = new File("//EE.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			br.close();
			System.out.println(br.readLine());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}