public class PassValue {
	
	static void change(int A[],int index,int value)
	{
		A[index]=value;
	}
	
	static void change2(int x, int value)
	{
		x=value;
	}
	
	public static void main(String[] args) {
		
	int A[]= {1,2,3,4,5};
	int x=10;
	
	
	change(A,0,500);
	System.out.println("The A array after calling change method: ");
	for(int a:A)
	System.out.println(a);
	
	
	change2(x,20);
	System.out.println("The x Value after Calling change2 method: "+ x);

	}

}

/* The Output is 
The A array after calling change method: 
500
2
3
4
5
The x Value after Calling change2 method: 10
*/
