package com.streams.interviews;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VertexDistanceOrderStatisticTest {

    @Test
    void calculateKDistance() {
        List<Point> pointList=new ArrayList<>();
        Point vertex=new Point(14,10);
        pointList.add(new Point(12.12,12,vertex));
        pointList.add(new Point(10,5,vertex));
        pointList.add(new Point(13,2,vertex));
        pointList.add(new Point(14,10,vertex));
        pointList.add(new Point(12,11,vertex));
        pointList.add(new Point(11,13,vertex));
        pointList.add(new Point(16,9,vertex));
        pointList.add(new Point(9,7,vertex));
        pointList.add(new Point(-1,-2,vertex));

        List<Point> result = new VertexDistanceOrderStatistic().calculateKDistance(pointList, 6);
        System.out.println(result);
    }
}