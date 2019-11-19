import java.io.*;
import java.util.*;
class props{
	public static void main(String[] args) {
		try{
			FileReader fr = new FileReader("db.properties");

			Properties pps = new Properties();
			pps.load(fr);
			System.out.println(pps.getProperty("user"));
			System.out.println(pps.getProperty("passwrod")); 
		}catch(Exception e){
			System.out.println("Hello!");
		}
	}
}