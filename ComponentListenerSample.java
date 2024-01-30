import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class ComponentListenerSample extends GraphicsProgram implements ComponentListener {

	private GOval oval;

	public void init() {
		oval = new GOval(getWidth() / 2, getHeight() / 2);
		add(oval, getWidth() / 4, getHeight() / 4);
		addComponentListener(this);
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void componentResized(ComponentEvent e) {
		removeAll();
		oval = new GOval(getWidth() / 2, getHeight() / 2);
		add(oval, getWidth() / 4, getHeight() / 4);
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub

	}
}
