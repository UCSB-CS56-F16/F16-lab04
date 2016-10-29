package edu.ucsb.cs56.drawings.vchandran2.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Line2D;

/**                                                                                                           
   A DOLLAR BILL!!!                                                                                                    
                                                                                                              
   @author Veena Chandran                                                                                       
   @version for CS56, F16, UCSB                                                                               
                                                                                                              
*/
public class DollarBill extends Money implements Shape
{
    /**    
    @param x x coord of dollar bill corner
    @param y y coord of dollar bill corner
    @param height height of dollarbill
    */
    public DollarBill(double x, double y, double height)
    {
	// construct the basic bill shell
	super(x,y,height);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	Line2D.Double line =
	    new Line2D.Double(x + height, y + ((3*height)/8),
			      x + height, y + ((5*height)/8));
	
    

	GeneralPath wholeDollarBill = this.get();
	wholeDollarBill.append(line, false);
    }
}



