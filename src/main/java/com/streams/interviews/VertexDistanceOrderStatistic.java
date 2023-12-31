package com.streams.interviews;

import java.util.List;
import java.util.PriorityQueue;

public class VertexDistanceOrderStatistic {
    public List<Point> calculateKDistance(List<Point> pointList,int k)
    {
        PriorityQueue<Point> queue=new PriorityQueue<>(pointList.size(),(p1,p2)-> (int)(p1.distanceToVertex()-p2.distanceToVertex()));
        queue.addAll(pointList);
        return queue.stream().limit(k).toList();
    }
}
