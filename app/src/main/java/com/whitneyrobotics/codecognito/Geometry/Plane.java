package com.whitneyrobotics.codecognito.Geometry;
//TODO: Add height stuff
public class Plane {
    private double width;
    private double height;
    public DistanceUnit unit = DistanceUnit.INCH;

    public double getWidth(){
        return width;
    }

    public double getWidth(DistanceUnit unit){
        return this.unit.convertTo(width,unit);
    }

    public Plane(double w, double h){
        width = w;
        height = h;
    }



}
