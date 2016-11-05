package edu.ucsb.cs56.drawings.diegosegundo.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Ellipse2D;
import edu.ucsb.cs56.drawings.diegosegundo.simple.Circle;

/**
   A Pizza Type
      
   @author Diego Segundo 
   @version for CS56, F16, UCSB
   
*/
public class PizzaWithPep extends Pizza implements Shape
{
    /**
     * Constructor for objects of class PizzaWithPep
     */
    public PizzaWithPep(double x, double y, double width)
    {
	// construct the basic Pizza shell
	super(x,y,width);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// Make three slices of pepporoni
	
	double r = (0.10) * width;
	
        Circle pep1 = new Circle(x+2.7*r,y+2.0*r,2.0*r);
	Circle pep2 = new Circle(x+(width/2.0)+(1.5*r), y + (4.0*r),2.0*r);
	Circle pep3 = new Circle(x+(width/2.0), y + (8.0*r),2.0*r);
	// add the pepporoni to the pizza
	// (Hint--is a method of "GeneralPath")
        
				 
        GeneralPath wholePizza = this.get();
        wholePizza.append(pep1, false);
        wholePizza.append(pep2, false);
        wholePizza.append(pep3, false); 
    }    
}
