package com.whitneyrobotics.codecognito.Geometry;

import com.whitneyrobotics.codecognito.Geometry.Pose.Point2D;

public class Test {
    public static void main(String[] args){
        System.out.println(   DistanceUnit.INCH.convertTo(10,DistanceUnit.MM)   );

        Point2D anchorOne = new Point2D(3,3);
        Point2D anchorTwo = new Point2D(120,123);
        LineSegment line = new LineSegment(anchorOne,anchorTwo);
        System.out.println(findCompletionLevel(line));
    }

    public static double findCompletionLevel(FollowerSegment s){
        return s.getCompletion(new Point2D(6,9), false);
    }
}
