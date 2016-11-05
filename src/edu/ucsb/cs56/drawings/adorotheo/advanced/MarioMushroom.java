package edu.ucsb.cs56.drawings.adorotheo.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
/**
   The Super Mushroom from Super Mario Bros.
      
   @author Austin Dorotheo 
   @version for CS56, F16, UCSB
   
*/
public class MarioMushroom  extends Mushroom implements Shape
{
    /**
     * Constructor for objects of class MarioMushroom
     */
    public MarioMushroom(double x, double y, double width, double height)
    {
	// construct the basic mushroom shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	Ellipse2D.Double eye1a = new Ellipse2D.Double(x-width*1/8, y+height/8, width/12, height/4);
	Ellipse2D.Double eye1b = new Ellipse2D.Double(x-width*1/8, y+height/8, width/12,  height/8);
	Ellipse2D.Double eye2a = new Ellipse2D.Double(x+width*1/16, y+height/8, width/12, height/4);
	Ellipse2D.Double eye2b = new Ellipse2D.Double(x+width*1/16, y+height/8, width/12, height/8);
	Ellipse2D.Double capCircle1 = new Ellipse2D.Double(x-width/2+4, y-height/4, height/4, height/4);
	Ellipse2D.Double capCircle2 = new Ellipse2D.Double(x+width/4-4, y-height/4, height/4, height/4);
	Ellipse2D.Double capCircle3 = new Ellipse2D.Double(x-width/8, y-height/2, height/4, height/4);

	GeneralPath wholeMushroom = this.get();
	wholeMushroom.append(eye1a, false);
	wholeMushroom.append(eye1b, false);
	wholeMushroom.append(eye2a, false);
	wholeMushroom.append(eye2b, false);
	wholeMushroom.append(capCircle1, false);
	wholeMushroom.append(capCircle2, false);
	wholeMushroom.append(capCircle3, false);
    }
}
