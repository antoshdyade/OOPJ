package MyPkg;

class MyTask extends Thread{
	String name;
	public MyTask(String name) {
		this.name=name;
	}
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("This is Thread "+name);
		}
	}
	
}

public class ThreadExThread {

	public static void main(String[] args) {
		MyTask t1=new MyTask("A");
		MyTask t2=new MyTask("B");
		MyTask t3=new MyTask("C");
		
				
		
		t1.start();
		t2.start();
		t3.start();
		

	}

}
