import java.awt.event.ActionEvent;

import javax.swing.JButton;

import acm.program.ConsoleProgram;

public class ButtonSample extends ConsoleProgram {
	
	public void init() {
		add(new JButton("Hi"), SOUTH);
		addActionListeners();
	}
	
	public void ActionePreformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("Hi")) {
			println("Hello there");
		}
	}
}
