package com.streams.interviews;

import com.streams.interviews.meeting.Meeting;
import com.streams.interviews.meeting.MeetingHourOptimization;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MeetingHourOptimizationTest {

    @Test
    void optimizeMeetings() {
        List<Meeting> meetings = new ArrayList<>();
        meetings.add(new Meeting("Meeting 8", 8));
        meetings.add(new Meeting("Meeting 5", 5));
        meetings.add(new Meeting("Meeting 4", 4));
        meetings.add(new Meeting("Meeting 3", 3));
        meetings.add(new Meeting("Meeting 2", 2));

        MeetingHourOptimization optimizer = new MeetingHourOptimization();
        assertEquals(9, optimizer.optimizeMeetings(meetings, 9).stream().map(Meeting::getHours).reduce(0, Integer::sum));
        assertEquals(7, optimizer.optimizeMeetings(meetings, 7).stream().map(Meeting::getHours).reduce(0, Integer::sum));
        assertEquals(5, optimizer.optimizeMeetings(meetings, 5).stream().map(Meeting::getHours).reduce(0, Integer::sum));
        assertEquals(16, optimizer.optimizeMeetings(meetings, 16).stream().map(Meeting::getHours).reduce(0, Integer::sum));
        meetings = new ArrayList<>();
        meetings.add(new Meeting("Meeting 5", 5));
        meetings.add(new Meeting("Meeting 3", 3));
        meetings.add(new Meeting("Meeting 2", 2));
        assertEquals(8, optimizer.optimizeMeetings(meetings, 8).stream().map(Meeting::getHours).reduce(0, Integer::sum));
    }
}