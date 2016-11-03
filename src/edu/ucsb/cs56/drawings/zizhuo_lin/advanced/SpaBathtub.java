package edu.ucsb.cs56.drawings.zizhuo_lin.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
/**
   A SpaBathtub
      
   @author Zizhuo Lin 
   @version for CS56, F16, UCSB
   
*/
public class SpaBathtub extends Bathtub implements Shape
{
    /**
     * Constructor for objects of class SpaBathtub
     @param x x coord of Upper left corner of SpaBathtub
     @param y y coord of Upper left corner of SpaBathtub
     @param length length of the SpaBathtub
     @param width width of the SpaBathtub
     */
    public SpaBathtub(double x, double y, double length, double width)
    {
	// construct the basic bathtub shell
	super(x,y,length,width);
	// Make one circle pump at the back side of the tug
	double CP_x = x + 0.075 * length;
	double CP_y = y + width * 0.5;
	double CP_r = 0.05 * length;
	Ellipse2D.Double CP =
	    new Ellipse2D.Double(CP_x - CP_r, CP_y - CP_r, CP_r * 2, CP_r * 2);
	
	// Make two ellipse pump at right and left hand side of the tub
	double EPL_x = x + length * 0.5;
	double EPL_y = y + width * 0.075;
	double EPL_r1 = 0.1 * length;
	double EPL_r2 = 0.05 * width;
	Ellipse2D.Double EPL =
	    new Ellipse2D.Double(EPL_x - EPL_r1, EPL_y - EPL_r2, EPL_r1, EPL_r2);
	double EPR_x = EPL_x;
	double EPR_y = EPL_y + 0.9 * width;
	Ellipse2D.Double EPR =
	    new Ellipse2D.Double(EPR_x - EPL_r1, EPR_y - EPL_r2, EPL_r1, EPL_r2);
    
	//Append the pumps to basic tub
        GeneralPath wholeBathtub = this.get();
        wholeBathtub.append(CP, false);
        wholeBathtub.append(EPL, false);
        wholeBathtub.append(EPR, false); 
    }    
}
