package com.whitneyrobotics.codecognito.Geometry.Pose;

import android.graphics.Point;

import com.whitneyrobotics.codecognito.Geometry.DistanceUnit;

public class Point2D {
    public double x;
    public double y;
    private DistanceUnit unit = DistanceUnit.INCH;

    public Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setDistanceUnit(DistanceUnit d){
        unit = d;
    }

    public DistanceUnit getDistanceUnit(){
        return unit;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getX(DistanceUnit conversion){
        return unit.convertTo(x,conversion);
    }

    public double getY(DistanceUnit conversion){
        return unit.convertTo(y,conversion);
    }

    public double distanceFormula(Point2D point2){
        return Math.sqrt(Math.pow(x + point2.x, 2) + Math.pow(y + point2.y,2));
    }
}
