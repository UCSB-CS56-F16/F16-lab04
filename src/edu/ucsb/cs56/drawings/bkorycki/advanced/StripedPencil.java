package edu.ucsb.cs56.drawings.bkorycki.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A striped pencil 
      
   @author Barbara Korycki
   @version for CS56, F16, UCSB
   
*/
public class StripedPencil extends Pencil implements Shape
{
    /**
       Constructor for StripedPencil Class
       
       @param x x coord of upper left corner of pencil
       @param y y coord of upper left corner of pencil
       @param width width of the drawing
       @param height of the drawing
    */
    public StripedPencil(double x, double y, double width, double height){
      	//get the default Pencil shape created by the super class Pencil
	super(150,300,450,100);
	GeneralPath body = this.get();

	//create 3 horizontal lines that will extend across the body to add dimension
	GeneralPath stripe = new GeneralPath();
	stripe.moveTo(200, 325);
	stripe.lineTo(550, 325);
	GeneralPath stripe2 = new GeneralPath();
	stripe2.moveTo(200, 350);
	stripe2.lineTo(550, 350);
	GeneralPath stripe3 = new GeneralPath();
	stripe3.moveTo(200, 375);
	stripe3.lineTo(550, 375);

	//add the stripes to the body
	body.append(stripe,false);
	body.append(stripe2, false);
	body.append(stripe3,false);
	
	//translate to (x,y)
	Shape s = ShapeTransforms.translatedCopyOf(body, -ORIG_ULX + x, -ORIG_ULY + y);
 
	// scale to correct height and width
        s =  ShapeTransforms.scaledCopyOf(s,
					  width/ORIG_WIDTH,
					  height/ORIG_HEIGHT) ;
	this.set(new GeneralPath(s));
       
    }

}
