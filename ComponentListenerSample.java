import java.awt.Color;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class ComponentListenerSample extends GraphicsProgram implements ComponentListener {

	private GOval oval;

	public void init() {
		oval = addOval();
		addComponentListener(this);
	}

	private GOval addOval() {
		oval = new GOval(getWidth() / 2, getHeight() / 2);
		oval.setFilled(true);
		oval.setColor(Color.ORANGE);
		add(oval, getWidth() / 4, getHeight() / 4);
		return oval;
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
		addOval();
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub

	}
}
