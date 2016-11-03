package edu.ucsb.cs56.drawings.seanshelton.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
	A drawing of an Envelope using the Shape interface
	so that it can be altered through transformations.
      
   @author Sean Shelton 
   @version for CS56, F16, UCSB
   
*/
public class Envelope extends GeneralPathWrapper implements Shape
{
    /**
       Constructor:

	Takes in the x and y coordinates of the envelope, along with size
	in width and height.
       
       @param x x coord of lower left corner of envelope
       @param y y coord of lower left corner of envelope
       @param width width of the envelope
       @param height of envelope 
    */
    public Envelope(double x, double y, double width, double height)
    {
        // making the body of the envelope
        Rectangle2D.Double envelopeBody = 
            new Rectangle2D.Double(x, y,
				   width, height);

		// easier to keep track of where the flap's supposed to be,
		// which is halfway down the envelope, and halfway across
        double flapHeight = (y+(height/2));

		// Left diagonal line of the flap
        Line2D.Double leftFlap = 
            new Line2D.Double (x, y,
                               x + width/2.0, flapHeight);
	
		// Right diagonal line of the flap
        Line2D.Double rightFlap =
            new Line2D.Double (x + width/2.0, flapHeight,
                               x + width, y);
	

		// Putting everything in the envelope together	
        GeneralPath envelope = this.get();
        envelope.append(envelopeBody, false);
        envelope.append(leftFlap, false);
        envelope.append(rightFlap, false);    
    }
}
