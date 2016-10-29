package edu.ucsb.cs56.drawings.klong.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.geom.Ellipse2D;
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
   A TShirt
      
   @author Keith Long 
   @version for CS56, W16, UCSB
   
*/
public class TShirtWithLogo extends TShirt implements Shape
{
    /**
     * Constructor for objects of class TShirtWithLogo
     */
    public TShirtWithLogo(double x, double y, double width,
	          double heightOfSleeves, double sleeveHeight, double sleeveLength)
    {
	// construct the basic house shell
	super(x,y,width,heightOfSleeves, sleeveHeight, sleeveLength);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	Ellipse2D.Double e1 = new Ellipse2D.Double(x,
            y +(heightOfSleeves+sleeveHeight)/2, width/3, (heightOfSleeves+sleeveHeight)/3);          
	Ellipse2D.Double e2 = new Ellipse2D.Double(x,
            y +(heightOfSleeves+sleeveHeight)/2, width/3, (heightOfSleeves+sleeveHeight)/3);  
		
       // GeneralPath wholeShirt = this.get();
        gp.append(e1, false);
        gp.append(e2, false);
    }    
}
