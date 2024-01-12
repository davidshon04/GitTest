import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import acm.program.ConsoleProgram;

public class TextFieldSample extends ConsoleProgram {

	private JTextField tf;
	
	public void init() {
		tf = new JTextField(15);
		tf.addActionListener(this);
		add(tf, SOUTH);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tf) {
			println("Hello" + tf.getText());
		}
	}
}
