import java.awt.event.ActionEvent;

import javax.swing.JButton;

import acm.program.ConsoleProgram;

public class ButtonSample extends ConsoleProgram {
	
	public void init() {
		setFont("London");
		
		JButton but = new JButton("Hi");
		add(but, SOUTH);
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("Hi")) {
			println("Hello there");
		}
	}
}
