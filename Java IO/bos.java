import java.io.*;
class bos{
	public static void main(String[] args) {
		try{
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("A.txt"));
			String x = "Hello Im using BufferedOutputStream to write this file";
			bos.write(x.getBytes(),0,x.getBytes().length);
			bos.close();
			System.out.println("Success");
		}catch(Exception e){
			System.out.println("Failed");
		}

	}
} 