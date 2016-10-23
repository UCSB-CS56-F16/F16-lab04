package edu.ucsb.cs56.drawings.johnnyzhang.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
   A Spongebob
      
   @author Johnny Zhang
   @version for CS56, F16, UCSB
   
*/
public class SpongeBob extends Sponge implements Shape
{
    /**
     * Constructor for objects of class Spongebob
     */
    public SpongeBob(double x, double y, double width, double height, double radius, double arms_length)
    {
	// construct the basic sponge shell
	super(x,y,width,height,radius);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	


	double xhalfway = x+.5*width;
	double yhalfway = y+.5*height;
	
	Line2D.Double arm1 = new Line2D.Double(x,yhalfway,x-arms_length,yhalfway-.1*arms_length);
	Line2D.Double arm2 = new Line2D.Double(x+width,yhalfway,x+width+arms_length,yhalfway-.1*arms_length);
	Line2D.Double leg1 = new Line2D.Double(x+.4*width,y+height,x+.4*width,y+height+arms_length);
	Line2D.Double leg2 = new Line2D.Double(x+.6*width,y+height,x+.6*width,y+height+arms_length);
       
	
	// add the windows to the house
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholeHouse = this.get();
        wholeHouse.append(arm1, false);
	wholeHouse.append(arm2, false);
	wholeHouse.append(leg1, false);
	wholeHouse.append(leg2, false);
       
    }    
}
