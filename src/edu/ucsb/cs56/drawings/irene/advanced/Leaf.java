package edu.ucsb.cs56.drawings.irene.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 
 */
public class Leaf extends GeneralPathWrapper implements Shape
{
    public Leaf(double x, double y, double width, double height)
    {
        
        
        final double OGLX = 0;
        final double OGLY = 0;
        
        final double OGheight = 10.0;
        final double OGwidth = 10.0;
        
        GeneralPath wholeLeaf = new GeneralPath();
        
        wholeLeaf.moveTo(-0.75*width,-0.5*width);
        wholeLeaf.quadTo( -0.75*width, -width, 0.5*width, -2.5*width);
        
        wholeLeaf.moveTo(-0.75*width,-0.5*width);
        wholeLeaf.quadTo( -0.75*width, 0, 0.5*width, 2*width);
        
        wholeLeaf.moveTo(1.75*width,-0.5*width);
        wholeLeaf.quadTo(1.75*width, -width, 0.5*width, -2.5*width);
        
        wholeLeaf.moveTo(1.75*width,-0.5*width);
        wholeLeaf.quadTo(1.75*width, 0, 0.5*width, 2*width);
        
        wholeLeaf.moveTo(0.5*width, -2.5*width);
        wholeLeaf.lineTo(0.5*width, -3.1*width);
        
        Shape s = ShapeTransforms.translatedCopyOf(wholeLeaf, -OGLX + x, -OGLY + y);
        
        this.set(new GeneralPath(s));
        
        
    }



}