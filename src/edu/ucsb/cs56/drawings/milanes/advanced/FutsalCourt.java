package edu.ucsb.cs56.drawings.milanes.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Arc2D;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A Futsal Court
      
   @author Arturo Milanes 
   @version for CS56, F16, UCSB
   
*/
public class FutsalCourt extends Court implements Shape
{
    /**
     * Constructor for objects of class FutsalCourt
@param x initial x position
@param y initial y position
@param width width of court
@param length length of court
     */
    public FutsalCourt(double x, double y, double width, double length)
    {
	// construct the basic field shell
	super(x,y,width,length);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

	//make soccer field with Areas, halfmoons(arcs), penalty dots, and a center circle with center dot

	//CIRCLES

	double diameterC = length*.01;
	double diameter = length*.1;
	double radius = diameter/2.0;
	
	Ellipse2D.Double centerCircle =
	    new Ellipse2D.Double(x+width*.425, y + length*.45, diameter, diameter);
	
	Ellipse2D.Double center=
	    new Ellipse2D.Double(x+width*.4925, y + length*.495, diameterC, diameterC);

	Ellipse2D.Double penaltyA=  new Ellipse2D.Double(x+width*.4925, y + length*.10, diameterC, diameterC);
	
	Ellipse2D.Double penaltyB=  new Ellipse2D.Double(x+width*.4925, y + length*.90, diameterC, diameterC);
	Ellipse2D.Double penalty2A=  new Ellipse2D.Double(x+width*.4925, y + length*.20, diameterC, diameterC);
	Ellipse2D.Double penalty2B=  new Ellipse2D.Double(x+width*.4925, y + length*.80, diameterC, diameterC);
		
       	//AREAS
	//Use Arcs for Areas
       
	double diameterArea = width*.5;
	
	Arc2D.Double halfMoonA =
	    new Arc2D.Double (x+width*.25, y-length*.095, diameterArea, length*.2, 0,-180, Arc2D.OPEN);

	Arc2D.Double halfMoonB =
	    new Arc2D.Double (x+width*.25, y+length*.905, diameterArea,length*.1925 , 0, 180, Arc2D.OPEN);

	
	//Arc2D.Double halfMoonA =
	//  new Arc2D.Double (x+width*.425, y + length*.13, diameter, radius, 0,-180, Arc2D.OPEN);
	//Arc2D.Double halfMoonB =
	//  new Arc2D.Double (x+width*.425, y+length*.82, diameter, radius, 0, 180, Arc2D.OPEN);


	
	//create the full field adding everything together
        GeneralPath fullCourt = this.get();
       	fullCourt.append(centerCircle, false);
	fullCourt.append(halfMoonA, false);
	fullCourt.append(halfMoonB, false);
	fullCourt.append(center, false);
	fullCourt.append(penaltyA, false);
	fullCourt.append(penaltyB, false);
	fullCourt.append(penalty2A, false);
	fullCourt.append(penalty2B, false);
    }    
}
