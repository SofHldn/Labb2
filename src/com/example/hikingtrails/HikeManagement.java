package com.example.hikingtrails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

//CRUD Create Read Update Delete
public class HikeManagement {
    private static ArrayList<HikingTrail> hikes = new ArrayList<>();

    //add
    public static void addHike(HikingTrail ht) {
        hikes.add(ht);
        System.out.println("\nThe hike '" + ht.getNameOfHike() + "' has been added to the list!");
    }

    //showAll
    public static void showAll() {
        for (HikingTrail ht : hikes) {
            System.out.println(ht);
        }
    }

    //showByName
    public static void showByName(String nameOfHike) {
        for (HikingTrail ht : hikes) {
            if (ht.getNameOfHike().equalsIgnoreCase(nameOfHike)) {
                System.out.println(ht);
            }
        }
    }

    //showMountainHikes
    public static void showMountainHikes() {
        for (HikingTrail ht : hikes) {
            if (ht instanceof MountainHike) {
                System.out.println(ht);
            }
        }
    }

    public static void showCoastalHikes() {
        for (HikingTrail ht : hikes) {
            if (ht instanceof CoastalHike) {
                System.out.println(ht);
            }
        }
    }

    //showFavorite
    public static void showFavorites() {
        for (HikingTrail ht : hikes) {
            if (ht.isFavorite() == (true)) {
                System.out.println(ht);
            }
        }
    }

    //checkObject
    public static boolean checkIfMountainTrail(String nameOfHike) {

        for (HikingTrail ht : hikes) {
            if (ht.getNameOfHike().equalsIgnoreCase(nameOfHike)) {
                if (ht instanceof MountainHike) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean checkIfCoastalTrail(String nameOfHike) {

        for (HikingTrail ht : hikes) {
            if (ht.getNameOfHike().equalsIgnoreCase(nameOfHike)) {
                if (ht instanceof CoastalHike) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    //updateByLength
    public static void updateByLength(String nameOfHike, int lengthOfHike) {
        for (HikingTrail ht : hikes) {
            if (ht.getNameOfHike().equalsIgnoreCase(nameOfHike)) {
                ht.setLengthOfHike(lengthOfHike);
            }
        }
        System.out.println("Hike length has been updated!");
    }

    //updateByName
    public static void updateByName(String nameOfHike, String newNameOfHike) {
        for (HikingTrail ht : hikes) {
            if (ht.getNameOfHike().equalsIgnoreCase(nameOfHike)) {
                ht.setNameOfHike(newNameOfHike);
            }
        }
        System.out.println("Hike name has been updated!");
    }

    //updateByArea
    public static void updateByArea(String nameOfHike, String areaOfHike) {
        for (HikingTrail ht : hikes) {
            if (ht.getNameOfHike().equalsIgnoreCase(nameOfHike)) {
                ht.setAreaOfHike(areaOfHike);
            }
        }
        System.out.println("Hike area has been updated!");
    }

    //updateByNumberOfNightStops
    public static void updateByNumberOfNightStops(String nameOfHike, int numberOfNightStops) {
        for (HikingTrail ht : hikes) {
            if (ht.getNameOfHike().equalsIgnoreCase(nameOfHike)) {
                ht.setNumberOfNightStops(numberOfNightStops);
            }
        }
        System.out.println("Number of night stops has been updated!");
    }

    //update favorite
    public static void updateFavorite(String nameOfHike, String fav) {
        for (HikingTrail ht : hikes) {
            if (ht.getNameOfHike().equalsIgnoreCase(nameOfHike)) {
                if (fav.equalsIgnoreCase("yes")) {
                    ht.setFavorite(true);
                } else if (fav.equalsIgnoreCase("no")) {
                    ht.setFavorite(false);
                }
            }
        }
    }

    //update highestAltitude
    public static void updateHighestAltitude(String nameOfHike, String newAltitude) {
        for (HikingTrail ht : hikes) {
            if (ht.getNameOfHike().equalsIgnoreCase(nameOfHike)) {
                if (ht instanceof MountainHike) {
                    ((MountainHike) ht).setHighestAltitude(newAltitude);
                }
            }
        }
    }

    //update difficultLevel
    public static void updateDifficultLevel(String nameOfHike, String newDifficultLevel) {
        for (HikingTrail ht : hikes) {
            if (ht.getNameOfHike().equalsIgnoreCase(nameOfHike)) {
                if (ht instanceof MountainHike) {
                    ((MountainHike) ht).setDifficultLevel(newDifficultLevel);
                }
            }
        }
    }

    //update environment
    public static void updateEnvironment(String nameOfHike, String newEnvironment) {
        for (HikingTrail ht : hikes) {
            if (ht.getNameOfHike().equalsIgnoreCase(nameOfHike)) {
                if (ht instanceof CoastalHike) {
                    ((CoastalHike) ht).setEnvironment(newEnvironment);
                }
            }
        }
    }

    //remove
    public static void removeHike(String nameOfHike) {
        for (int i = hikes.size() - 1; i >= 0; i--) {
            if (hikes.get(i).getNameOfHike().equalsIgnoreCase(nameOfHike)) {
                hikes.remove(i);
            }
        }
    }

    //sortByName
    public static void sortByName() {

        // Comparator<HikingTrail> sortByName = (o1, o2) -> o1.getNameOfHike().compareTo(o2.getNameOfHike());

        hikes.sort((o1, o2) -> o1.getNameOfHike().compareTo(o2.getNameOfHike()));
        for (HikingTrail ht : hikes) {
            System.out.println(ht);
        }
    }

    //sortByArea
    public static void sortByArea() {

        Comparator<HikingTrail> sortByArea = new Comparator<HikingTrail>() {
            @Override
            public int compare(HikingTrail o1, HikingTrail o2) {
                return o1.getAreaOfHike().compareTo(o2.getAreaOfHike());
            }
        };

        hikes.sort(sortByArea);
        for (HikingTrail ht : hikes) {
            System.out.println(ht);
        }
    }

    //sortByNightStops
    public static void sortByNightStops() {
        SortByNightStops sortByNightStops = new SortByNightStops();
        hikes.sort(sortByNightStops);
        for (HikingTrail ht : hikes) {
            System.out.println(ht);
        }
    }

    //sortByLength
    public static void sortByLength() {
        hikes.sort((ht1, ht2) -> ht2.getLengthOfHike() - ht1.getLengthOfHike());
        for (HikingTrail ht : hikes) {
            System.out.println(ht);
        }

    }

    public static void sortByLength2() {
        hikes.sort((ht1, ht2) -> ((Integer) ht2.getLengthOfHike()).compareTo((Integer) ht1.getLengthOfHike()));
        for (HikingTrail ht : hikes) {
            System.out.println(ht);
        }
    }


}
