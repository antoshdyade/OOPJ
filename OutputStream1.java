package amd;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream1 {

	public static void main(String[] args) {
	try {
		 FileOutputStream fos=new FileOutputStream("E:/Java/MyFile.txt");
	     String msg="Welcome to Java Class";
	    byte b[]=msg.getBytes();      

//Method1
	     //for(byte x:b)
		// fos.write(x);
	  
//Method 2  
	    // fos.write(b);

//Method 3
		fos.write(b,11,msg.length()-11);
		 fos.close();
	
	} catch (FileNotFoundException e) {
		System.out.println(e);
	}catch (IOException e) {
		System.out.println(e);
	}
	
	}
}