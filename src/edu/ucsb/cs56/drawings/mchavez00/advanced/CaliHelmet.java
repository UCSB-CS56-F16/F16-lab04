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
   @version for CS56, F16, UCSB
   
*/
public class CaliHelmet extends Helmet implements Shape
{   
    /**
     * Constructor for objects of class CaliHelmet
     */
    public CaliHelmet(double x, double y, double width, double height)
    {
		super(x,y,width,height);
        // Specify the upper left corner, and the 
        //  width and height of the original points used to 
        //  plot the *hard-coded* California Helmet
        
        final double ORIG_ULX = 100.0; 
        final double ORIG_ULY = 100.0; 
        final double ORIG_HEIGHT = 300.0; 
        final double ORIG_WIDTH = 400.0; 
        
        GeneralPath helmetLogo = new GeneralPath();
	
        helmetLogo.moveTo(120,101);
		helmetLogo.lineTo(160,101);
		helmetLogo.lineTo(160,140);
		helmetLogo.lineTo(200,180);
		helmetLogo.lineTo(200,200);
		helmetLogo.lineTo(160,200);
		helmetLogo.lineTo(120,140);
		helmetLogo.lineTo(120,100);
     
        // translate to the origin by subtracting the original upper left x and y
        // then translate to (x,y) by adding x and y
		
		//scale it back to original size		
		GeneralPath newHelmet2 = this.get();
		Shape s2 =  ShapeTransforms.scaledCopyOf(newHelmet2,
					  ORIG_WIDTH/width,
					  ORIG_HEIGHT/height) ;
		this.set(new GeneralPath(s2));

        GeneralPath newHelmet = this.get();
		//translate the logo to (x,y) location
		Shape s = ShapeTransforms.translatedCopyOf(helmetLogo, -ORIG_ULX + x, -ORIG_ULY + y);
		//append the logo to the helmet		
		newHelmet.append(s,false);
		// size the new helmet with the logo to the appropiate width and height
 		s =  ShapeTransforms.scaledCopyOf(newHelmet,
					  width/ORIG_WIDTH,
					  height/ORIG_HEIGHT) ;
	
	this.set(new GeneralPath(s));
   
        
    }

}
