package com.example.hikingtrails;

import java.util.Comparator;

public class SortByNightStops implements Comparator<HikingTrail> {


    @Override
    public int compare(HikingTrail o1, HikingTrail o2) {
        return o2.getNumberOfNightStops() - o1.getNumberOfNightStops();
    }
}
