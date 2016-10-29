package edu.ucsb.cs56.drawings.jkompella.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a house that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Joseph Kompella
   @version for CS56, F16, UCSB
   
*/
public class Person extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of person
       @param y y coord of lower left corner of person
       @param height of person
    */
    public Person(double x, double y, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double torso = height/3;
        double headRadius = height/9;
	double legLength = height/3;
        
        double headX = x + legLength/2;
	double headY = y - (0.77)*height;

        Line2D.Double leftLeg = new Line2D.Double(x, y, x + legLength/2, y - legLength);
	Line2D.Double rightLeg = new Line2D.Double(x + legLength, y, x + legLength/2, y - legLength);
        Line2D.Double torsoLine = new Line2D.Double(x + legLength/2, y - legLength, x+legLength/2, y - legLength - torso);
	Line2D.Double arms = new Line2D.Double(x, y-legLength-torso/2, x + legLength, y-legLength-torso/2);
	
	Circle head = new Circle(headX, headY, headRadius);
		
        GeneralPath person = this.get();
        person.append(leftLeg, false);
	person.append(rightLeg, false);
        person.append(torsoLine, false);
        person.append(head, false);
	person.append(arms, false);    
    }
}
