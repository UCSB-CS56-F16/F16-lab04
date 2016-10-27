package edu.ucsb.cs56.drawings.brianslee.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;
/**
   A basic stick figure drawing

   @author Brian Lee
   @version for CS56, F16, Lab04, UCSB
*/
public class StickFigure extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x: x coordinate of the stick figure's head
       @param y: y coordinate of the stick figure's head
       @param headRad: radius of the stick figure's head
       @param bodLength: length of the stick figure's body
       @param armLength: length of the stick figure's arms
       @param legLength: length of the stick figure's legs
    */

    public StickFigure(double x, double y, double headRad, double bodLength,
		       double armLength, double legLength)
    {
	Circle head = new Circle (x, y, headRad);
	Line2D.Double body = new Line2D.Double(x, y + headRad, x, y + (headRad + bodLength));
	Line2D.Double lArm = new Line2D.Double(x, y + headRad, x + (.5253219881 * armLength),
					       y + (headRad + (.85090352453 * armLength)));
	Line2D.Double rArm = new Line2D.Double(x, y + headRad, x - (.5253219881 * armLength),
					       y + (headRad + (.85090352453 * armLength)));
	Line2D.Double lLeg = new Line2D.Double(x, y + (headRad + bodLength), x + (.5253219881 * legLength),
					       y + (headRad + bodLength + (.85090352453 * armLength)));
	Line2D.Double rLeg = new Line2D.Double(x, y + (headRad + bodLength), x - (.5253219881 * legLength),
					       y + (headRad + bodLength + (.85090352453 * armLength)));

	//Put figure together
	GeneralPath wholeFigure = this.get();
	wholeFigure.append(head, false);
	wholeFigure.append(body, false);
	wholeFigure.append(lArm, false);
	wholeFigure.append(rArm, false);
	wholeFigure.append(lLeg, false);
	wholeFigure.append(rLeg, false);
    }
}
