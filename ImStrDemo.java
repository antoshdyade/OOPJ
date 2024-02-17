package amd;

public class ImStrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Hello";
		StringBuilder s2=new StringBuilder("Hello");
		StringBuffer s3=new StringBuffer("Hello");
		
		s1.concat("Hi");
		s2.append(" SVERI");
		s3.append(" SVERI");
		
		System.out.println("String Demo: "+s1);
		System.out.println("StringBuilder Demo: "+s2);
		System.out.println("StringBuffer Demo:"+s3);

	}

}
