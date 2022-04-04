package com.whitneyrobotics.codecognito.Geometry;

/**
 * DistanceUnit is a enum for managing distance conversions between different units of positional measurement.
 * */
public enum DistanceUnit {
    INCH(1),
    FEET(1/12),
    YARDS(1/36),
    MM(25.4),
    CM(2.54),
    M(0.0254);

    /**
     * How many inches are in the specified unit
     * */
    private double proportionToInch;

    /***
     * Returns the number of inches in the specified unit
     * @return The number of inches in the specified unit
     */
    public double getProportionToInch(){return proportionToInch;}

    DistanceUnit(double p){
        proportionToInch = p;
    }

    /**
     * Converts from one DistanceUnit to another
     * @param num Number of the aformentioned distance unit
     * @param d Target DistanceUnit to convert to
     * @return Number scaled up by the conversion
     * @see Test#method()
     * */
    public double convertTo(double num, DistanceUnit d){
        return num * (d.getProportionToInch()/this.proportionToInch);
    }
}
