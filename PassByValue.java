
public class PassByValue {
	static void update(int A[], int index, int value) {
		A[index]=value;
	}
	
	static void change(int x, int value) {
		x=value;
	}

	public static void main(String[] args) {
		int A[]= {1,2,3,4,5};
		update(A,1,33);
		
		for(int i=0;i<A.length;i++)
		System.out.print(A[i]+",");
		
		System.out.println();
		
		int x=100;
		change(x,25);
		System.out.println("After Calling Change method x value is: "+x);
				
	}

}
