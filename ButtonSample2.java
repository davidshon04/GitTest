import java.awt.event.ActionEvent;

import javax.swing.JButton;

import acm.program.ConsoleProgram;

public class ButtonSample2 extends ConsoleProgram {
	private String str1 = "Hello";
	private String str2 = "David";
	private String str3 = "Midterms";

	public void init() {
		setFont("Courier-24");
		
		add(new JButton(str1), NORTH);
		add(new JButton(str2), SOUTH);
		add(new JButton(str3), SOUTH);
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals(str1)) {
			println("Hello World");
		} else if (cmd.equals(str2)) {
			println("David Shonia");
		} else if (cmd.equals(str3)) {
			println("Midterms VS Finals");
		}
	}
}
