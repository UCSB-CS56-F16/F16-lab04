package edu.ucsb.cs56.drawings.cristobal_caballero.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A Rifle (extends GeneralPathWrapper, implements Shape)   
      
   @author Cristobal Caballero
   @version for CS56, F16, UCSB
   
*/
public class Rifle extends GeneralPathWrapper implements Shape
{   
    /*
      Constructor for objects of class Rifle
    */
    public Rifle(double x, double y, double width)
    {
	
        // Specify the upper left corner, and the 
        //  width of the original points used to 
        //  plot the *hard-coded* Rifle
	double xCoord = x;
	double yCoord = y;
	double w = width;

	GeneralPath body = new GeneralPath();
	body.moveTo(xCoord, yCoord + .04*w);
	body.lineTo(xCoord + .18*w, yCoord + .02*w);
	body.lineTo(xCoord + .185*w, yCoord + .03*w);
	body.lineTo(xCoord + .21*w, yCoord + .03*w);
	body.lineTo(xCoord + .27*w, yCoord);
	body.lineTo(xCoord + w, yCoord);
	body.lineTo(xCoord + w, yCoord + .02*w);
	body.lineTo(xCoord + .72*w, yCoord + .02*w);
	body.lineTo(xCoord + .72*w, yCoord + .04*w);
	body.lineTo(xCoord + .23*w, yCoord + .06*w);
	body.lineTo(xCoord, yCoord + .18*w);
	body.lineTo(xCoord, yCoord + .04*w);

	GeneralPath trigger = new GeneralPath();
	trigger.moveTo(xCoord + .28*w, yCoord + .06*w);
	trigger.lineTo(xCoord + .245*w, yCoord + .09*w);
	trigger.lineTo(xCoord + .17*w, yCoord + .09*w);
	trigger.moveTo(xCoord + .24*w, yCoord + .06*w);
	trigger.lineTo(xCoord + .235*w, yCoord + .07*w);
	trigger.lineTo(xCoord + .24*w, yCoord + .08*w);

	GeneralPath sight = new GeneralPath();
	sight.moveTo(xCoord + .96*w, yCoord);
	sight.lineTo(xCoord + .97*w, yCoord - .01*w);
	sight.lineTo(xCoord + .99*w, yCoord - .01*w);
	sight.lineTo(xCoord + w, yCoord);

	GeneralPath bolt = new GeneralPath();
	bolt.moveTo(xCoord + .33*w, yCoord);
	bolt.lineTo(xCoord + .33*w, yCoord + .015*w);
	bolt.lineTo(xCoord + .41*w, yCoord + .015*w);
	bolt.lineTo(xCoord + .41*w, yCoord);

	GeneralPath Rifle = new GeneralPath();
	Rifle.append(body, false);
	Rifle.append(trigger, false);
	Rifle.append(sight, false);
	Rifle.append(bolt, false);
	 
	// Use the GeneralPath constructor that takes a shape and returns
        
	this.set(new GeneralPath(Rifle));  
    }

}
