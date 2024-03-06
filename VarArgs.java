public class VarArgs {
	
	static void display(String ...S)
	{
		for(int i=0;i<S.length;i++)
			System.out.println(S[i]);
	}

	public static void main(String ...args) {
			
		display("Antosh","Krishna","Mahadev","Maheshwari");
		
		for(int j=0;j<args.length;j++)
		System.out.println(args[j]);

	}

}
