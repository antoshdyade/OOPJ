package amd;

import java.io.*;
class Student
{
	int rno;
	String name;
	float page;
}


public class DataWriteReadEx {

	
	public static void main(String[] args) {

		//Writing Data to File
		
		try {
		FileOutputStream fos=new FileOutputStream("F:\\Antosh\\Java\\dout.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		
		Student s=new Student();
		s.rno=3;
		s.name="Antosh";
		s.page=95.3f;
		
		dos.writeInt(s.rno);
		dos.writeUTF(s.name);
		dos.writeFloat(s.page);
		
		dos.close();
		fos.close();
		
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}

		
		//Reading Data from the File	
		
		try {
		FileInputStream fis=new FileInputStream("F:\\Antosh\\Java\\dout.txt");
		DataInputStream dis=new DataInputStream(fis);
		
		Student s1=new Student();
		s1.rno=dis.readInt();
		s1.name=dis.readUTF();
		s1.page=dis.readFloat();
		
		System.out.println("R.No: "+s1.rno);
		System.out.println("Name: "+s1.name);
		System.out.println("Percentage: "+s1.page);
		
		
		
		
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}


	
	
	
	
}
