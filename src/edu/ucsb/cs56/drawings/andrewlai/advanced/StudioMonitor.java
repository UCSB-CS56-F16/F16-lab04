package edu.ucsb.cs56.drawings.andrewlai.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape;
import java.awt.geom.Ellipse2D; 
import java.awt.geom.Rectangle2D;

/**
   A KRK Rokit 5 Studio Monitor
   
   @author Phill Conrad 
   @author Andrew Lai
   @version for CS56, F17, UCSB
   
*/
public class StudioMonitor extends Speaker implements Shape
{
    /**
     * Constructor for objects of class StudioMonitor
     */
    public StudioMonitor(double x, double y, double height)
    {
	// construct the basic speaker shell
	super(x,y,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

    // from speaker
    double width = .64 * height;
    double wooferCenterY = .67 * height;
    double wooferRadius = .25 * height;
    double wooferDiameter = wooferRadius * 2.0;

    // a dome at the center of the woofer
    double domeRadius = .33 * wooferRadius;
    double domeDiameter = domeRadius * 2.0;
    Ellipse2D.Double dome = new Ellipse2D.Double (x + width/2.0 - domeRadius, y + wooferCenterY - domeRadius, domeDiameter, domeDiameter);

    // a tweeter on top of the woofer
    double tweeterCenterY = .25 * height;
    double tweeterRadius = .1 * height;
    double tweeterDiameter = tweeterRadius * 2.0;
    Ellipse2D.Double tweeter = new Ellipse2D.Double (x + width/2.0 - tweeterRadius, y + tweeterCenterY - tweeterRadius, tweeterDiameter, tweeterDiameter);

	// add the new stuff that makes the speaker a monitor
	
        GeneralPath wholeStudioMonitor = this.get();
        wholeStudioMonitor.append(dome, false);
        wholeStudioMonitor.append(tweeter, false);
    }    
}
