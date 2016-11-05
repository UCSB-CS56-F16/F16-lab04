package edu.ucsb.cs56.drawings.xuewenli.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

/**
 A Birthday Cake

 @author Xuewen Sherry Li
 @version for CS56, F16, UCSB

 */
public class BirthdayCake extends Cake implements Shape{
    /**
     * Constructor for objects of class BirthdayCake
     */
    public BirthdayCake(double x, double y, double width, double height)
    {
        // construct the basic cake
        super(x,y,width,height);

        // Make 3 candles on top of cake
        GeneralPath candle1 = new GeneralPath();
        GeneralPath candle2 = new GeneralPath();
        GeneralPath candle3 = new GeneralPath();

        candle1.moveTo(x + (0.45 * width), y - (0.33 * height));
        candle1.lineTo(x + (0.45 * width), y - (0.33 * height) - 20);

        candle2.moveTo(x + (0.5 * width), y - (0.33 * height));
        candle2.lineTo(x + (0.5 * width), y - (0.33 * height) - 35);

        candle3.moveTo(x + (0.55 * width), y - (0.33 * height));
        candle3.lineTo(x + (0.55 * width), y - (0.33 * height) - 20);

        // get the GeneralPath that we are going to append stuff to
        GeneralPath gp = this.get();
        gp.append(candle1, false);
        gp.append(candle2, false);
        gp.append(candle3, false);

    }

}
