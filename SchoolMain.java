import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.program.ConsoleProgram;

public class SchoolMain extends ConsoleProgram {

	private JTextField teach;
	private JTextField subj;
	private JTextField pupil;
	private JButton addTeach;
	private JButton addSubj;
	private JButton addPupil;
	private JButton displayPupils;
	private JButton displayTeachers;
	
	public void init() {
		teach = new JTextField(10);
		add(new JLabel("Teach:"), SOUTH);
		add(teach, SOUTH);
		teach.addActionListener(this);
		
		subj = new JTextField(10);
		add(new JLabel("Subj:"), SOUTH);
		add(subj, SOUTH);
		subj.addActionListener(this);
		
		pupil = new JTextField(10);
		add(new JLabel("Pupil:"), SOUTH);
		add(pupil, SOUTH);
		pupil.addActionListener(this);
	}
}
