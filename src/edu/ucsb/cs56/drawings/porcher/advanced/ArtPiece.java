package edu.ucsb.cs56.drawings.porcher.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

/**
   A House
      
   @author Devon Porcher
   @version for CS56, W16, UCSB
   
*/
public class ArtPiece extends ArtFrame implements Shape
{
    /**
     * Constructor for objects of class CoffeeCup
     */
    public ArtPiece(double x, double y, double width, double height)
    {
	// construct the basic house shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
    double WidthOut = width* 6/9;
    double HeightOut = height* 6/9;
	double WidthDiffOut = (width - WidthOut)/2;
	double HeightDiffOut = (height - HeightOut)/2;
    
	double WidthMid = width* 4/9;
    double HeightMid = height* 4/9;
	double WidthDiffMid = (width - WidthMid)/2;
	double HeightDiffMid = (height - HeightMid)/2;
	
	
    double WidthIn = width* 2/9;
    double HeightIn = height* 2/9;
	double WidthDiffIn = (width - WidthIn)/2;
	double HeightDiffIn = (height - HeightIn)/2;
	
	Ellipse2D.Double COut = 
            new Ellipse2D.Double(x + WidthDiffOut, y + HeightDiffOut ,
				   WidthOut, HeightOut);
				   
	Ellipse2D.Double CMid = 
            new Ellipse2D.Double(x + WidthDiffMid, y + HeightDiffMid ,
				   WidthMid, HeightMid);
				   
	Ellipse2D.Double CIn = 
            new Ellipse2D.Double(x + WidthDiffIn, y + HeightDiffIn ,
				   WidthIn, HeightIn);
	
        GeneralPath wholePiece = this.get();
        wholePiece.append(COut, false);
        wholePiece.append(CMid, false);
        wholePiece.append(CIn, false); 
    }    
}
