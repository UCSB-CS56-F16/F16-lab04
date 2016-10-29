package edu.ucsb.cs56.drawings.qwertyuiop5040.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A triangular flag with a flag pole that the user can specify the x,y as well as the width and height of the flag. 
   The user can optionally specify the ratio of width and height between the flag pole and the flag itself. For example a
   ratio of 3 for flag pole height to the flag means the flag pole is 3 times as long as the flag itself. 
   @author Hanqing Wang 
   @version for CS56, F16, UCSB
    
*/
public class TriangularFlag extends GeneralPathWrapper implements Shape
{	
	/**
	*Default ratio of flag pole width to flag width.
	*/
	public static final double DEFAULT_WIDTH_RATIO=0.03;
	/**
	*Default ratio of flag pole height to flag height.
	*/
	public static final double DEFAULT_HEIGHT_RATIO=1.5; 

	private double flagWidth;
	private double flagHeight;
	private double flagStartX;
	private double flagStartY;
	/**
        Constructor will draw a triangular flag and will supply default values for ratios between the dimensions of the flag pole
	to the flag. The triangular flag consists of a rectangle for the flag pole and two sloping lines for the triangle.
        @param x x coord of top left corner of flag
        @param y y coord of top left corner of flag
        @param width of the flag
        @param height of flag
    	*/
	public  TriangularFlag(double x,double y, double width, double height){
		this(x,y,width,height,DEFAULT_WIDTH_RATIO, DEFAULT_HEIGHT_RATIO);
	}
    /**
       Constructor will draw a triangular flag consisting of a rectangle for the flag pole and two sloping lines for the triangle
       @param x x coord of top left corner of flag
       @param y y coord of top left corner of flag
       @param width of the flag (including the flag pole, if there is one)
       @param height of flag (including the flag pole, if there is one)
	@param hasFlagPole determines whether flag will be drawn with a flagpole
	@param flagPoleHeightRatio ratio of the height of the flag pole to the height of the flag, cannot be negative
    */
    public TriangularFlag(double x, double y, double width, double height, double flagPoleWidthRatio,double flagPoleHeightRatio)
    {
	flagWidth=width;
	flagHeight=height;
	flagStartY=y;
	flagStartX=x;
	Rectangle2D.Double pole=null;
		flagWidth=width*(1.0)/(1.0+flagPoleWidthRatio);
		flagHeight=height*(1.0)/(1.0+flagPoleHeightRatio);
		flagStartX+=width*(flagPoleWidthRatio)/(1.0+flagPoleWidthRatio);
		pole= new Rectangle2D.Double(x,y, width-flagWidth, height);
	Line2D.Double flagUpperBoundary=
	    new Line2D.Double(flagStartX, flagStartY, flagStartX+flagWidth, flagStartY+flagHeight/2.0);
	Line2D.Double flagLowerBoundary=
	    new Line2D.Double(flagStartX, flagStartY+flagHeight, flagStartX+flagWidth,flagStartY+flagHeight/2.0);
         Line2D.Double flagLeftBoundary=
	    new Line2D.Double(flagStartX, flagStartY, flagStartX, flagStartY+flagHeight);
	GeneralPath flagPath=this.get();
	flagPath.append(pole,false);
	flagPath.append(flagUpperBoundary,false);
	flagPath.append(flagLowerBoundary,false);
	flagPath.append(flagLeftBoundary,false);
    }
    /**
     @return the width of the flag, not including the flag pole
    */
    protected double getFlagWidth(){return flagWidth;}

    /**
     @return the height of the flag, not including the flag pole
    */
    protected double getFlagHeight(){return flagHeight;}
    /**
     @return starting (horizontal) pixel of the flag (not including flag pole), relative to the whole image
    */
    protected double getFlagStartX(){return flagStartX;}
    /**
     @return start (vertical) pixel of the flag (not including flag pole), relative to the whole image
    */
    protected double getFlagStartY(){return flagStartY;}
}
