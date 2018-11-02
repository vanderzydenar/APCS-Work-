import java.lang.*;

public class Cylinder{
    double radius;
    double height;

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double volume(){
        return Math.PI*Math.pow(radius, 2)*height; 
    }

    public double surfaceArea(){
        return (2*Math.PI*Math.pow(radius, 2)) + (2*Math.PI*radius*height);
    }
}
