package com.streams.interviews.meeting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MeetingHourOptimization {

    public Set<Meeting> optimizeMeetings(List<Meeting> meetings, int haveHours) {
        meetings.sort(Comparator.comparingInt(Meeting::getHours));
        List<Map.Entry<Integer, Set<Meeting>>> resultList = new ArrayList<>();
        for (int i = 0; i < meetings.size(); i++) {
            Map.Entry<Integer, Set<Meeting>> calculated = calculateProbabilities(meetings, i, haveHours);
            if (calculated.getKey() == 0)
                break;
            if (calculated.getKey() == haveHours)
                return calculated.getValue();
            resultList.add(calculated);
        }
        resultList.sort(Comparator.comparingInt(Map.Entry::getKey));
        return resultList.get(resultList.size() - 1).getValue();
    }

    private Map.Entry<Integer, Set<Meeting>> calculateProbabilities(List<Meeting> meetings, int startIndex, int haveHours) {
        Set<Meeting> calculated = new HashSet<>();
        int sum = 0;
        int i = startIndex;
        int j = startIndex;
        while (sum <= haveHours && (i < meetings.size() || j >= 0)) {
            if (i < meetings.size() && (meetings.get(i).getHours() + sum) <= haveHours) {
                if (calculated.add(meetings.get(i)))
                    sum += meetings.get(i).getHours();

            }
            if (j >= 0 && (meetings.get(j).getHours() + sum) <= haveHours) {
                if (calculated.add(meetings.get(j)))
                    sum += meetings.get(j).getHours();
            }
            j--;
            i++;
        }
        return Map.entry(sum, calculated);

    }
}
