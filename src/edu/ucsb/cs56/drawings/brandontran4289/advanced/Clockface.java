package edu.ucsb.cs56.drawings.brandontran4289.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a clockface that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Brandon Tran
   @version for CS56, F17, UCSB
   
*/
public class Clockface extends GeneralPathWrapper implements Shape
{
	/**
        Constructor
       
        @param x x coord of roughly the center of the octogon
        @param y y coord of roughly the center of the octogon
        @param r the 'radius' of the clockface; not precise measurement
        */

    public Clockface(double x, double y, double r)
    {

	//create 8 line segments to make an octogon	
        Line2D.Double north =
            new Line2D.Double (x, y+r, ((r * 13)/16)+x, y+r);

        Line2D.Double south =
            new Line2D.Double (x, y-r, ((r * 13)/16)+x, y-r);

	Line2D.Double west =
	    new Line2D.Double (-((r * 9)/16)+x, -((r * 13)/32)+y, -((r * 9)/16)+x, ((r * 13)/32)+y);
	
	Line2D.Double east =
            new Line2D.Double (((r * 21)/16)+x, -((r * 13)/32)+y, ((r * 21)/16)+x, ((r * 13)/32)+y);

	Line2D.Double northwest =
            new Line2D.Double (-((r * 9)/16)+x, ((r * 13)/32)+y, x, y+r);

        Line2D.Double northeast =
            new Line2D.Double (((r * 21)/16)+x, ((r * 13)/32)+y, ((r * 13)/16)+x, y+r );

        Line2D.Double southwest =
            new Line2D.Double (-((r * 9)/16)+x, -((r * 13)/32)+y, x, y-r);

        Line2D.Double southeast =
            new Line2D.Double (((r * 13)/16)+x, y-r, ((r * 21)/16)+x, -((r * 13)/32)+y);
	

	//create hands of clock
	Line2D.Double shorthand =
	    new Line2D.Double (((r * 13)/32)+x, y, x, -((r * 13)/32)+y);

	Line2D.Double longhand =
	    new Line2D.Double (((r * 13)/32)+x, y, ((r * 35)/32)+x, -((r * 22)/32)+y);


        // put the whole clockface together
        GeneralPath wholeClock = this.get();
        wholeClock.append(north, false);
	wholeClock.append(south, false);
	wholeClock.append(west, false);
	wholeClock.append(east, false);
	wholeClock.append(northwest, false);
	wholeClock.append(southwest, false);
	wholeClock.append(northeast, false);
	wholeClock.append(southeast, false);
	wholeClock.append(shorthand, false);
	wholeClock.append(longhand, false);	

    }
}

