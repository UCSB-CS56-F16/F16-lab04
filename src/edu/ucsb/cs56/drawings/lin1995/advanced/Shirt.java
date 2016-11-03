package edu.ucsb.cs56.drawings.lin1995.advanced;
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
      
   @author Phill Conrad 
   @version for CS56, W16, UCSB
   
*/
public class Shirt extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of house
       @param y y coord of lower left corner of house
       @param width width of the house
       @param height of house (including first story and second story)
    */
    public Shirt(double x, double y)
    {
        Line2D.Double line1 = new Line2D.Double (x-30, y-50,
                                                 x-10, y-50);
        Line2D.Double line2 = new Line2D.Double (x-30, y-50,
                                                 x-50, y-20);
        Line2D.Double line3 = new Line2D.Double (x, y-25,
                                                 x-10, y-50);
        Line2D.Double line4 = new Line2D.Double (x-40, y,
                                                 x-50, y-20);
        Line2D.Double line5 = new Line2D.Double (x-40, y,
                                                 x-30, y-15);
        Line2D.Double line6 = new Line2D.Double (x-30, y+50, //
                                                 x-30, y-15);
        Line2D.Double line1_ = new Line2D.Double (x+30, y-50,
                                                 x+10, y-50);
        Line2D.Double line2_ = new Line2D.Double (x+30, y-50,
                                                 x+50, y-20);
        Line2D.Double line3_ = new Line2D.Double (x, y-25,
                                                 x+10, y-50);
        Line2D.Double line4_ = new Line2D.Double (x+40, y,
                                                 x+50, y-20);
        Line2D.Double line5_ = new Line2D.Double (x+40, y,
                                                 x+30, y-15);
        Line2D.Double line6_ = new Line2D.Double (x+30, y+50,   //
                                                 x+30, y-15);
        Line2D.Double line7 = new Line2D.Double (x-30, y+50,    //
                                                 x+30, y+50);   //


    	GeneralPath wholeShirt = this.get();
    	wholeShirt.append(line1, false);
    	wholeShirt.append(line2, false);
    	wholeShirt.append(line3, false);
    	wholeShirt.append(line4, false);
    	wholeShirt.append(line5, false);
    	wholeShirt.append(line6, false);
    	wholeShirt.append(line1_, false);
    	wholeShirt.append(line2_, false);
    	wholeShirt.append(line3_, false);
    	wholeShirt.append(line4_, false);
    	wholeShirt.append(line5_, false);
    	wholeShirt.append(line6_, false);
    	wholeShirt.append(line7, false);
    }
}
