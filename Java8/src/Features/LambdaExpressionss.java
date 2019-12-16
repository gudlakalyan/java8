package Features;

import java.awt.Button;
import java.awt.Frame;

public class LambdaExpressionss {
	// lambda is an anonymus function which doesnot have name and does not belong to
	// any class.
	public static void main(String[] args) {
		System.out.println("SOP in main");
		Frame frame = new Frame("Action listner");
		Button b = new Button("Click Here");
		b.setBounds(200, 140, 200, 140);
		b.addActionListener(e -> System.out.println("helloooo laute"));
		frame.add(b);
		frame.setSize(200, 200);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
