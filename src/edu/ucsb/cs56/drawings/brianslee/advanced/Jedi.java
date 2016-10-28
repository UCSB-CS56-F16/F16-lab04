package edu.ucsb.cs56.drawings.brianslee.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;

/**
   A jedi class
   
   @author Brian Lee
   @version for CS56, F16, Lab04, UCSB
*/

public class Jedi extends StickFigure implements Shape
{
    public Jedi(double x, double y, double headRad, double bodLength,
		       double armLength, double legLength)
    {
	//Make basic stick figure
	super(x, y, headRad, bodLength, armLength, legLength);

	//General path to add stuff to.
	GeneralPath gp = this.get();

	//Add lightsaber
	double saberLength = 1.5 * armLength;
	double saberWidth = .1 * headRad;
	double hiltPosX = x + (.5253219881 * armLength);
	double hiltPosY1 = y + (headRad + (.85090352453 * armLength)) - (.1 * armLength);
	double hiltPosY2 = y + (headRad + (.85090352453 * armLength)) + (.1 * armLength);

	Line2D.Double hilt = new Line2D.Double(hiltPosX, hiltPosY1, hiltPosX, hiltPosY2);
	Ellipse2D.Double blade =
	    new Ellipse2D.Double(hiltPosX - (.04 * armLength), hiltPosY1 - saberLength, saberWidth, saberLength);

	GeneralPath wJedi = this.get();
	wJedi.append(hilt, false);
	wJedi.append(blade, false);
    }
}
