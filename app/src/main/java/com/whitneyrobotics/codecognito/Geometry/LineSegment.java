package com.whitneyrobotics.codecognito.Geometry;

import com.whitneyrobotics.codecognito.Geometry.Pose.Point2D;

public class LineSegment implements FollowerSegment, GeometryItem{

    private Point2D anchorOne;
    private Point2D anchorTwo;

    public LineSegment(Point2D anchorOne, Point2D anchorTwo){
        this.anchorOne = anchorOne;
        this.anchorTwo = anchorTwo;
    }

    public double getLength(){
        return anchorOne.distanceFormula(anchorTwo);
    }

    public double getSlope(){
        return (anchorTwo.getY() - anchorOne.getY())/(anchorTwo.getX() - anchorOne.getX());
    }

    private double getB(){
        return anchorOne.y - getSlope() * anchorOne.x;
    }

    @Override
    public Point2D getNextIntersection(GeometryItem geometry) {

        return null;
    }

    @Override
    public double getCompletion(Point2D currentPoint, boolean backwards) {
        //Find reciprocal of slope
        double perpSlope = -Math.pow(getSlope(),-1);
        double b =  currentPoint.getY() - (perpSlope * currentPoint.getX());
        double interceptX = (b - getB())/(getSlope() - perpSlope);
        double interceptY = (perpSlope * interceptX) + b;
        Point2D intersection = new Point2D(interceptX, interceptY);

        if(!backwards){
            return anchorOne.distanceFormula(intersection)/getLength();
        }
        return anchorTwo.distanceFormula(intersection)/getLength();
    }
}
