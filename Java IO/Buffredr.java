import java.io.*;
class Buffredr{
	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new FileReader("A.txt"));
			char x[] = new char[100];
			br.read(x,0,100);
			System.out.println(new String(x));
		}catch(Exception e){
			System.out.println("Failed");
		}
	}
}