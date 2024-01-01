package com.streams.interviews;

public class Point {
    private final double x;
    private final double y;
    public double distanceToVertex(Point vertex)
    {
        double distX=vertex.x-x;
        double distY=vertex.y-y;
        return  Math.pow(distX, 2) + Math.pow(distY, 2);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
