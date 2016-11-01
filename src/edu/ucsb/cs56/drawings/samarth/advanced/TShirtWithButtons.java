package edu.ucsb.cs56.drawings.samarth.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

/**
   A TShirt with Buttons and a Pocket
      
   @author Samarth Goyal
   @version for CS56, F16, UCSB
   
*/
public class TShirtWithButtons extends TShirt implements Shape
{
    /**
     * Constructor for objects of class TShirtWithButtons
     */
    public TShirtWithButtons(double x, double y, double width)
    {
	// construct the basic shirt shell
	super(x,y,width);

	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
     
	double pocketDim = .15 * width * 1.5;
	double pocketHeight = width/4;
	
	double h = 0.125 * width * 1.5;
	double loc  = width/2;
	double r = width * .03;


	//Make the pocket
	
	Rectangle2D.Double pocket =
	    new Rectangle2D.Double(x + pocketDim/2, y + pocketHeight, pocketDim, pocketDim);

	//Make the buttons
	
	Circle button1 =
	    new Circle
	    (x + loc,
	     y + 2*h,
	     r
	     );
	
	Circle button2 =
	    new Circle
	    (x + loc,
	     y + 3*h,
	     r
	     );
	
	Circle button3 =
	    new Circle
	    (x + loc,
	     y + 4*h,
	     r
	     );
	
	Circle button4 =
	    new Circle
	    (x + loc,
	     y + 5*h,
	     r
	     );
	
	Circle button5 =
	    new Circle
	    (x + loc,
	     y + 6*h,
	     r
	     );
	
	Circle button6 =
	    new Circle
	    (x + loc,
	     y + 7*h,
	     r
	     );
	
	
	// add the elements to the shirt
	
        GeneralPath wholeShirt = this.get();
	wholeShirt.append(pocket, false);
        wholeShirt.append(button1, false);
	wholeShirt.append(button2, false);
	wholeShirt.append(button3, false);
	wholeShirt.append(button4, false);
	wholeShirt.append(button5, false);
	wholeShirt.append(button6, false);
        
    }    
}
