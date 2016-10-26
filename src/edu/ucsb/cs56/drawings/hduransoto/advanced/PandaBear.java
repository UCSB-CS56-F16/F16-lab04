package edu.ucsb.cs56.drawings.hduransoto.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;


public class PandaBear extends Bear implements Shape
{

    public PandaBear
    	(
	 double x,
	 double y,
	 double bellyRad,
	 double feetArmRad
	 )
    {   
	super(x,y,bellyRad,feetArmRad);
	double bellySize   = bellyRad;
	double headSize    = bellySize * 0.8;
	double feetArmSize = bellySize * 0.2;
	GeneralPath gp = this.get();
	
	Circle spotEye =
	    new Circle
	    (x+feetArmSize*1.5, y-bellySize*2-headSize*1.5,feetArmSize * 1.3); 
	
	Ellipse2D.Double spotBelly =
	    new Ellipse2D.Double
	    (x-headSize*0.6, y-bellySize*1.8, bellySize, bellySize*1.7);

	GeneralPath PandaBear = this.get();
	PandaBear.append(spotEye, false);
	PandaBear.append(spotBelly, false);
	
    }
}
