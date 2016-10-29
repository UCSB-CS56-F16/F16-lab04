package edu.ucsb.cs56.drawings.edwardguardado.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;


/**
	A Full Martini
   @author Edward Guardado
   @version for CS56, F16, UCSB
   
*/
public class FullMartini extends MartiniGlass implements Shape
{
    /**
     * Constructor for objects of class FullMartini
     */
    public FullMartini(double x, double y, double width, double height)
    {
	// construct the basic Glass shape
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	double adjustedHeight = height/2.0;
	double adjustedWidth = width/2.0;
	
	Line2D.Double fillLine = 
			new Line2D.Double(x , y, x+width, y);
	
	Ellipse2D.Double olive = 
			new Ellipse2D.Double(x+adjustedWidth-adjustedWidth*.1,y+adjustedHeight-15,width*0.1, height * 0.1);
	
	
	
	// add the olive to the glass
	// fill it to the brim
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholeMartini = this.get();
        wholeMartini.append(fillLine, false);
		wholeMartini.append(olive, false);

    }    
}
