package com.whitneyrobotics.codecognito.Geometry;

import com.whitneyrobotics.codecognito.Geometry.Pose.Point2D;

public class Grid extends Plane {
    private double spacing;
    public Point2D[/* width */][/* height */] nodes;
    /*
    * {
    * {1,2,3},
    * {1,2,3}
    * {1,2,3}
    * }*/

    public Grid(double width, double height, double spacing){
        super(width, height);
        nodes = new Point2D[(int)Math.ceil(width/spacing)+1][(int)Math.ceil(height/spacing)+1];
        for(int i = 0; i<=width; i+=spacing){
            for(int j = 0; j<=height; j+= spacing){
                nodes[(int)Math.floor(width/i)][(int)Math.floor(height/j)] = new Point2D(i,j);
            }
        }

        if(width % spacing != 0){
            for(int i = 0; i<nodes[0].length; i++){
                nodes[i][nodes[0].length-1] = new Point2D(width,height*i);
            }
        }

        if(height % spacing != 0){
            for(int i = 0; i<nodes.length; i++){
                nodes[nodes.length-1][i] = new Point2D(width*i,height);
            }
        }
    }
}
