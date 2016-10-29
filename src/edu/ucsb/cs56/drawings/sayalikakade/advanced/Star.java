package edu.ucsb.cs56.drawings.sayalikakade.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a star that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc. The star is created with five points 
   that are equidistant to each other and equidistance from
   the center by drawing the five outside points and five 
   inside points on a circle. 
      
   @author Sayali Kakade
   @version for CS56, F16, UCSB
   
*/
public class Star extends GeneralPathWrapper implements Shape
{

    /**
       Constructor
       
       @param x x coord of upper left corner of rectangle that encloses star
       @param y y coord of upper left corner of rectangle that encloses star
       @param outerRadius radius of outer circle used to plot five outer prongs of star
       @param innerRadius radius of inner circle used to plot five inner prongs of star
    */
    public Star(double x, double y, double outerRadius, double innerRadius)
    {

    ArrayList<Point2D.Double> outerPoints = new ArrayList<Point2D.Double>(); 
    ArrayList<Point2D.Double> innerPoints = new ArrayList<Point2D.Double>(); 

    double xCenter = (x + outerRadius);
    double yCenter = (y + outerRadius); 
    
    outerPoints.add(new Point2D.Double(xCenter, y));
    outerPoints.add(new Point2D.Double(xCenter + outerRadius*Math.cos(0.1 * Math.PI), yCenter - outerRadius*Math.sin(0.1 * Math.PI)));
    outerPoints.add(new Point2D.Double(xCenter + outerRadius*Math.sin(0.2 * Math.PI), yCenter + outerRadius*Math.cos(0.2 * Math.PI))); 
    outerPoints.add(new Point2D.Double(xCenter - outerRadius*Math.sin(0.2 * Math.PI), yCenter + outerRadius*Math.cos(0.2 * Math.PI))); 
    outerPoints.add(new Point2D.Double(xCenter - outerRadius*Math.cos(0.1 * Math.PI), yCenter - outerRadius*Math.sin(0.1 * Math.PI))); 

    innerPoints.add(new Point2D.Double(xCenter + innerRadius*Math.sin(0.2 * Math.PI), yCenter - innerRadius * Math.cos(0.2 * Math.PI))); 
    innerPoints.add(new Point2D.Double(xCenter + innerRadius*Math.sin(0.4 * Math.PI), yCenter + innerRadius*Math.cos(0.4 * Math.PI))); 
    innerPoints.add(new Point2D.Double(xCenter, yCenter + innerRadius)); 
    innerPoints.add(new Point2D.Double(xCenter - innerRadius*Math.sin(0.4 * Math.PI), yCenter + innerRadius*Math.cos(0.4 * Math.PI))); 
    innerPoints.add(new Point2D.Double(xCenter - innerRadius*Math.sin(0.2 * Math.PI), yCenter - innerRadius*Math.cos(0.2 * Math.PI))); 

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
