package edu.ucsb.cs56.drawings.arthursilverstein.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Line2D;

/**
   A House
      
   @author Phill Conrad 
   @version for CS56, W16, UCSB
   
*/
public class WindowsLaptop extends Laptop implements Shape
{
    /**
     * Constructor for objects of class CoffeeCup
     */
    public WindowsLaptop(double x, double y, double width, double height)
    {
	// construct the basic house shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// these values are here as reminder, mostly
	double bottomEdgeLength = 0.75 * width; //since its 3D
 	double perspectiveWidth = 0.25 * width;
 	double perspectiveHeight = 0.25 * height;
 	double screenEdgeLength = 0.75 * height;

	double horizScreenMid = x + (0.875 * width);
	double vertScreenMid = y - (0.365 * height) - (0.5 * perspectiveHeight);
	double paneWidth = 0.0625 * width;
	double paneHeight = 0.1875 * height;

	//Add vertical lines
	Line2D.Double leftLogoEdge = new Line2D.Double(
                horizScreenMid-paneWidth, vertScreenMid+paneHeight+(0.25 * perspectiveHeight), 
		horizScreenMid-paneWidth, vertScreenMid-paneHeight+(0.25 * perspectiveHeight));
	Line2D.Double rightLogoEdge = new Line2D.Double(
		horizScreenMid+paneWidth, vertScreenMid+paneHeight-(0.25 * perspectiveHeight),
		horizScreenMid+paneWidth, vertScreenMid-paneHeight-(0.25 * perspectiveHeight));
	Line2D.Double midLogoVertBar = new Line2D.Double(
		horizScreenMid, vertScreenMid+paneHeight,
		horizScreenMid, vertScreenMid-paneHeight);

	//Add horizontal lines
	Line2D.Double botLogoEdge = new Line2D.Double(
		horizScreenMid-paneWidth, vertScreenMid+paneHeight+(0.25 * perspectiveHeight),
		horizScreenMid+paneWidth, vertScreenMid+paneHeight-(0.25 * perspectiveHeight));
	Line2D.Double topLogoEdge = new Line2D.Double(
		horizScreenMid-paneWidth, vertScreenMid-paneHeight+(0.25 * perspectiveHeight),
		horizScreenMid+paneWidth, vertScreenMid-paneHeight-(0.25 * perspectiveHeight));
	Line2D.Double midLogoHorizBar = new Line2D.Double(
		horizScreenMid-paneWidth, vertScreenMid+(0.25 * perspectiveHeight),
		horizScreenMid+paneWidth, vertScreenMid-(0.25 * perspectiveHeight));

	// add the logo to the laptop 
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholeLaptop = this.get();
        wholeLaptop.append(leftLogoEdge, false);
        wholeLaptop.append(rightLogoEdge, false);
        wholeLaptop.append(midLogoVertBar, false);
        wholeLaptop.append(botLogoEdge, false);
        wholeLaptop.append(topLogoEdge, false);
        wholeLaptop.append(midLogoHorizBar, false);
    }    
}
