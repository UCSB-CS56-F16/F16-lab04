package edu.ucsb.cs56.drawings.mchavez00.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A California Helmet (wrapper around a General Path, implements Shape)

   This provides an example of how you can start with the coordinates
   of a hard coded object, and end up with an object that can be
   drawn anywhere, with any width or height.   
      
   @author Phill Conrad 
   @author Marco A Chavez
   @version for CS56, W16, UCSB
   
*/
public class CaliHelmet extends GeneralPathWrapper implements Shape
{   
    /**
     * Constructor for objects of class CaliHelmet
     */
    public CaliHelmet(double x, double y, double width, double height)
    {
	
        // Specify the upper left corner, and the 
        //  width and height of the original points used to 
        //  plot the *hard-coded* California Helmet
        
        final double ORIG_ULX = 100.0; 
        final double ORIG_ULY = 100.0; 
        final double ORIG_HEIGHT = 300.0; 
        final double ORIG_WIDTH = 400.0; 
        
        GeneralPath helmet = new GeneralPath();
	
       
		//helmet outline
        helmet.moveTo(100,100);
        helmet.lineTo(140,60);
		helmet.lineTo(200,60);
		helmet.lineTo(240,80);
		helmet.lineTo(340,180);
		helmet.lineTo(340,220);
		helmet.lineTo(300,240);
		helmet.lineTo(160,240);
		helmet.lineTo(100,190);
		helmet.lineTo(100,100);
		//face shield outline
		helmet.moveTo(340,180);
		helmet.lineTo(200,140);
		helmet.lineTo(200,100);
		helmet.lineTo(240,80);
		// california state outline
		helmet.moveTo(120,100);
		helmet.lineTo(160,100);
		helmet.lineTo(160,140);
		helmet.lineTo(200,180);
		helmet.lineTo(200,200);
		helmet.lineTo(160,200);
		helmet.lineTo(120,140);
		helmet.lineTo(120,100);
        
        
     
        // translate to the origin by subtracting the original upper left x and y
        // then translate to (x,y) by adding x and y
        
        Shape s = ShapeTransforms.translatedCopyOf(helmet, -ORIG_ULX + x, -ORIG_ULY + y);
 
	// scale to correct height and width
        s =  ShapeTransforms.scaledCopyOf(s,
					  width/ORIG_WIDTH,
					  height/ORIG_HEIGHT) ;
	 
	// Use the GeneralPath constructor that takes a shape and returns
	// it as a general path to set our instance variable California Helmet
        
	this.set(new GeneralPath(s));
        
    }

}
