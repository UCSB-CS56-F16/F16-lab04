package edu.ucsb.cs56.drawings.o_k_wang.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
   A CampFire
      
   @author Oscar Wang 
   @version for CS56, W16, UCSB
   
*/
public class CampFire extends FirePit implements Shape
{
    /**
      
     */
    public CampFire(double x, double y, double width, double height)
    {
	// construct the basic FirePit shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	GeneralPath Fire = new GeneralPath();
	double bottomLeftx = x + 0.017*width;
	double bottomLefty = y - 0.08*height;
	Fire.moveTo(bottomLeftx,bottomLefty + 85*height*0.001);
	Fire.lineTo(bottomLeftx,bottomLefty + 60*height*0.001);
	Fire.lineTo(bottomLeftx + 2.5*0.005*width,bottomLefty + 70*height*0.001);
	Fire.lineTo(bottomLeftx + 5*0.005*width,bottomLefty + 60*height*0.001);
	Fire.lineTo(bottomLeftx + 7.5*width*0.005, bottomLefty + 70*height*0.001);
	Fire.lineTo(bottomLeftx + 10*width*0.005,bottomLefty + 60*height*0.001);
	Fire.lineTo(bottomLeftx + 10*width*0.005,bottomLefty + 85*height*0.001);
	Fire.lineTo(bottomLeftx, bottomLefty + 85*height*0.001);

	/*GeneralPath innerFire = new GeneralPath();
	Fire.moveTo(102,83);
	Fire.lineTo(100,58);
	Fire.lineTo(100.5,68);
	Fire.lineTo(103,58);
	Fire.lineTo(105.5,68);
	Fire.lineTo(108,58);
	Fire.lineTo(108,83);
	Fire.lineTo(102,83);
	*/
	// add the CampFire to the FirePit
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath FirePit = this.get();
        FirePit.append(Fire, false);
	//FirePit.append(innerFire, false);
    }    
}
