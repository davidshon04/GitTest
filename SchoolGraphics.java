import java.util.Iterator;

import acm.graphics.GCanvas;
import acm.graphics.GLabel;

public class SchoolGraphics extends GCanvas {
	
	private static final int RESULT_X = 10;
	private static final int LINE_H = 20;
	
	public SchoolGraphics() {
		
	}
	
	public void displayOnCanvas(Iterator<String> it) {
		removeAll();
		addResult();
		addList(it);
	}

	private void addList(Iterator<String> it) {
		int y = LINE_H * 2;
		while (it.hasNext()) {
			String str = it.next();
			GLabel lab = new GLabel(str);
			add(lab, RESULT_X, y);
			y += LINE_H;
		}
	}

	private void addResult() {
		GLabel res = new GLabel("Result:");
		add(res, RESULT_X, LINE_H);
	}
}
