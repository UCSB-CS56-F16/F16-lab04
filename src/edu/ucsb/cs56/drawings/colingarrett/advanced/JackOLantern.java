package edu.ucsb.cs56.drawings.colingarrett.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

/**
   A JackOLantern (a Pumpkin with a carved face)
      
   @author Phill Conrad 
   @author Colin Garrett
   @version for CS56, F16, UCSB
   
*/
public class JackOLantern extends Pumpkin implements Shape
{
        /**
       Constructor for objects of class JackOLantern
       
       @param x x coord of lower left corner of JackOLantern
       @param y y coord of lower left corner of JackOLantern
       @param width width of the JackOLantern
       @param height of JackOLantern (including circle and stem)
    */
    public JackOLantern(double x, double y, double width, double height)
    {
	// construct the basic pumpkin shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to carve--append--into
	GeneralPath gp = this.get();
	
	double w = 0.20 * width;
	double h = 0.20 * 0.75 * height;
	double eyeTop =  y + (0.25 * height) + h;

	// make eyes and mouth
	Ellipse2D.Double leftEye =
	    new Ellipse2D.Double(x + w, eyeTop, w, h);
	Ellipse2D.Double rightEye =
	    new Ellipse2D.Double(x + 3.0*w, eyeTop, w, h);
	Rectangle2D.Double mouth =
	    new Rectangle2D.Double(x + w, eyeTop + 2.0*h, 3.0*w, h);
	
	// add the eyes and mouth to the pumpkin
        GeneralPath wholePumpkin = this.get();
        wholePumpkin.append(leftEye, false);
        wholePumpkin.append(rightEye, false);
        wholePumpkin.append(mouth, false); 
    }    
}
