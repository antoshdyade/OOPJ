// Parent Class: Mobile
class Mobile {
    void upButton() {
        System.out.println("Up Button Pressed");
    }

    void downButton() {
        System.out.println("Down Button Pressed");
    }

    void powerButton() {
        System.out.println("Power Button Pressed");
    }
}

// Call Application: Buttons for Answering, Muting, and Disconnecting Calls
class CallApp extends Mobile {
    @Override
    void upButton() {
        System.out.println("Answering the call...");
    }

    @Override
    void downButton() {
        System.out.println("Muting the call...");
    }

    @Override
    void powerButton() {
        System.out.println("Call disconnected.");
    }
}

// YouTube Application: Buttons for Volume Up, Volume Down, and Screen Blackout
class YouTubeApp extends Mobile {
    @Override
    void upButton() {
        System.out.println("Increasing video volume...");
    }

    @Override
    void downButton() {
        System.out.println("Decreasing video volume...");
    }

    @Override
    void powerButton() {
        System.out.println("Stopping video and turning off screen.");
    }
}

// Main Class to Demonstrate Polymorphism
public class MobileApp {
    public static void main(String[] args) {
        // Scenario 1: Using Call Application
        System.out.println("📞 Incoming Call:");
        Mobile call = new CallApp();
        call.upButton();     // Answering the call...
        call.downButton();   // Muting the call...
        call.powerButton();  // Call disconnected.

        // Scenario 2: Using YouTube Application
        System.out.println("\n🎬 Watching YouTube:");
        Mobile youtube = new YouTubeApp();
        youtube.upButton();     // Increasing video volume...
        youtube.downButton();   // Decreasing video volume...
        youtube.powerButton();  // Stopping video and turning off screen.
    }
}
