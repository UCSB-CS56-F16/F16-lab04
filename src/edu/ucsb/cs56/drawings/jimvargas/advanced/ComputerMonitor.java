package edu.ucsb.cs56.drawings.jimvargas.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**

 A vector drawing of a computer monitor that implements
   the Shape interface, the Panel class, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Jim Vargas 
   @version for CS56, F16, UCSB
   
*/
public class ComputerMonitor extends Panel implements Shape
{
    /**
     * Constructor for objects of class ComputerMonitor
       
       @param x x coord of lower left corner of panel
       @param y y coord of lower left corner of panel
       @param width of the panel
       @param height of panel
    */

    public ComputerMonitor(double x, double y, double width, double height)
    {
	// construct the basic panel shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// Make outer frame of panel, spaced like this, where w = width * 0.1;
	//  ________________
	// | +------------+ |
	// | |            | |
	// | |            | |
	// | |            | |
	// | |            | |
       	// | +------------+ |
	// |________________|
	//   w            w
	// The top of frame will be at y + 0.9 * height and the
	// height of the frame is 1.2 * height;
	
	double w = width * 0.1;
	double frameTop = y + 0.9 * height;
	double frameHt = 1.2 * height;
	    
	Rectangle2D.Double frame =
	    new Rectangle2D.Double(x - w, frameTop, width * 1.2, frameHt);

	Rectangle2D.Double stand =
	    new Rectangle2D.Double(x + 0.4 * width, y + frameHt * 1.75, width * 0.2, height * 0.4);

	Rectangle2D.Double base =
	    new Rectangle2D.Double(x + 0.15 * width, y + frameHt * 2, width * 0.7, height * 0.2);
	

	// add the base, frame, and stand to the panel
	
        GeneralPath entirePanel = this.get();
        entirePanel.append(frame, false);
	entirePanel.append(stand, false);
	entirePanel.append(base, false);

    }    
}
