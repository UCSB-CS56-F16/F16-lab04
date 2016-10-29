package edu.ucsb.cs56.drawings.vinhha.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
   A House
      
   @author Phill Conrad 
   @version for CS56, W16, UCSB
   
*/
public class BirthdayBalloon extends Balloon implements Shape
{
    /**
     * Constructor for objects of class CoffeeCup
     */
    public BirthdayBalloon(double x, double y, double width, double height)
    {
	// construct the basic house shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	 Line2D.Double HL =
	     new Line2D.Double (x - 35, y - 30 ,
				x - 35, y + 30);
	 Line2D.Double HM =
	     new Line2D.Double (x - 35, y,
				x - 10, y);
	 Line2D.Double HR =
	     new Line2D.Double (x - 10, y - 30,
				x - 10, y + 30);
	 
	 
	 Line2D.Double BBack =
	     new Line2D.Double (x + 10, y - 25,
				x + 10, y + 25);
	 Circle BBottom = new Circle(x + 24 , y + 15, 15);
	 Circle BTop = new Circle(x + 24, y - 15, 15);
	 
	 
	 GeneralPath path = this.get();
	 path.append(HL, false);
	 path.append(HM, false);
	 path.append(HR, false);
	 path.append(BBottom,false);
	 path.append(BBack,false);
	 path.append(BTop,false);
	
	//        GeneralPath wholeBalloon = this.get();

    }    

}
