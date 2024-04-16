package amd;

import java.io.FileInputStream;

public class FileInputStreamEx1 {

	public static void main(String[] args)throws Exception {
		FileInputStream fis=new FileInputStream("D:/JavaCode/out.txt");
		
		//Method 1
		
		int x;
		while((x=fis.read())!=-1) {
			System.out.print((char)x);
		}
		
		
		//Method 2
		/*byte[] b=new byte[fis.available()];
		fis.read(b);
		String msg=new String(b);
		System.out.println(msg);
		*/
		
		//Method 3
		/*fis.skip(5);
		byte[] b=new byte[fis.available()];
		fis.read(b,0,b.length);
		String msg=new String(b);
		System.out.println(msg);
			*/	
				
	}

}
