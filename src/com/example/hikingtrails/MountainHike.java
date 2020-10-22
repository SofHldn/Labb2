package com.example.hikingtrails;

public class MountainHike extends HikingTrail {
    private String highestAltitude;
    private String difficultLevel;

    public MountainHike(String nameOfHike, String areaOfHike, int lengthOfHike, int numberOfNightStops, boolean favorite, String highestAltitude, String difficultLevel) {
        super(nameOfHike, areaOfHike, lengthOfHike, numberOfNightStops, favorite);
        this.highestAltitude = highestAltitude;
        this.difficultLevel = difficultLevel;
    }

    public String getHighestAltitude() {
        return highestAltitude;
    }

    public void setHighestAltitude(String highestAltitude) {
        this.highestAltitude = highestAltitude;
    }

    public String getDifficultLevel() {
        return difficultLevel;
    }

    public void setDifficultLevel(String difficultLevel) {
        this.difficultLevel = difficultLevel;
    }

    @Override
    public String toString() {
        return super.toString() + ", Highest Altitude: " + highestAltitude + ", Difficult level: " + difficultLevel;
    }

}

