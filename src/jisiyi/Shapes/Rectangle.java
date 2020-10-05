package jisiyi.Shapes;
import processing.core.PApplet;
public class Rectangle {
	private double  x, y, width, height;
	
	/**
	 * sets the width and height cordinates of rectangle to defualt 0
	 * 
	 */
	public Rectangle() 
	{
		x = 0;
		y = 0;
		width = 0;
		height = 0;
	}
	/**
	 * sets specific values to the rectangle object
	 * @param x is the x cordinate of the top left point of the rectangle
	 * @param y is the y cordinate of the top left point of the rectangle
	 * @param width is the length in the x direction of the rectangle
	 * @param height is the length in the y direction of the rectangle
	 * @precondition do not pass in negative values to the width and height.
	 */
	public Rectangle(double x, double y, double width, double height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	/**
	 * returns the perimeter of the rectangle
	 * @return returns the perimeter using the formula (width+height) * 2
	 */
	public double getPerimeter()
	{
		return (width+height)*2;
	}
	
	/**
	 * returns the area of the circle
	 * @return returns the area using the width*height fomula
	 */
	public double getArea()
	{
		return width*height;
	}
	/**
	 * checks if a point is inside a rectangle
	 * @param x is the x cordinate of the point the user wants to check
	 * @param y is the y cordinate of the point the user wants to check
	 * @return a boolean checking if the x and y value is in between the rectangle boundaries
	 */
	public boolean isPointInside(double x, double y)
	{
		boolean condition1 = false;
		boolean condition2 = false;
		if (this.x+width>=x && this.x <= x)
		{
			condition1 = true;
		}
		if (this.y+height >= y && this.y <= y)
		{
			condition2 = true;
		}
		if (condition1 & condition2)
		{
			return true;
		} else {
			return false;
		}
	}
	/**
	 * checks if this rectangle is a square
	 * @return a boolean if the width and height of the rectangle is the same
	 */
	public boolean checkSquare()
	{
		if (width == height)
		{
			return true;
		} else {
			return false;
		}
	}
	/**
	 * determines where the center point of a rectangle is
	 * @return a x value of the center point by halfing the width
	 */
	public double centerX()
	{
		return width/2+x;
	}
	/**
	 * determines where the center point of a rectangle is
	 * @return a y cordinate of the center point by halfing the height
	 */
	public double centerY()
	{
		return height/2+y;
	}
	/**
	 * draws the rectangle
	 * @param marker a PApplet
	 * @precondition the class user is calling it from must be a PApplet 
	 */
	public void draw(PApplet marker)
	{
		marker.rect((float)x,(float)y,(float)width,(float)height);
	}



}
