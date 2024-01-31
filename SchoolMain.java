import java.awt.event.ActionEvent;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.program.Program;

public class SchoolMain extends Program {

	private JTextField teach;
	private JTextField subj;
	private JTextField pupil;
	private JButton addTeach;
	private JButton addSubj;
	private JButton addPupil;
	private JButton displayPupils;
	private JButton displayTeachers;
	School school = new School();
	
	private SchoolGraphics canvas;
	
	public void init() {
		canvas = new SchoolGraphics();
		add(canvas);
		
		teach = new JTextField(6);
		add(new JLabel("Teach:"), SOUTH);
		add(teach, SOUTH);
		
		subj = new JTextField(6);
		add(new JLabel("Subj:"), SOUTH);
		add(subj, SOUTH);
		
		pupil = new JTextField(6);
		add(new JLabel("Pupil:"), SOUTH);
		add(pupil, SOUTH);
		
		addTeach = new JButton("Add Teach");
		add(addTeach, SOUTH);
		
		addSubj = new JButton("Add Subj");
		add(addSubj, SOUTH);
		
		addPupil = new JButton("Add Pupil");
		add(addPupil, SOUTH);
		
		displayPupils = new JButton("Display Pupils");
		add(displayPupils, SOUTH);
		
		displayTeachers = new JButton("Display Teachers");
		add(displayTeachers, SOUTH);
		
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addTeach && !teach.getText().equals("")) {
			school.addTeacher(teach.getText());
			teach.setText("");
		} else if (e.getSource() == addSubj && !teach.getText().equals("") && !subj.getText().equals("")) {
			school.addSubject(teach.getText(), subj.getText());
			teach.setText("");
			subj.setText("");
		} else if (e.getSource() == addPupil && !pupil.getText().equals("") && !subj.getText().equals("")) {
			school.addPupil(pupil.getText(), subj.getText());
			pupil.setText("");
			subj.setText("");
		} else if (e.getSource() == displayPupils && !teach.getText().equals("")) {
			canvas.displayOnCanvas(school.getPupils(teach.getText()));
			teach.setText("");
		} else if (e.getSource() == displayTeachers && !pupil.getText().equals("")) {
			canvas.displayOnCanvas(school.getTeachers(pupil.getText()));
			pupil.setText("");
		}
	}
	
//	private String toString(Iterator<String> teachers) {
//		String res = "[ ";
//		if (teachers == null) {
//			return null;
//		}
//		while (teachers.hasNext()) {
//			String str = teachers.next();
//			res += str;
//			res += " ";	
//		}
//		res += "]";
//		return res;
//	}
}
