import java.io.*;

class readfrmFile{
	public static void main(String[] args) {
		try{
			
			File file = new File("C:/Users/LENOVO/Documents/GitHub/Java Playground/Java IO/A.txt");
			char x[] = new char[100];
			FileReader fr = new FileReader(file);
			fr.read(x);
			String y = null;

			if (file.exists()) {
				y = new String(x);
				System.out.println(y);
			}

			fr.close();

		}catch(Exception e){
			System.out.println("File not Found?");
		}
	}
}