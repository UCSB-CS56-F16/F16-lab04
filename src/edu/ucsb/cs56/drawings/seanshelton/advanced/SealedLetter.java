package edu.ucsb.cs56.drawings.seanshelton.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.lang.Math;

/**
   A SealedLetter, which is an Envelope with a seal on the flap.
      
   @author Sean Shelton 
   @version for CS56, F16, UCSB
   
*/
public class SealedLetter extends Envelope implements Shape
{
    /**
     * Constructor for the SealedLetter
     * Takes location x and y, then size in width and height
     * @param x x coord of lower left corner of envelope
     * @param y y coord of lower left corner of envelope
     * @param width width of the envelope
     * @param height of envelope
     */
    public SealedLetter(double x, double y, double width, double height) {

		// construct the basic envelope
		super(x,y,width,height);

		// Trying to add a seal on the envelope.
		//
		// This is done by adding a circle and rectangle onto the flap of the envelope
		// (to be filled in later to look like a seal).
		
		double paramMin = Math.min(width, height); // helps to get seal size based
												   // on letter size
		double circleRadius = paramMin/4;

		// Circle to be put onto the envelope as a seal
		Ellipse2D.Double sealCircle =
			new Ellipse2D.Double(x-(circleRadius/2) + width/2,
				y-(circleRadius/2) + height/2, circleRadius, circleRadius);

		// Rectangle to be put onto the envelope as a seal
        Rectangle2D.Double sealRect = 
            new Rectangle2D.Double(x-(width/8)+(width/2), 
				y-(height/8)+(height/2),
					width/4, height/4);

		// Putting together the SealedLetter
        GeneralPath sealedLetter = this.get();
        sealedLetter.append(sealCircle, false); 
        sealedLetter.append(sealRect, false); 
		

 
    }    
}
