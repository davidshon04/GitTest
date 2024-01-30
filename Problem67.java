import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

//67. გააკეთეთ ფოტოების აპლიკაცია. აპლიკაციას უნდა ჰქონდეს ტექსფილდი სადაც შეიძლება
//ფოტოს(ფაილის) მისამართის ჩაწერა. ენტერზე დაჭერის შემდეგ ეს ფოტო უნდა გამოჩნდეს
//ფანჯრის ცენტრში.

public class Problem67 extends GraphicsProgram {
	
	private static final double IMAGE_WIDTH = 100.0;
	private static final double IMAGE_HEIGHT = 80.0;
	private JTextField tf;
	
	public void init() {
		tf = new JTextField(20);
		add(tf, SOUTH);
		tf.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tf) {
			try {
				GImage image = new GImage(tf.getText());
				image.setSize(IMAGE_WIDTH, IMAGE_HEIGHT);
				add(image, (getWidth() - IMAGE_WIDTH) / 2, (getHeight() - IMAGE_HEIGHT) / 2);
			} catch (Exception ex) {
				removeAll();
				add(new GLabel("Error occured"), 20, 20);
			}
		}
	}
}
