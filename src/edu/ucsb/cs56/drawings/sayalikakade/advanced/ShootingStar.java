package edu.ucsb.cs56.drawings.sayalikakade.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;

public class ShootingStar extends Star implements Shape
{
    public ShootingStar(double x, double y, double outerRadius, double innerRadius)
    {

	super(x,y,outerRadius,innerRadius);

	GeneralPath gp = this.get();

	double xCenter = x + outerRadius;
	double yCenter = y + outerRadius;

	Line2D.Double lineOne = new Line2D.Double(xCenter, y, xCenter + 2 * outerRadius, y);
	Line2D.Double lineTwo = new Line2D.Double(xCenter + outerRadius, yCenter, xCenter + 2* outerRadius, yCenter);
	Line2D.Double lineThree = new Line2D.Double(xCenter, yCenter + outerRadius, xCenter + 2 * outerRadius, yCenter + outerRadius);


	GeneralPath wholeStar = this.get();
	wholeStar.append(lineOne, false);
	wholeStar.append(lineTwo, false);
	wholeStar.append(lineThree, false);
    }
}
