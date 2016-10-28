package edu.ucsb.cs56.drawings.colinmai.advanced;
import edu.ucsb.cs56.drawings.colinmai.simple.Circle;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

public class SunWithFace extends Sun implements Shape {

    public SunWithFace(double x, double y, double width, double height){
        super(x,y,width,height);

        GeneralPath gp = this.get();

        final double sun_radius = height/2;

        Circle eye_one =
                new Circle
                        (
                                x+(sun_radius/2.3),
                                y-(sun_radius/2.3),
                                (sun_radius/10)
                        );
        Circle eye_two =
                new Circle
                        (
                                x-(sun_radius/2.3),
                                y-(sun_radius/2.3),
                                (sun_radius/10)
                        );

      GeneralPath mouth = new GeneralPath();
       mouth.moveTo(x-(sun_radius*0.3),y+(sun_radius*0.3));
        mouth.lineTo(x+(sun_radius*0.3),y+(sun_radius*0.3));

        GeneralPath wholesun = this.get();
        wholesun.append (eye_one,false);
        wholesun.append (eye_two,false);
        wholesun.append (mouth,false);
    }



}
