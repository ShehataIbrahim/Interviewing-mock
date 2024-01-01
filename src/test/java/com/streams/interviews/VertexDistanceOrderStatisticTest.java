package com.streams.interviews;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class VertexDistanceOrderStatisticTest {

    @Test
    void calculateKDistance() {
        List<Point> pointList=new ArrayList<>();
        Point vertex=new Point(5,5);
        pointList.add(new Point(4,4));
        pointList.add(new Point(4,5));
        pointList.add(new Point(5,4));
        pointList.add(new Point(6,1));
        pointList.add(new Point(7,3));
        pointList.add(new Point(5,4));
        pointList.add(new Point(3,1));
        pointList.add(new Point(3,0));
        pointList.add(new Point(7,2));

        List<Point> result = new VertexDistanceOrderStatistic().calculateKDistance(pointList, vertex,3);
        System.out.println(result);
    }
}