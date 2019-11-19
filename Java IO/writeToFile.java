import java.io.*;
class writeToFile{
	public static void main(String[] args) {
		try{
			File file = new File("C:/Users/LENOVO/Documents/GitHub/Java Playground/Java IO/output.txt");
			FileWriter fw = new FileWriter(file);
			if (file.exists()) {
				fw.write("Hello how are you");
				System.out.println("Done!");
			}fw.close();
		}catch (Exception e) {
			System.out.println("No such file exist");
		}
	}
}