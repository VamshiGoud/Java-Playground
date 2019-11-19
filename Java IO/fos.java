import java.io.*;
class fos{
	public static void main(String[] args) {
		try{
			FileOutputStream fos = new FileOutputStream("output.txt");
			String x = "Hi this is using FileOutputStream.";
			fos.write(x.getBytes());
			fos.close();
			System.out.println("Success");
		}catch(Exception e){
			System.out.println("Failed");
		}
	}
}