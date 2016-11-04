package edu.ucsb.cs56.drawings.marioinfante.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
   A star shaped pokemon

   @author Mario Infante
   @version for CS56, F16, UCSB

*/
public class Staryu extends Star implements Shape
{
    /**
     * Constructor for objects of class Staryu
     */
    public Staryu(double x, double y, double width, double height)
    {
	// construct the basic star shell
	super(x,y,width,height);

	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	Line2D.Double lineOne =
	    new Line2D.Double(x, y,
			      x + width/2.0, y + height/3.0);
	Line2D.Double lineTwo =
	    new Line2D.Double(x + width/2.0, y - height/3.0,
			      x + width/2.0, y + height/3.0);
	Line2D.Double lineThree =
	    new Line2D.Double(x + width/4.0, y + height*2.0/3.0,
			      x + width/2.0, y + height/3.0);
	Line2D.Double lineFour =
	    new Line2D.Double(x + width*3.0/4.0, y + height*2.0/3.0,
			      x + width/2.0, y + height/3.0);
	Line2D.Double lineFive =
	    new Line2D.Double(x + width, y,
			      x + width/2.0, y + height/3.0);

	Ellipse2D.Double gem =
	    new Ellipse2D.Double(x + width*3.0/8.0, y + height/10.0,
				 width/4.0, height/3.0);
	
	// add the lines to the star
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")

	GeneralPath star = this.get();
	star.append(lineOne, false);
	star.append(lineTwo, false);
	star.append(lineThree, false);
	star.append(lineFour, false);
	star.append(lineFive, false);
	star.append(gem, false);

    }
}
