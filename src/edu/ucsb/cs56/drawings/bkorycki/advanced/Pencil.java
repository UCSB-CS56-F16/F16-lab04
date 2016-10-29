package edu.ucsb.cs56.drawings.bkorycki.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A Pencil  (wrapper around a General Path, implements Shape)
      
   @author Barbara Korycki
   @version for CS56, F16, UCSB
   
*/
public class Pencil extends GeneralPathWrapper implements Shape
{
       // Specify the upper left corner, and the 
        //  width and height of the original points used to 
        //  plot the *hard-coded* pencil
        
        final double ORIG_ULX = 150.0; 
        final double ORIG_ULY = 300.0; 
        final double ORIG_HEIGHT = 100.0; 
        final double ORIG_WIDTH =450.0; 
   
    /**
       Constructor for class pencil
       
       @param x x coord of upper left corner of pencil
       @param y y coord of upper left corner of pencil
       @param width width of the pencil
       @param height of pencil
    */
    public Pencil(double x, double y, double width, double height)
    {

	//outline of the pencil
        GeneralPath body = new GeneralPath();
	
        body.moveTo(200,400);
        body.lineTo(150,350);
	body.lineTo(200,300);
	body.lineTo(600,300);
	body.lineTo(600,400);
	body.lineTo(200,400);
	body.closePath();

	//vertical line that outlines the lead tip of the pencil
	GeneralPath leadLine = new GeneralPath();

	leadLine.moveTo(162, 362);
	leadLine.lineTo(162, 338);

	//vertical line that separates the tip of the pencil from the rest of the body
	GeneralPath tipLine = new GeneralPath();
	tipLine.moveTo(200, 400);
	tipLine.lineTo(200, 300);
	
	//vertical line that outlines the eraser
	Shape eraser = ShapeTransforms.translatedCopyOf(tipLine, 350, 0.0);
       
        // now we put the whole thing together ino a single path.
        GeneralPath wholePencil = new GeneralPath ();
        wholePencil.append(body, false);
	wholePencil.append(leadLine, false);
        wholePencil.append(tipLine, false);
	wholePencil.append(eraser, false);
     
        // translate to the origin by subtracting the original upper left x and y
        // then translate to (x,y) by adding x and y
        
        Shape s = ShapeTransforms.translatedCopyOf(wholePencil, -ORIG_ULX + x, -ORIG_ULY + y);
 
	// scale to correct height and width
        s =  ShapeTransforms.scaledCopyOf(s,
					  width/ORIG_WIDTH,
					  height/ORIG_HEIGHT) ;
	 
	// Use the GeneralPath constructor that takes a shape and returns
	// it as a general path to set our instance variable cup
        
	this.set(new GeneralPath(s));
        
    }

}
