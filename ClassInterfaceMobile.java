class Phone{
	void call(int n) {
		System.out.println("Calling to No: "+n);
	}
	
	void sms() {
	System.out.println("Sending Message");
	}
	
}


interface Camera{
	void click();
	void record();
}

interface MusicPlayer{
	void play();
	void pause();
	void stop();
}

class SmartPhone extends Phone implements Camera, MusicPlayer{
	
	public void click() {
		System.out.println("Photo Click");
	}
	
	public void record() {
		System.out.println("Recording Video");
	}
	
	public void play() {
		System.out.println("Playing Video");
	}
	
	public void pause() {
		System.out.println("Pause Video");
	}
	public void stop() {
		System.out.println("Stop Video");
	}
}


public class ClassInterfaceMobile {

	public static void main(String[] args) {
		Phone FP=new SmartPhone();
		FP.call(999999999);
		FP.sms();
		
		//FP.click //Cannot call Subclass methods because FP is Reference of Phone class
    //This is Example of Runtime Polymorphisim (i.e, Dynamic Method Dispatch)
	

	}

}
