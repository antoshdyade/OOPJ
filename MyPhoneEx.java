
// Interface for Camera
interface Camera {
    void record();
    void click();
}

// Interface for Music
interface Music {
    void play();
    void pause();
    void stop();
}

// Abstract class Phone with abstract method call
abstract class Phone {
    abstract void call();
}

// FeaturePhone class extending Phone and implementing SMS
class FeaturePhone extends Phone {
    abstract void sms();
}

// Smartphone class extending FeaturePhone and implementing Camera and Music
class Smartphone extends FeaturePhone implements Camera, Music {
    @Override
    void call() {
        System.out.println("Making a call...");
    }

    @Override
    void sms() {
        System.out.println("Sending SMS...");
    }

    @Override
    public void record() {
        System.out.println("Recording video...");
    }

    @Override
    public void click() {
        System.out.println("Taking a photo...");
    }

    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music...");
    }
}

// Main class to test the functionality
public class MyPhoneEx {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();

        smartphone.call();
        smartphone.sms();
        smartphone.record();
        smartphone.click();
        smartphone.play();
        smartphone.pause();
        smartphone.stop();
    }
}