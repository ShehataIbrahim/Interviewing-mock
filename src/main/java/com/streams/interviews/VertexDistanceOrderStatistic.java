package com.streams.interviews;

import java.util.List;
import java.util.PriorityQueue;

public class VertexDistanceOrderStatistic {
    public List<Point> calculateKDistance(List<Point> pointList,Point vertex,int k)
    {
        PriorityQueue<Point> queue=new PriorityQueue<>(pointList.size(),(p1,p2)-> Math.abs((int)(p1.distanceToVertex(vertex)-p2.distanceToVertex(vertex))));
        queue.addAll(pointList);
        return queue.stream().limit(k).toList();
    }
}
