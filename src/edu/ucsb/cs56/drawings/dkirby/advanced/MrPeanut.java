package edu.ucsb.cs56.drawings.dkirby.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes
import java.awt.Graphics;
import java.awt.Color;
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RectangularShape;
import java.awt.Graphics2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A Peanut with a top-hat, monocle, and arms/legs.
      
   @author Dominic Kirby
   @version for CS56, W16, UCSB
   
*/
public class MrPeanut extends Peanut implements java.awt.Shape
{


    public MrPeanut(double x, double y, double height){
	super(x,y, height);
	
	GeneralPath gp = this.get();
	height = height * 2;
	Rectangle2D.Double hatRidge =
	    new Rectangle2D.Double(x - height/4, y- height/20, height/5,
				    height/20);
	
	Rectangle2D.Double hatTop =
	    new Rectangle2D.Double(x-height/5, y - height/4, height/10,
				   height/5);
	
	Line2D.Double leftArmTop =
	    new Line2D.Double(x - height/4 , y + height/3,
			      x - 2*height/5, y + height/3);
	
	Line2D.Double leftArmBottom =
	    new Line2D.Double(x - 2* height/5 , y+ height/3,
			      x - 2*height/5 , y +height/2);

	Line2D.Double RightArmTop =
	    new Line2D.Double(x -height/16 , y + height/3,
			      x + height/10, y + height/3);
	
	Line2D.Double RightArmBottom =
	    new Line2D.Double(x + height/10, y + height/3,
			      x + height/10, y + height/2);

	Ellipse2D.Double monocle =
	    new Ellipse2D.Double(x - height/5, y + height/10,
			       height/20, height/20);

	Line2D.Double leftLeg =
	    new Line2D.Double(x-height/4, y + 8*height/10,
			      x - height/4, y + 5*height/4);

	Line2D.Double rightLeg =
	    new Line2D.Double(x-height/20, y + 8*height/10,
			      x-height/20, y + 5*height/4);
	
	GeneralPath MrPeanut = this.get();
	MrPeanut.append(hatRidge, false);
	MrPeanut.append(hatTop, false);
	MrPeanut.append(leftArmTop, false);
	MrPeanut.append(leftArmBottom, false);
	MrPeanut.append(RightArmTop, false);
	MrPeanut.append(RightArmBottom, false);
	MrPeanut.append(monocle, false);
	MrPeanut.append(leftLeg, false);
	MrPeanut.append(rightLeg, false);
    }
}
      
