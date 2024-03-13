
public class RecursionExample {
	void fun1(int n) {
		if(n>0) {
			System.out.print(n+",");
			fun1(n-1);
		}		
	}
	
	void fun2(int n) {
		if(n>0) {
			fun2(n-1);
			System.out.print(n+",");
		}
	}

	public static void main(String[] args) {
		RecursionExample o1=new RecursionExample();
		
		System.out.printf("Calling Function 1:\n");
		o1.fun1(10);
		System.out.printf("\n\nCalling Function 2:\n");
		o1.fun2(10);

	}

}
