package com.streams.interviews;

public class Point {
    private double x;
    private double y;
    private double distance;
    private Point vertex;

    public Point(double x, double y, Point vertex) {
        this.x = x;
        this.y = y;
        distance = Math.pow(x, 2) + Math.pow(y, 2);
        this.vertex=vertex;

    }
    public double distanceToVertex()
    {
        return vertex.getDistance()-distance;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        distance = Math.pow(x, 2) + Math.pow(y, 2);
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", distance=" + distanceToVertex() +
                '}';
    }
}
