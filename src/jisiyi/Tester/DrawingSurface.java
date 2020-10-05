package jisiyi.Tester;

import jisiyi.Shapes.Rectangle;
import jisiyi.Shapes.Circle;

import processing.core.PApplet;


public class DrawingSurface extends PApplet {

	private Rectangle rect;
	Rectangle rectC = new Rectangle(100, -100, 20, -300);
	Rectangle rectB = new Rectangle(0, 80, 400, 160);
	Rectangle rectA = new Rectangle();
	Circle circ = new Circle(100, 100, 100);
	public DrawingSurface() {
		
		rect = new Rectangle(10,10,10,10);
	}
	
	// The statements in the setup() function 
	// execute once when the program begins
	public void setup() {

	}
	
	// The statements in draw() are executed until the 
	// program is stopped. Each statement is executed in 
	// sequence and after the last line is read, the first 
	// line is executed again.
	public void draw() { 
		background(255);   // Clear the screen with a white background
		rect.draw(this);
		rectA.draw(this);
		rectB.draw(this);
		rectC.draw(this);
		circ.draw(this);
//		boolean testIsInside = circ.isPointInside(mouseX, mouseY);
//		fill(0);
//		text(Boolean.toString(testIsInside), 10, 10);
	}
}
	












