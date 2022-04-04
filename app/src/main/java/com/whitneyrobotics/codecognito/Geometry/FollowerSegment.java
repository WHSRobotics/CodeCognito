package com.whitneyrobotics.codecognito.Geometry;

import com.whitneyrobotics.codecognito.Geometry.Pose.Point2D;

public interface FollowerSegment {

    public Point2D getNextIntersection(GeometryItem geometry);

    public double getCompletion(Point2D currentPoint, boolean backwards);

}
