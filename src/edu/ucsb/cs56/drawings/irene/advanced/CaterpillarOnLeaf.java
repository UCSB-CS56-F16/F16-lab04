package edu.ucsb.cs56.drawings.irene.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Ellipse2D;


import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;


/**
    A CaterpillarOnLeaf class("is-a" Leaf, implements Shape)

    The caterpillar object in this class is going to be made of 4 ellipses. It is then positioned onto a leaf
    that is implemented by its base class, Leaf.
 
    @author Irene Pattarachanyakul
    @version for CS56, F16, UCSB

*/
public class CaterpillarOnLeaf extends Leaf implements Shape
{
    /** 
    * Constructor for objects of class CaterpillarOnLeaf 
    */
    public CaterpillarOnLeaf(double x, double y, double width, double height)
    {
        super(x,y,width,height);
        
        final double bodyRadius = width/4;
        final double caterpillarHeadX = x;
        final double caterpillarHeadY = y;
        final double caterpillarBodyY = caterpillarHeadY-bodyRadius;
    
        Ellipse2D.Double caterpillarHeadCircle = new Ellipse2D.Double(caterpillarHeadX-bodyRadius, (caterpillarHeadY-bodyRadius*2 -bodyRadius)-bodyRadius, bodyRadius*2,bodyRadius*2);
        
        Ellipse2D.Double caterpillarBody1Circle = new Ellipse2D.Double(caterpillarHeadX-bodyRadius, caterpillarBodyY-bodyRadius,bodyRadius*2, bodyRadius*2);
        
        Ellipse2D.Double caterpillarBody2Circle = new Ellipse2D.Double(caterpillarHeadX + (2*bodyRadius) - bodyRadius, caterpillarBodyY-bodyRadius, bodyRadius*2, bodyRadius*2);
        
        Ellipse2D.Double caterpillarBody3Circle = new Ellipse2D.Double(caterpillarHeadX + (4*bodyRadius) - bodyRadius, caterpillarBodyY - bodyRadius, bodyRadius*2, bodyRadius*2);
        
        GeneralPath wholeCaterpillar = this.get();
        wholeCaterpillar.append(caterpillarHeadCircle, false);
        wholeCaterpillar.append(caterpillarBody1Circle, false);
        wholeCaterpillar.append(caterpillarBody2Circle, false);
        wholeCaterpillar.append(caterpillarBody3Circle, false);
        
    }

}