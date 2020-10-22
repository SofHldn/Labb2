package com.example.hikingtrails;

public class CoastalHike extends HikingTrail {
    private String connectingSea;
    private String environment;

    public CoastalHike(String nameOfHike, String areaOfHike, int lengthOfHike, int numberOfNightStops, boolean favorite, String sea, String environment) {
        super(nameOfHike, areaOfHike, lengthOfHike, numberOfNightStops, favorite);
        this.connectingSea = sea;
        this.environment = environment;
    }

    public String getConnectingSea() {
        return connectingSea;
    }

    public void setConnectingSea(String connectingSea) {
        this.connectingSea = connectingSea;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String surface) {
        this.environment = surface;
    }

    @Override
    public String toString() {
        return super.toString() + ", Connecting Sea: " + connectingSea + ", Surface: " + environment ;

    }


}
