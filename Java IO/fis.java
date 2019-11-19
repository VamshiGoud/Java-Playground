import java.io.*;
class fis{
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("A.txt");
			byte bits[] = new byte[100];
			fis.read(bits,0,fis.available());
			fis.close();
			System.out.println(new String(bits));
		}catch(Exception e){
			System.out.println("Failed");
		}
	}
}