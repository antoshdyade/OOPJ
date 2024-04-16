package amd;
import java.io.*;
public class FileCopyUpperToLower {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("D:/JavaCode/in.txt");
		FileOutputStream fos=new FileOutputStream("D:/JavaCode/out.txt");

		int x;
		while((x=fis.read())!=-1) {
			if (x>=65 && x<=90)fos.write(x+32);
			else
				fos.write(x);
		}
	}

}
