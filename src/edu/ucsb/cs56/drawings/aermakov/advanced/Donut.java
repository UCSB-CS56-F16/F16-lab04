package edu.ucsb.cs56.drawings.aermakov.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;


public class Donut extends GeneralPathWrapper implements Shape
{   
    public Donut(double x, double y, double radius)
    {
        Ellipse2D.Double innercircle = new Ellipse2D.Double(x+.3*radius, y+.3*radius, radius*.4, radius*.4);
	    Ellipse2D.Double outercircle = new Ellipse2D.Double(x, y, radius, radius);
        GeneralPath wholeDonut = this.get();
        wholeDonut.append(innercircle, false);
        wholeDonut.append(outercircle, false);   
    }

}
