public class FinalizeMethodEx {
	protected void finalize() {
		System.out.println("Finalizing the Class Object");
		//Perform Cleanup Operations Such Closing DB/Files etc.
	}

	public static void main(String[] args) {
		//Create an Object 
		FinalizeMethodEx o1=new FinalizeMethodEx();
		
		//Assign Object to null to make it eligible for garbage collection 
		o1=null;
		
		//Requesting garbage collection explicitly
		System.gc();
		

	}

}
