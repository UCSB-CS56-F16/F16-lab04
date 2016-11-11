package edu.ucsb.cs56.drawings.aermakov.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Ellipse2D;

public class DonutWithSprinkles extends Donut implements Shape
{
    public DonutWithSprinkles(double x, double y, double radius)
    {
	super(x,y, radius);
	
	GeneralPath gp = this.get();
	
	Ellipse2D.Double sprinkOne = new Ellipse2D.Double(x+.45*radius, y+.45*radius - .35* radius, 10, 10);
	Ellipse2D.Double sprinkTwo = new Ellipse2D.Double(x+.45*radius- .35* radius, y+.45*radius, 10, 10);
	Ellipse2D.Double sprinkThree = new Ellipse2D.Double(x+.45*radius+ .35* radius, y+.45*radius, 10, 10);
	Ellipse2D.Double sprinkFour = new Ellipse2D.Double(x+.45*radius, y+.45*radius+ .35* radius, 10, 10);
        GeneralPath wholeDonut = this.get();
        wholeDonut.append(sprinkOne, false);
        wholeDonut.append(sprinkTwo, false);
        wholeDonut.append(sprinkThree, false); 
	wholeDonut.append(sprinkFour, false);
    }    
}
