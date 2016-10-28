package edu.ucsb.cs56.drawings.sayalikakade.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;


public class Star extends GeneralPathWrapper implements Shape
{

    public Star(double x, double y, double outerRadius, double innerRadius)
    {

    ArrayList<Point2D.Double> outerPoints = new ArrayList<Point2D.Double>(); 
    ArrayList<Point2D.Double> innerPoints = new ArrayList<Point2D.Double>(); 

    double xCenter = (x + outerRadius);
    double yCenter = (y + outerRadius); 
    
    outerPoints.add(new Point2D.Double(xCenter, y));
    outerPoints.add(new Point2D.Double(xCenter + outerRadius*Math.cos(18.0 * Math.PI / 180), yCenter - outerRadius*Math.sin(18.0 * Math.PI /180)));
    outerPoints.add(new Point2D.Double(xCenter + outerRadius*Math.sin(36.0 * Math.PI / 180), yCenter + outerRadius*Math.cos(36.0* Math.PI / 180))); 
    outerPoints.add(new Point2D.Double(xCenter - outerRadius*Math.sin(36.0* Math.PI / 180), yCenter + outerRadius*Math.cos(36.0* Math.PI / 180))); 
    outerPoints.add(new Point2D.Double(xCenter - outerRadius*Math.cos(18.0* Math.PI / 180), yCenter - outerRadius*Math.sin(18.0* Math.PI / 180))); 

    innerPoints.add(new Point2D.Double(xCenter + innerRadius*Math.sin(36 * Math.PI / 180), yCenter - innerRadius * Math.cos(36 * Math.PI /180))); 
    innerPoints.add(new Point2D.Double(xCenter + innerRadius*Math.sin(72.0* Math.PI / 180), yCenter + innerRadius*Math.cos(72.0* Math.PI / 180))); 
    innerPoints.add(new Point2D.Double(xCenter, yCenter + innerRadius)); 
    innerPoints.add(new Point2D.Double(xCenter - innerRadius*Math.sin(72.0* Math.PI / 180), yCenter + innerRadius*Math.cos(72.0* Math.PI / 180))); 
    innerPoints.add(new Point2D.Double(xCenter - innerRadius*Math.sin(36.0* Math.PI / 180), yCenter - innerRadius*Math.cos(36.0* Math.PI / 180))); 

    GeneralPath wholeStar = this.get(); 
    for (int i = 0; i < 5; i++){
	wholeStar.append(new Line2D.Double(outerPoints.get(i), innerPoints.get(i)), false); 
	if (i < 4)
	    wholeStar.append(new Line2D.Double(innerPoints.get(i), outerPoints.get(i+1)), false); 
	else if (i == 4)
	    wholeStar.append(new Line2D.Double(innerPoints.get(i), outerPoints.get(0)), false); 
    }
   
    }
}
