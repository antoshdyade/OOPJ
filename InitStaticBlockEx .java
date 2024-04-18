package amd;

class A{
	public A() {
		System.out.println("This is Class A Default Constructor");
	}
	{
		System.out.println("This is Class A Init Block1");
	}
	static {
		System.out.println("This is Class A static Block");
	}
	{
		System.out.println("This is Class A Init Block2");
	}
}

public class InitStaticBlockEx extends A {
	{
		System.out.println("Hi This is from Child Init Block1");
	}
public InitStaticBlockEx(){
	System.out.println("Default Constructor of Child Class");
}
{
	System.out.println("Hi This is from Child Init Block2");
}
static {
	System.out.println("This is from Child Static Block");
}

	public static void main(String[] args) {
       InitStaticBlockEx o1=new InitStaticBlockEx();

	}

}
