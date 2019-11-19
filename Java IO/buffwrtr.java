import java.io.*;
class buffwrtr{
	public static void main(String[] args) {
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
			String x = "0000000000000000000";
			bw.write(x.toCharArray(),0,x.toCharArray().length);
			bw.close();
			System.out.println("Success");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}