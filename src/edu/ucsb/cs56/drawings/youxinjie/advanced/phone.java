package edu.ucsb.cs56.drawings.youxinjie.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Ellipse2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a phone that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Xinjie You
   @version for CS56, F16, UCSB
   
*/
public class phone extends GeneralPathWrapper implements Shape
{
  /**
    Constructor
       
    @param x x coord of lower left corner of phone
    @param y y coord of lower left corner of phone
    @param width width of the phone
    @param height of phone
  */
  public phone(double x, double y, double width, double height)
  {
    double screenHeight = .8 * height;
    double screenWidth = .9 * width;
    double screenrighterX = .05 *width + x;
    double screenUpperLeftY = .05*height +y;
    double homekeycenterX = .5*width +x;
    double homekeycenterY = .925*height +y;
    double homekeyradius = .05*height;
        
    Rectangle2D.Double phone= new Rectangle2D.Double(x, y, width, height);
    Rectangle2D.Double screen = 
      new Rectangle2D.Double(screenrighterX, screenUpperLeftY, screenWidth, screenHeight);
    Ellipse2D.Double homekey = 
      new Ellipse2D.Double(homekeycenterX - homekeyradius, homekeycenterY - homekeyradius, 
        homekeyradius * 2,  homekeyradius * 2);  
    // put the whole phone together
	
    GeneralPath wholephone = this.get();
    wholephone.append(screen, false);
    wholephone.append(phone, false);
    wholephone.append(homekey, false);    
  }
}
