package princemishra;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterGUI {
	 private static int counter = 0;

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Counter Display");
	        JLabel label = new JLabel("Counter: 0", SwingConstants.CENTER);
	        label.setFont(new Font("Arial", Font.BOLD, 30));

	        frame.add(label);
	        frame.setSize(300, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);

	        Timer timer = new Timer(1000, new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                counter++;
	                label.setText("Counter: " + counter);
	            }
	        });
	        timer.start();
	    }

}
