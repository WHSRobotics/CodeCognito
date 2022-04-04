package com.whitneyrobotics.codecognito.Geometry.Pose;

public class Pose2D extends Point2D {
    private double heading;

    public static double normalizeHeading(double heading){
        while (heading < 0 || heading > 360){
            if(heading > 360) heading -= 360;
            if(heading < 360) heading += 360;
        }
        return heading;
    }

    public void setHeading(double heading) {
        this.heading = heading;
    }

    public double getHeading(){
        return heading;
    }

    public Pose2D(double x, double y, double heading) {
        super(x, y);
        this.heading = heading;
    }
}
