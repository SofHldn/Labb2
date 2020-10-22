package com.example.hikingtrails;

public abstract class HikingTrail{

    private String nameOfHike;
    private String areaOfHike;
    private int lengthOfHike;
    private int numberOfNightStops;
    private boolean favorite;
    private String fav;

    public HikingTrail(String nameOfHike, String areaOfHike, int lengthOfHike, int numberOfNightStops, boolean favorite) {

        this.nameOfHike = nameOfHike;
        this.areaOfHike = areaOfHike;
        this.lengthOfHike = lengthOfHike;
        this.numberOfNightStops = numberOfNightStops;
        this.favorite = favorite;

        if (favorite == true) {
            fav = "yes";
        } else {
            fav = "no";
        }
    }

    public HikingTrail() {
    }

    public String getNameOfHike() {
        return nameOfHike;
    }

    public void setNameOfHike(String nameOfHike) {
        this.nameOfHike = nameOfHike;
    }

    public String getAreaOfHike() {
        return areaOfHike;
    }

    public void setAreaOfHike(String areaOfHike) {
        this.areaOfHike = areaOfHike;
    }

    public int getLengthOfHike() {
        return lengthOfHike;
    }

    public void setLengthOfHike(int lengthOfHike) {
        this.lengthOfHike = lengthOfHike;
    }

    public int getNumberOfNightStops() {
        return numberOfNightStops;
    }

    public void setNumberOfNightStops(int numberOfNightStops) {
        this.numberOfNightStops = numberOfNightStops;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    @Override
    public String toString() {
        return "Name:" + nameOfHike + ", Area: " + areaOfHike + ", Length: " + lengthOfHike +
                ", Night stops:" + numberOfNightStops + " Favourite: " + fav;

    }



}
