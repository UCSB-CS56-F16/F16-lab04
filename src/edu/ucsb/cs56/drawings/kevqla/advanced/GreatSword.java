package edu.ucsb.cs56.drawings.kevqla.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D; 
/**
   A Better Looking Sword
      
   @author Kevin La 
   @version for CS56, F16, UCSB
   
*/
public class GreatSword extends Sword implements Shape
{
        public GreatSword(double x, double y, double width, double height)
    {
	// construct the basic Sword
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	//added a jewel to make the Sword Greater(enchanted)
	double j = 0.10 * width;
	double JewelHt =  0.35 * height;
	
	Ellipse2D.Double Jewel =
	    new Ellipse2D.Double(x*0.259 + width, y*1.05 + height, j, JewelHt);

	

	
        GeneralPath wholeSword = this.get();
        wholeSword.append(Jewel, false);
        
    }    
}

