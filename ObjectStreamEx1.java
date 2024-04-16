package amd;
import java.io.*;
class Person implements Serializable{
	String name;
	int age;
	public Person(String n, int a) {
		name=n;
		age=a;
	}
}



public class ObjectStreamEx1 {

	public static void main(String[] args)throws Exception {
		
		//Writing Object
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:/Java/person.txt"));
		
		Person p=new Person("Krishna",8);
		
		oos.writeObject(p);
		
		oos.close();
		
		
		//Reading Object
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("E:/Java/person.txt"));
		
		Person p1=(Person)ois.readObject();
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		ois.close();
	
	}

}
