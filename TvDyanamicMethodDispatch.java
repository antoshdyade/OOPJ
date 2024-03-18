class TV {
    void display() {
        System.out.println("Regular TV display");
    }

    void switchOn() {
        System.out.println("TV is switched on");
    }

    void switchOff() {
        System.out.println("TV is switched off");
    }
}

class SmartTV extends TV {
    @Override
    void display() {
        System.out.println("Smart TV display");
    }

    void connectToInternet() {
        System.out.println("Smart TV connected to the internet");
    }

    void streamVideo() {
        System.out.println("Smart TV streaming video");
    }
}

public class TvDyanamicMethodDispatch {
    public static void main(String[] args) {
        TV tv1 = new TV();
        TV tv2 = new SmartTV();

        tv1.display(); // Output: Regular TV display
        tv1.switchOn(); // Output: TV is switched on
        tv2.display(); // Output: Smart TV display
        tv2.switchOn(); // Output: TV is switched on

        // Uncomment the lines below to access methods specific to SmartTV
        // ((SmartTV) tv2).connectToInternet(); // Output: Smart TV connected to the internet
        // ((SmartTV) tv2).streamVideo(); // Output: Smart TV streaming video
    }
}
