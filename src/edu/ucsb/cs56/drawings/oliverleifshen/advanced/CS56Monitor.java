package edu.ucsb.cs56.drawings.oliverleifshen.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
   A monitor that displays "CS56".  Width and height arguments must be above an
   untested amount or else it will not display correctly. Recommended width and
   height should be greater than 150 for both.
   @author Oliver Shen
   
*/
public class CS56Monitor extends CS56 implements Shape
{
    // Offset variables for monitor

    private static final double OUTER_WIDTH = 20.0;
    private static final double OUTER_HEIGHT = 20.0;
    private static final double STAND_HEIGHT = 15.0;
    private static final double BASE_HEIGHT = 5.0;
    
    /**
     * Constructor for objects of class CS56Monitor, arguments correlate to the
     * dimensions of the monitor, not the CS56 text
     */
    public CS56Monitor(double x, double y, double width, double height)
    {
	// construct the CS56 phrase
	super(x + (width / 5),
	      y + ((height - STAND_HEIGHT - BASE_HEIGHT) / 5),
	      3 * width / 5,
	      (height - STAND_HEIGHT - BASE_HEIGHT) * 3 / 5);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// Make 2 rectangles for a monitor, one for a stand, and a base
	
	double monHeight = height - STAND_HEIGHT - BASE_HEIGHT;
	double standWidth = width / 4;
	double standPos = x + (width * .375);
	
	Rectangle2D.Double monitor =
	    new Rectangle2D.Double(x, y, width, monHeight);
	Rectangle2D.Double screen =
	    new Rectangle2D.Double(x + OUTER_WIDTH, y + OUTER_HEIGHT,
				   width - (OUTER_WIDTH * 2),
				   height - (OUTER_HEIGHT * 3));
	Rectangle2D.Double stand =
	    new Rectangle2D.Double(standPos,
				   y + (height - STAND_HEIGHT - BASE_HEIGHT),
				   standWidth, STAND_HEIGHT);
	Rectangle2D.Double base =
	    new Rectangle2D.Double(x, y + (height - BASE_HEIGHT), width,
				   BASE_HEIGHT);
	
        GeneralPath whole = this.get();
        whole.append(monitor, false);
        whole.append(screen, false);
        whole.append(stand, false);
	whole.append(base, false);
    }    
}
