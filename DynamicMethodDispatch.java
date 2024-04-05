package amd;

//Interface for Music
interface Music {
 void play();
 void pause();
 void stop();
}

//Interface for Camera
interface Camera {
 void clickPhoto();
 void recordVideo();
}

//FeaturePhone class extending Phone
class FeaturePhone extends Phone {
 public void sendSMS() {
     System.out.println("Feature Phone sends SMS");
 }
}

//SmartPhone class implementing Camera interface
class SmartPhone extends FeaturePhone implements Camera, Music {
 @Override
 public void clickPhoto() {
     System.out.println("Smartphone clicks a photo");
 }

 @Override
 public void recordVideo() {
     System.out.println("Smartphone records a video");
 }
 
 @Override
 public void play() {
     System.out.println("Smartphone Play video/music");
 }
 
 @Override
 public void pause() {
     System.out.println("Smartphone Pause video/music");
 }
 @Override
 public void stop() {
     System.out.println("Smartphone Stop video/music");
 }
}

//Phone class with call method
class Phone {
 public void call() {
     System.out.println("Phone makes a call");
 }
}

public class DynamicMethodDispatch {
 public static void main(String[] args) {
     // Create a object
     SmartPhone smartPhone = new SmartPhone();
     Phone landPhone=new SmartPhone();
     FeaturePhone featurePhone=new SmartPhone();
     
     Music musicOnly=new SmartPhone();
     Camera cameraOnly=new SmartPhone();
          

     // Explore available methods in each object
     System.out.println("Methods available in Phone object with reference to SmartPhone:");
     landPhone.call();

     System.out.println("\nMethods available in FeaturePhone object with reference to SmartPhone:");
     featurePhone.call();
     featurePhone.sendSMS();

     System.out.println("\nMethods available in SmartPhone object with reference to SmartPhone:");
     smartPhone.call();
     smartPhone.sendSMS();
     smartPhone.clickPhoto();
     smartPhone.recordVideo();
     smartPhone.play();
     smartPhone.pause();
     smartPhone.stop();
     
     
     System.out.println("\nMethods available in SmartPhone object with reference to Music:");
     musicOnly.play();
     musicOnly.pause();
     musicOnly.stop();
     
     
     System.out.println("\nMethods available in SmartPhone object with reference to Cmera:");
     cameraOnly.clickPhoto();
     cameraOnly.recordVideo();
 }
 }

