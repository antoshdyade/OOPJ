package MyPkg;

class MyTask implements Runnable{
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

public class ThreadExRunnable {

	public static void main(String[] args) {
		MyTask t1=new MyTask("A");
		MyTask t2=new MyTask("B");
		MyTask t3=new MyTask("C");
		
		Thread t11=new Thread(t1);
		Thread t22=new Thread(t2);
		Thread t33=new Thread(t3);
		
		
		t11.start();
		t22.start();
		t33.start();
		

	}

}
