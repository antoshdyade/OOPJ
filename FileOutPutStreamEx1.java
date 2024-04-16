package amd;

import java.io.FileOutputStream;

public class FileOutPutStreamEx1 {

	public static void main(String[] args)throws Exception {
		
		FileOutputStream fis=new FileOutputStream("D:/JavaCode/out.txt");
		String msg="Welcome to Java Lab";
		
		byte b[]=msg.getBytes();
		
		//Method 1
	/*  for(byte x:b)
		  fis.write(x);
		*/
		
		//Method 2
		/*
		fis.write(b);
		*/
		
		//Method 3
		fis.write(b, 11, msg.length()-11);  //Writes "Java Lab"
		

	}

}
