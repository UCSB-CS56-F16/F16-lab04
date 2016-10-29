package edu.ucsb.cs56.drawings.sayalikakade.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
/**
   An extension of the Star class that 
   adds vector lines to create a shooting star
      
   @author Sayali Kakade
   @version for CS56, F16, UCSB
   
*/
public class ShootingStar extends Star implements Shape
{
	/**
     Constructor

       @param x x coord of upper left corner of rectangle that encloses star
       @param y y coord of upper left corner of rectangle that encloses star
       @param outerRadius radius of outer circle used to plot five outer prongs of star
       @param innerRadius radius of inner circle used to plot five inner prongs of star
     */
    public ShootingStar(double x, double y, double outerRadius, double innerRadius)
    {

	super(x,y,outerRadius,innerRadius);

	GeneralPath gp = this.get();

	double xCenter = x + outerRadius;
	double yCenter = y + outerRadius;
	
	Line2D.Double lineOne = new Line2D.Double(xCenter, y, xCenter + 3 * outerRadius, y); 
	Line2D.Double lineTwo = new Line2D.Double(xCenter + outerRadius*Math.cos(0.1 * Math.PI), yCenter - outerRadius*Math.sin(0.1 * Math.PI), xCenter + 3 *outerRadius, y); 
	Line2D.Double lineThree = new Line2D.Double(xCenter + outerRadius*Math.sin(0.2 * Math.PI), yCenter + outerRadius*Math.cos(0.2 * Math.PI), xCenter + 3 * outerRadius, y);
	Line2D.Double lineFour = new Line2D.Double(xCenter - outerRadius*Math.sin(0.2 * Math.PI), yCenter + outerRadius*Math.cos(0.2 * Math.PI), xCenter + 3 *outerRadius, y);
	Line2D.Double lineFive = new Line2D.Double(xCenter - outerRadius*Math.cos(0.1 * Math.PI), yCenter - outerRadius*Math.sin(0.1 * Math.PI), xCenter + 3 * outerRadius, y); 
	


	GeneralPath wholeStar = this.get();
	wholeStar.append(lineOne, false);
	wholeStar.append(lineTwo, false);
	wholeStar.append(lineThree, false);
	wholeStar.append(lineFour, false); 
	wholeStar.append(lineFive, false); 
    }
}
