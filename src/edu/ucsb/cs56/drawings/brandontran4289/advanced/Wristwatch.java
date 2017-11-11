package edu.ucsb.cs56.drawings.brandontran4289.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
   A vector drawing of a wristwatch
   that extends clockface by adding a wriststrap
   By implementing Shape, it can be transformed, rotated, etc.
      
   @author Brandon Tran
   @version for CS56, F17, UCSB
   
*/

public class Wristwatch extends Clockface implements Shape
{

    /**
        Constructor
       
        @param x x coord of roughly the center of the octogon
        @param y y coord of roughly the center of the octogon
        @param r the 'radius' of the clockface; not precise measurement
    	@param length the length of both top and bottom wriststraps
    */

    public Wristwatch(double x, double y, double r, double length)
    {
        // construct the basic clockface shell
        super(x, y, r);

        // get the GeneralPath that we are going to append stuff to
        GeneralPath gp = this.get();

	
	// create bottom strap of wristwatch
        Line2D.Double strap1a =
            new Line2D.Double(x, y + r, x, y + r + length);
	Line2D.Double strap1b =
            new Line2D.Double(x, y + r + length, ((r * 13)/16)+x, y + r + length);
	Line2D.Double strap1c = 
            new Line2D.Double(((r * 13)/16)+x, y + r + length, ((r * 13)/16)+x, y + r);

	// create top strap of wristwatch
        Line2D.Double strap2a =
            new Line2D.Double(x, y - r, x, y - r - length);
        Line2D.Double strap2b =
            new Line2D.Double(x, y - r - length, ((r * 13)/16)+x, y - r - length);
        Line2D.Double strap2c =
            new Line2D.Double(((r * 13)/16)+x, y - r - length, ((r * 13)/16)+x, y - r);	


	// put wristwatch together
        GeneralPath wholeClock = this.get();
        wholeClock.append(strap1a, false);
	wholeClock.append(strap1b, false);
	wholeClock.append(strap1c, false);
    
        wholeClock.append(strap2a, false);
        wholeClock.append(strap2b, false);
        wholeClock.append(strap2c, false);
	
    }

}
