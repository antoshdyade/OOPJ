public class FinalizeEx {

    // This method is called by the garbage collector before the object is garbage collected
    protected void finalize() {
        System.out.println("Finalizing MyClass object");
        // Perform cleanup tasks here
    }

    public static void main(String[] args) {
        // Create an object of MyClass
    	FinalizeEx obj = new FinalizeEx();

        // Assigning obj to null to make it eligible for garbage collection
        obj = null;

        // Requesting garbage collection explicitly
        System.gc();
    }
}
