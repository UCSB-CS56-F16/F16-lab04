package edu.ucsb.cs56.drawings.millanbatra.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
/**
   A Drum With one Leg
      
   @author MillanBatra 
   @version for CS56, F16, UCSB
   
*/
public class DrumTwo extends Drum implements Shape
{
    /**
     * Constructor for objects of class CoffeeCup
     */
    public DrumTwo(double x, double y, double width,  double height)
    {
	// construct the basic drum portion of the stand
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
     	
	double wide=4*height;
	//add a stand to drum, one leg, and a dual base
	Line2D.Double  leg1=
	    new Line2D.Double(x+height*2, y+2.5*height,x+height*2, y+4*height);
	Rectangle2D.Double ontopbase =
	    new Rectangle2D.Double(x+height, y+height*4, wide/2, height/4);
	Rectangle2D.Double base =
	    new Rectangle2D.Double(x, y+height*4.25, wide, height/8);
	
        GeneralPath drumTwo = this.get();
        drumTwo.append(base, false);
        drumTwo.append(ontopbase, false);
        drumTwo.append(leg1, false); 
    }    
}
