package jisiyi.Shapes;
import processing.core.PApplet;
import java.lang.Math;
public class Circle {
	public double x,y,diameter;
	/**
	 * draws the circle from the center and takes the diameter instead of the radius.
	 * @precondition error might occur if trying to pass negative values to the diameter 
	 * @param x is the X coordinate of the origin of the circle.
	 * @param y is the Y coordinate of the origin of the circle.
	 * @param diameter is the diameter of the circle (not the raidus)
	 * 
	 */
	public Circle(double x, double y, double diameter)
	{
		this.x = x;
		this.y = y;
		this.diameter = diameter;
	}
	/**
	 * sets the fields of the methods to defult 0
	 * all the pre and post conditions apply to this constructor
	 */
	public  Circle()
	{
		x = 0;
		y = 0;
		diameter = 0;
	}
	/**
	 * returns Perimeter
	 * @return Returns the Perimeter of the circle using the equation pi*d
	 */
	public double getPerimeter()
	{
		return Math.PI*diameter;
	}
	/**
	 * returns the area of the circle.
	 * @return using the forumala r squared*pi to calculate and return the area
	 */
	public double getArea()
	{
		return (diameter/2)*(diameter/2)*Math.PI;
		
	}
	/**
	 * checks if the point is inside
	 * @param px is the x cordinate of the point user want to check
	 * @param py is the y cordinate of the point user want to check
	 * @return returns a boolean by checking if the distance of the point to the circle is smaller than the radius of the circle
	 */
	public boolean isPointInside(double px, double py)
	{
		double distance = Math.sqrt(Math.pow(x-px, 2) + Math.pow(y-py, 2));
		return distance <= diameter/2;
	}
	/**
	 * 
	 * @param circle compares if a circle is bigger than the circle of this object. 
	 * @return a boolean that shows if this circle is bigger than the other.
	 */
	public boolean isCircleBigger(Circle circle)
	{
		return diameter>circle.diameter;
	}
	/**
	 * converts the x cordinate to the top left instead of origin
	 * @return returns the top left x cordinate
	 */
	public double topPointCircleX() //finds the top left point of the circle,  where the x,y are supposted to be if it were any other shape
	{
		return x-diameter/2; 
	}
	/**
	 * same us topPointCircleX but return the y cordinate.
	 * @return returns y top left point. 
	 */
	public double topPointCircleY() //finds the top left point of the circle,  where the x,y are supposted to be if it were any other shape
	{
		return y-diameter/2; 
	}
	/**
	 * draws the circle
	 * @precondition must be a PApplet when calling this method
	 * @param marker is the pApplet that you need to path in order for the method to work
	 */
	public void draw(PApplet marker)
	{
		marker.circle((float)x,(float)y,(float)diameter);
	}
}
