package edu.ucsb.cs56.drawings.hduransoto.advanced;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

public class Bear extends GeneralPathWrapper implements Shape{
    
    public Bear
	(
	 double x,
	 double y,
	 double bellyRad,
	 double feetArmRad
	 )
    {
	
	double bellySize   = bellyRad;
	double headSize    = bellySize * 0.8; 
	double feetArmSize = bellySize * 0.2;

	Circle belly = 
            new Circle(x, y - bellySize, bellySize);
	
        Circle head = 
            new Circle
	    (x, y - bellySize * 2 - headSize, headSize);
	
	Circle ear1 = 
	    new Circle
	    (x+feetArmSize*1.5, y - bellySize*2-headSize*2.2, feetArmSize);
	
	Circle ear2 = 
	    new Circle
	    (x-feetArmSize*1.5, y - bellySize*2 - headSize*2.2, feetArmSize);

	Circle eye1 = 
	    new Circle
	    (x+feetArmSize*1.5, y - bellySize*2 - headSize*1.5, feetArmSize);

	Circle eye2 = 
	    new Circle
	    (x-feetArmSize*1.5, y - bellySize*2 - headSize*1.5, feetArmSize);

	Circle nose = 
	    new Circle
	    (x, y - bellySize*2 - headSize, feetArmSize/2);

	Ellipse2D.Double mouth =
	    new Ellipse2D.Double
	    (x-feetArmSize*2, y-bellySize*2-headSize/2, feetArmSize*4, feetArmSize);
	
	//make the feets
	Ellipse2D.Double feet1 =
	    new Ellipse2D.Double
	    (x+feetArmSize*1.5, y-bellySize*0.1, feetArmSize*1.5, feetArmSize*3);
	
	Ellipse2D.Double feet2 =
	    new Ellipse2D.Double
	    (x-feetArmSize*3, y-bellySize*0.1, feetArmSize*1.5, feetArmSize*3);

	//make the arms
	Ellipse2D.Double arm1 =
	    new Ellipse2D.Double
	    (x-headSize*1.45, y-bellySize*2.1, feetArmSize*3, feetArmSize*2);

	Ellipse2D.Double arm2 =
	    new Ellipse2D.Double
	    (x+headSize*0.7, y-bellySize*2.1, feetArmSize*3, feetArmSize*2);
	
	//put the bear together
	GeneralPath Bear = this.get();
	Bear.append(belly, false);
	Bear.append(head, false);
	Bear.append(feet1, false);
	Bear.append(feet2, false);
	Bear.append(arm1, false);
	Bear.append(arm2, false);
	Bear.append(ear1, false);
	Bear.append(ear2, false);
	Bear.append(eye1, false);
	Bear.append(eye2, false);
	Bear.append(nose, false);
	Bear.append(mouth, false);
    }
    
}
