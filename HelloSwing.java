import javax.swing.*;
import java.awt.event.*;

public class HelloSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Click the button!");
        JButton button = new JButton("Say Hello");

        // Event handling using anonymous inner class (No lambda)
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hello, World!");
            }
        });

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}
