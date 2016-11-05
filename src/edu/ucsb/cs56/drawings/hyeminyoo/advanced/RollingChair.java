package edu.ucsb.cs56.drawings.hyeminyoo.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.*;
/**
   A RollingChair
      
   @author Hyemin Yoo 
   @version for CS56, F16, UCSB
   
*/
public class RollingChair extends Chair implements Shape
{
    public RollingChair(double x, double y, double width, double height)
    {
	// construct the basic house shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// Make three windows, spaced like this, where w=width/10.0;
	// | +--+ +--+ +--+ |
	// | |  | |  | |  | |
	// | +--+ +--+ +--+ |
	// |w 2w w 2w w w2 w|
	//
	// The top of window will be at y + 0.5*height and the
	// height of the window is 0.25height;
	// add the windows to the house
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
	double r= width/4;	
	
	Ellipse2D.Double firstWheel=
	    new Ellipse2D.Double(x,y+height,r,r );
	Ellipse2D.Double secondWheel=
	    new Ellipse2D.Double(x+width*3/4,y+height,r,r );

        GeneralPath wholeChair = this.get();
        wholeChair.append(firstWheel, false);
        wholeChair.append(secondWheel, false);
        //wholeChair.append(win3, false); 
    }    
}
