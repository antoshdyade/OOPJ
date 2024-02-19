package amd;

public class Cadd {
	
	int a, b,c;
	
	public Cadd()
	{
		a=0;
		b=0;
		c=0;
		System.out.println(a+b+c);
	}
	
	public Cadd(int x, int y)
	{
		System.out.println(x+y);
	}
	
	public Cadd(int x, int y, int z)
	{
		System.out.println(x+y+z);
		
	}

	public Cadd(double x, double y, double z)
	{
		System.out.println(x+y+z);
	}
	
	public Cadd(String x, String y)
	{
		System.out.println(x+y);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cadd p=new Cadd();
		Cadd q=new Cadd(2,3);
		Cadd r=new Cadd(2.4,3.3,4.5);
		Cadd s=new Cadd("Hello"," World");
		
	}

}
