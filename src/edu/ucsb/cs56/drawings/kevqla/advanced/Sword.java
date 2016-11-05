package edu.ucsb.cs56.drawings.kevqla.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A Sword (wrapper around a General Path, implements Shape)

   @author Kevin La
   @version for CS56, F16, UCSB
   
*/
public class Sword extends GeneralPathWrapper implements Shape
{   
    /**
     * Constructor for objects of class Sword
     */
    public Sword(double x, double y, double width, double height)
    {
	
        
        final double ORIG_ULX = 100.0; 
        final double ORIG_ULY = 100.0; 
        final double ORIG_HEIGHT = 300.0; 
        final double ORIG_WIDTH = 400.0; 
        
        GeneralPath leftSide = new GeneralPath();
	
        // left side of Blade
	
        leftSide.moveTo(175,500);
        leftSide.lineTo(175,150);
        leftSide.lineTo(200,100);
        
        
        GeneralPath hilt = new GeneralPath();
       
        hilt.moveTo(175,500);
        hilt.lineTo(125,500);
	hilt.lineTo(125,555);
	hilt.lineTo(175,555);
	hilt.lineTo(175,700);
	hilt.lineTo(225,700);
	hilt.lineTo(225,555);
	hilt.lineTo(275,555);
	hilt.lineTo(275,500);
	hilt.lineTo(225,500); //Hilt of the Sword

	GeneralPath Middle = new GeneralPath();
	Middle.moveTo(200,150);
	Middle.lineTo(200,500);//little detail to show its a sword
        
        
       
        Shape rightSide = ShapeTransforms.horizontallyFlippedCopyOf(leftSide);
       
        // after flipping around the upper left hand corner of the
        // bounding box, we move this over to the right by 400 pixels
       
        rightSide = ShapeTransforms.translatedCopyOf(rightSide, 50.0, 0.0);
       
        // now we put the whole thing together ino a single path.
       
        GeneralPath wholeSword = new GeneralPath ();
        wholeSword.append(hilt, false);
        wholeSword.append(leftSide, false);
        wholeSword.append(rightSide, false);
	wholeSword.append(Middle,false);

        // translate to the origin by subtracting the original upper left x and y
        // then translate to (x,y) by adding x and y
        
        Shape s = ShapeTransforms.translatedCopyOf(wholeSword, -ORIG_ULX + x, -ORIG_ULY + y);
 
	// scale to correct height and width
        s =  ShapeTransforms.scaledCopyOf(s,
					  width/ORIG_WIDTH,
					  height/ORIG_HEIGHT) ;
	 
	// Use the GeneralPath constructor that takes a shape and returns
	// it as a general path to set our instance variable sword
        
	this.set(new GeneralPath(s));
        
    }

}
