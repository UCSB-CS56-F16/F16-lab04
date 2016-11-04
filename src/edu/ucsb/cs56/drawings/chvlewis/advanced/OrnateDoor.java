package edu.ucsb.cs56.drawings.chvlewis.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;

/**
   A House
      
   @author Phill Conrad 
   @author Charles Lewis
   @version for CS56, W16, UCSB
   
*/
public class OrnateDoor extends Door implements Shape
{
    /**
     * Constructor for objects of class OrnateDoor
     */
    public OrnateDoor(double x, double y, double width, double height)
    {
	// construct the basic door shell
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
	
	// Make door outline variables
	double w = width/20.0;
	double doorOutlineX = x + w;
	double doorOutlineY = y + w;
	double doorOutlineWidth = width - 2*w;
	double doorOutlineHeight = height - w;

	// Make door window variables
	double windowX = x + width/2.0;
	double windowY = y + w + doorOutlineHeight/4.0;
	double windowRadius = doorOutlineHeight/8.0;

	
	// Make window
	Circle window = new Circle(windowX, windowY, windowRadius);
	Line2D.Double vertWinLine =
	    new Line2D.Double(windowX, windowY - windowRadius,
			      windowX, windowY + windowRadius);
	Line2D.Double horizWinLine =
	    new Line2D.Double(windowX - windowRadius, windowY,
			      windowX + windowRadius, windowY);
	
	// Make decoration variable
	double v = width/9.0;
	double decorTop = y + 0.5 * doorOutlineHeight + w;
	double decorHeight = 0.45 * doorOutlineHeight;

	double lDecorX = doorOutlineX + v - w;
	double rDecorX = doorOutlineX + 5.0*v - w;

	double u = 0.3*v;
	double lInnerX = lDecorX + u;
	double rInnerX = rDecorX + u;
	double innerTop = decorTop + u;
	double innerHeight = decorHeight - 2*u;
	
	// Make decorations
	Rectangle2D.Double leftOuterDecor =
	    new Rectangle2D.Double(lDecorX, decorTop,
				   3.0 * v, decorHeight);
	Rectangle2D.Double leftInnerDecor =
	    new Rectangle2D.Double(lInnerX, innerTop,
				   3.0 * v - 2*u, innerHeight);
	Rectangle2D.Double rightOuterDecor =
	    new Rectangle2D.Double(rDecorX, decorTop,
				   3.0 * v, decorHeight);
	Rectangle2D.Double rightInnerDecor =
	    new Rectangle2D.Double(rInnerX, innerTop,
				   3.0 * v - 2*u, innerHeight);

	
	
	// Add decorations to door
	GeneralPath wholeDoor = this.get();
        wholeDoor.append(window, false);
	wholeDoor.append(horizWinLine, false);
	wholeDoor.append(vertWinLine, false);
	wholeDoor.append(rightOuterDecor, false);
	wholeDoor.append(rightInnerDecor, false);
	wholeDoor.append(leftOuterDecor, false);
	wholeDoor.append(leftInnerDecor, false);

	
	/**
	
	double w = .10 * width;
	double winTop = y + 0.5 * height;
	double winHt =  0.25 * height;
	
	Rectangle2D.Double win1 =
	    new Rectangle2D.Double(x + w, winTop, 2.0 * w, winHt);
	Rectangle2D.Double win2 =
	    new Rectangle2D.Double(x + 4.0*w, winTop, 2.0 * w, winHt);
	Rectangle2D.Double win3 =
	    new Rectangle2D.Double(x + 7.0*w, winTop, 2.0 * w, winHt);
	
	// add the windows to the house
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholeHouse = this.get();
        wholeHouse.append(win1, false);
        wholeHouse.append(win2, false);
        wholeHouse.append(win3, false); 
	*/
    }    
}
