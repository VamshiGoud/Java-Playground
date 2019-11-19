import java.io.*;

class bis{
	public static void main(String[] args) {
		try{
			
			byte x[] = new byte[100];
			FileInputStream fr = new FileInputStream("C:/Users/LENOVO/Documents/GitHub/Java Playground/Java IO/A.txt");
			BufferedInputStream bis = new BufferedInputStream(fr);
			System.out.println(bis.available());
			bis.read(x,0,bis.available());
			String y = new String(x);
			System.out.println(y);
			bis.close();
			fr.close();

		}catch(Exception e){
			System.out.println("File not Found?");
		}
	}
}