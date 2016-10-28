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
   Two Ovals that when stacked, look mildy like a peanut
      
   @author Dominic Kirby
   @version for CS56, W16, UCSB
   
*/

public class Peanut extends GeneralPathWrapper implements java.awt.Shape
{
    /*
      @param x x coord of the top of the peanut
      @param radius, radius of the two bulges of the peanut
    */ 
    public Peanut(double x, double y, double height){
	height = height*2;
	Ellipse2D.Double top = 
	    new Ellipse2D.Double(x-height/4,y,height/5, (height/2));
		
	Ellipse2D.Double bottom =
	    new Ellipse2D.Double(x-height/4,y + height/2,
			     height/5, (height/2));
		
        
	GeneralPath wholePeanut = this.get();
	wholePeanut.append(top, false);
	wholePeanut.append(bottom, false);
        
        
        
        
    }
}
