package edu.ucsb.cs56.drawings.peter_master.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a stick figure that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Peter Master
   @version for CS56, F16, UCSB
   
*/
public class StickFigure extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of the center of the stick figure (its body and the top of its head)
       @param y y coord of top of head
       @param height of stick figure
    */
    public StickFigure(double x, double y, double height)
    {
	
        double headHeight = .22*height;
        double bodyHeight = .48*height;
        double armWidth = .15*height;
        double legVerticalLength = .3*height;
        double legHorizontalLength = .16*height;
        

        Ellipse2D.Double head =
            new Ellipse2D.Double (x - headHeight/2, y,
                                 x + headHeight/2, y + headHeight)

        Line2D.Double body = 
            new Line2D.Double (x, y + headHeight,
                              x, y + headHeight + bodyHeight);

        Line2D.Double leftArm =
            new Line2D.Double (x - armWidth, y + headHeight + .3*bodyHeight,
                              x, y+ headHeight + .3*bodyHeight);

        Line2D.Double rightArm =
            new Line2D.Double (x, y + headHeight + .3*bodyHeight,
                              x + armWidth, y + headHeight + .3*bodyHeight);
	
        Line2D.Double leftLeg =
            new Line2D.Double (x - legHorizontalLength, y + height,
                              x, y + headHeight + bodyHeight);

        Line2D.Double leftLeg =
            new Line2D.Double (x, y + headHeight + bodyHeight,
                              x + legHorizontalLength, y + height)
	
        // put the whole stick figure together
	
        GeneralPath stickFigure = this.get();
        stickFigure.append(head, false);
        stickFigure.append(body, false);
        stickFigure.append(leftArm, false);
        stickFigure.append(rightArm, false);
        stickFigure.append(leftLeg, false);
        stickFigure.append(rightLeg, false);    
    }
}
