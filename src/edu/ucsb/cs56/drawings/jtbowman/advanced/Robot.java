package edu.ucsb.cs56.drawings.jtbowman.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a robot that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author John Bowman 
   @version for CS56, W16, UCSB
   
*/
public class Robot extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of robot
       @param y y coord of lower left corner of robot
       @param width width of the robot
       @param height of robot (including legs, torso, and head)
    */
    public Robot(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double footHeight = 0.1 * height;
        double legHeight = 0.35 * height;
	double legWidth = width * (0.4);
	double torsoHeight = 0.3 * height;
	double headHeight = 0.25 * height;
	double headWidth = width * (0.6);
	double armHeight = torsoHeight * 1.2;
	double armWidth = width * 0.2;
	double eyeDiameter = Math.min(headHeight,headWidth) * (0.5);  
        
        double headUpperLeftY = y;
	double headUpperLeftX = x + width*0.2;
        
        // Make the head
        
        Rectangle2D.Double head = 
            new Rectangle2D.Double(headUpperLeftX, headUpperLeftY ,
				   headWidth, headHeight);

	// Make the eyes

	Ellipse2D.Double leftEye =
	    new Ellipse2D.Double(headUpperLeftX,
				 y + headHeight * 0.2, eyeDiameter,
				 eyeDiameter);

	Ellipse2D.Double rightEye =
	    new Ellipse2D.Double(headUpperLeftX + headWidth*0.5,
				 y + headHeight * 0.2, eyeDiameter,
				 eyeDiameter);
	
        // make the torso.   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen
        
        Rectangle2D.Double torso = 
            new Rectangle2D.Double (x, y + headHeight,
                               width, torsoHeight);

	// make the legs
	
        Rectangle2D.Double leftLeg =
            new Rectangle2D.Double (x, y + headHeight + torsoHeight,
                               legWidth, legHeight);

	Rectangle2D.Double rightLeg =
	    new Rectangle2D.Double(x + legWidth*1.5,
				   y + headHeight + torsoHeight, legWidth,
				   legHeight);

	// make the arms
	Rectangle2D.Double leftArm =
	    new Rectangle2D.Double(x - armWidth, y + headHeight, armWidth,
				   armHeight);

	Rectangle2D.Double rightArm =
	    new Rectangle2D.Double(x + width, y + headHeight, armWidth,
				   armHeight);
	
        // put the whole robot together
	
        GeneralPath wholeRobot = this.get();
        wholeRobot.append(head, false);
        wholeRobot.append(torso, false);
	wholeRobot.append(leftLeg, false);
	wholeRobot.append(rightLeg, false);
	wholeRobot.append(leftArm, false);
	wholeRobot.append(rightArm, false);
	wholeRobot.append(leftEye, false);
	wholeRobot.append(rightEye, false);
    }
}
