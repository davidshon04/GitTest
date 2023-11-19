
/*
 * File: Breakout.java
 * -------------------
 * Name:
 * Section Leader:
 * 
 * This file will eventually implement the game of Breakout.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class brpr extends GraphicsProgram {

	/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;

	/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;

	/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;

	/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;

	/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

	/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

	/** Separation between bricks */
	private static final int BRICK_SEP = 4;

	/** Width of a brick */
	private static final int BRICK_WIDTH = (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

	/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

	/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

	/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

	/** Number of turns */
	private static final int NTURNS = 3;

	private RandomGenerator rgen = RandomGenerator.getInstance();

	GRect brick;
	private GRect paddle;
	private GOval ball;
	private double vx;
	private double vy;
	private int numCrushes = 0;

	/* Method: run() */
	/** Runs the Breakout program. */
	public void run() {
		brick = createBricks();
		addPaddle();
		addMouseListeners();
		addBall();
		moveBall();
	}

	public void mouseMoved(MouseEvent e) {
		double vxPaddle = e.getX() - (paddle.getX() + PADDLE_WIDTH / 2);
		double vyPaddle = 0;
		if (paddle.getX() > 0 || paddle.getX() + PADDLE_WIDTH < getWidth()) {
			paddle.move(vxPaddle, vyPaddle);
		}
	}

	private void moveBall() {
		vx = rgen.nextDouble(1.0 / 3, 1.0);
		if (rgen.nextBoolean(0.5))
			vx = -vx;
		vy = 1.0;
		while (true) {
			if (ball.getX() < 0 || ball.getX() + 2 * BALL_RADIUS > getWidth()) {
				vx = -vx;
			}
			if (ball.getY() < 0 || ball.getY() + 2 * BALL_RADIUS > getHeight()) {
				vy = -vy;
			}
			ball.move(vx, vy);
			pause(1);
			GObject collider = getCollidingObject();
			if(collider != paddle) {
				remove(collider);
				vx = -vx;
				vy = -vy;
			} else {
			//	numCrushes++;
				vx = -vx;
				vy = -vy;
				
			}
		}
	}

		

	private GObject getCollidingObject() {
		GObject obj1 = getElementAt(ball.getX(), ball.getY());
		GObject obj2 = getElementAt(ball.getX() + 2 * BALL_RADIUS, ball.getY());
		GObject obj3 = getElementAt(ball.getX(), ball.getY() + 2 * BALL_RADIUS);
		GObject obj4 = getElementAt(ball.getX() + 2 * BALL_RADIUS, ball.getY() + 2 * BALL_RADIUS);
		if (obj1 != null) {
			return obj1;
		} else if (obj2 != null) {
			return obj2;
		} else if (obj3 != null) {
			return obj3;
		} else if (obj4 != null) {
			return obj4;
		} else {
			return null;
		}
	}

	private void addBall() {
		ball = new GOval(2 * BALL_RADIUS, 2 * BALL_RADIUS);
		ball.setFilled(true);
		double ballX = getWidth() / 2 - BALL_RADIUS;
		double ballY = getHeight() / 2 - BALL_RADIUS;
		add(ball, ballX, ballY);
	}

	private GRect addPaddle() {
		paddle = new GRect(PADDLE_WIDTH, PADDLE_HEIGHT);
		int x = (getWidth() - PADDLE_WIDTH) / 2;
		int y = getHeight() - PADDLE_Y_OFFSET;
		paddle.setFilled(true);
		add(paddle, x, y);
		return paddle;
	}

	private GRect createBricks() {
		for (int i = 0; i < NBRICK_ROWS; i++) {
			for (int j = 0; j < NBRICKS_PER_ROW; j++) {
				brick = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
				int x = (getWidth() - (BRICK_WIDTH + (NBRICK_ROWS - 1) * (BRICK_WIDTH + BRICK_SEP))) / 2;
				int y = BRICK_Y_OFFSET;
				brick.setFilled(true);
				brickColor(i);
				add(brick, x + j * (BRICK_WIDTH + BRICK_SEP), y + i * (BRICK_HEIGHT + BRICK_SEP));
			}
		}
		return brick;
	}

	private GRect brickColor(int i) {
		brick.setColor(Color.BLACK);
		if (i < NBRICK_ROWS - 8) {
			brick.setColor(Color.RED);
		} else if (i < NBRICK_ROWS - 6) {
			brick.setColor(Color.ORANGE);
		} else if (i < NBRICK_ROWS - 4) {
			brick.setColor(Color.YELLOW);
		} else if (i < NBRICK_ROWS - 2) {
			brick.setColor(Color.GREEN);
		} else if (i < NBRICK_ROWS) {
			brick.setColor(Color.CYAN);
		}
		return brick;
	}

}


