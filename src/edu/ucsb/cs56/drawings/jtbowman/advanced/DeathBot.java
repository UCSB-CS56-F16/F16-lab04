package edu.ucsb.cs56.drawings.jtbowman.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
   A DeathBot
      
   @author John Bowman
   @version for CS56, W16, UCSB
   
*/
public class DeathBot extends Robot implements Shape
{
    /**
     * Constructor for objects of class DeathBot
     */
    public DeathBot(double x, double y, double width, double height)
    {
	// construct the basic DeathBot shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// Make some spikes
	
	
	
	double headHeight = 0.25 * height;
	double torsoHeight = 0.3 * height;
	double armHeight = torsoHeight * 1.2;
	double armWidth = width * 0.2;
	double spikeWidth = armWidth;
	double spikeHeight = armHeight * 0.1;
	
	Line2D.Double spike1Top =
	    new Line2D.Double(x - armWidth - spikeWidth,
			      y + headHeight + armHeight * 0.2,
			      x - armWidth,
			      y + headHeight + armHeight * 0.2 - spikeHeight);
	Line2D.Double spike1Bottom =
	    new Line2D.Double(x - armWidth - spikeWidth,
			      y + headHeight + armHeight * 0.2,
			      x - armWidth,
			      y + headHeight + armHeight * 0.2 + spikeHeight);

	Line2D.Double spike2Top =
	    new Line2D.Double(x - armWidth - spikeWidth,
			      y + headHeight + armHeight * 0.8,
			      x - armWidth,
			      y + headHeight + armHeight * 0.8 - spikeHeight);

	Line2D.Double spike2Bottom =
	    new Line2D.Double(x - armWidth - spikeWidth,
			      y + headHeight + armHeight * 0.8,
			      x - armWidth,
			      y + headHeight + armHeight * 0.8 + spikeHeight);

	Line2D.Double spike3Top =
	    new Line2D.Double(x + width + armWidth + spikeWidth,
			      y + headHeight + armHeight * 0.2,
			      x + width + armWidth,
			      y + headHeight + armHeight * 0.2 - spikeHeight);

	Line2D.Double spike3Bottom =
	    new Line2D.Double(x + width + armWidth + spikeWidth,
			      y + headHeight + armHeight * 0.2,
			      x + width + armWidth,
			      y + headHeight + armHeight * 0.2 + spikeHeight);

	Line2D.Double spike4Top =
	    new Line2D.Double(x + width + armWidth + spikeWidth,
			      y + headHeight + armHeight * 0.8,
			      x + width + armWidth,
			      y + headHeight + armHeight * 0.8 - spikeHeight);

	Line2D.Double spike4Bottom =
	    new Line2D.Double(x + width + armWidth + spikeWidth,
			      y + headHeight + armHeight * 0.8,
			      x + width + armWidth,
			      y + headHeight + armHeight * 0.8 + spikeHeight);
	

	
	// add the spikes to the robot

	
        GeneralPath wholeRobot = this.get();
        wholeRobot.append(spike1Top, false);
        wholeRobot.append(spike1Bottom, false);
	wholeRobot.append(spike2Top, false);
	wholeRobot.append(spike2Bottom, false);
	wholeRobot.append(spike3Top, false);
	wholeRobot.append(spike3Bottom, false);
	wholeRobot.append(spike4Top, false);
	wholeRobot.append(spike4Bottom, false);

    }    
}
