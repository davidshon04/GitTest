import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

//68. თქვენი ამოცანაა გრაფიკული პროგრამის საშუალებით გააკეთოთ ჩატი. ფანჯარაზე, SOUTH 
//რეგიონზე უნდა გქონდეთ ერთი ტექსტფილდი და ერთი ღილაკი ტექტით Enter. 
//ტექსტფილდში ტექსტის შეყვანის მერე Enter ჭილაკზე დაჭერით ტექსტი უნდა
//იწერებოდეს(იხატებოდეს) კანვასზე ხოლო ტექსტფილდში კი ტექსტი იშლებოდეს. ხელახლა
//ტექსტის შეყვანისას ახალი ტექსტი წინა ტექსტის ქვემოთ უნდა გამოცნდეს(როგორც ჩატში
//ხდება ხოლმე. თუკი ტექსტი ჩაცდება ეკრანს არაუშავს

public class Problem68 extends GraphicsProgram {

	private JTextField tf;
	private JButton but;
	private static final String BUT_COMMAND = "Enter";
	private static final int DIFF = 30;
	private int currY = 15;
	private static final int X = 15;
	
	public void init() {
		tf = new JTextField(20);
		add(tf, SOUTH);
		tf.addActionListener(this);
		
		but = new JButton(BUT_COMMAND);
		add(but, SOUTH);
		
		addActionListeners();
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals(BUT_COMMAND) && !tf.getText().equals("")) {
			displayOnCanvas(tf.getText(), currY);
			currY += DIFF;
			tf.setText("");
		}
	}

	private void displayOnCanvas(String text, int currY2) {
		GLabel label = new GLabel("- " + text);
		add(label, X, currY2);
	}
}
