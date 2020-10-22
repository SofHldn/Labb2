package com.example.hikingtrails;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

import static com.example.hikingtrails.HikeManagement.*;

public class MyMain {
    static boolean loop = true;
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        fillArray();
        while (loop) {
            menu();
        }
    }

    private static void fillArray() {
        HikingTrail ht1 = new CoastalHike("Höga Kusten Trail", "Höga Kusten", 130, 13, true, "Östersjön", "forest & rock");
        HikeManagement.addHike(ht1);
        HikingTrail ht2 = new MountainHike("Jämtlandstriangeln", "Jämtland", 47, 2, false, "1086", "Medium");
        HikeManagement.addHike(ht2);
        HikingTrail ht3 = new MountainHike("Keb west top tour", "Lappland", 18, 0, true, "2106", "Hard");
        HikeManagement.addHike(ht3);
        HikingTrail ht4 = new CoastalHike("Roslagsleden", "Roslagen", 190, 10, false, "Östersjön", "rock/forest");
        HikeManagement.addHike(ht4);
        HikingTrail ht5 = new MountainHike("Abisko round tour", "Nikkaloukta", 35, 1, true, "573", "Easy");
        HikeManagement.addHike(ht5);


    }

    public static void menu() {

        System.out.println("\n*****Menu*****");
        System.out.println("1. Add new hike");
        System.out.println("2. Remove hike");
        System.out.println("3. Update Mountain hike");
        System.out.println("4. Update Coastal hike");
        System.out.println("5. Show all hikes");
        System.out.println("6. Show hike by name");
        System.out.println("7. Show Mountain hikes");
        System.out.println("8. Show Coastal hikes");
        System.out.println("9. Show favorite hikes");
        System.out.println("10. Sort list of hikes");
        System.out.println("0.Quit");

        System.out.print("\nMake your choice: ");
        int userChoice = sc.nextInt();
        sc.nextLine();

        switch (userChoice) {
            case 0:
                loop = false;
                break;
            case 1:
                addHike();
                break;
            case 2:
                removeHike();
                break;
            case 3:
                updateMountainHike();
                break;
            case 4:
                updateCoastalHike();
                break;
            case 5:
                showAllHikes();
                break;
            case 6:
                showHikeByName();
                break;
            case 7:
                showMountainHikes();
                break;
            case 8:
                showCoastalHikes();
                break;
            case 9:
                showFavoriteHikes();
                break;
            case 10:
                sort();
                break;
            default:
                System.out.println("please enter a number between 0 and 8");

        }

        if (loop == false) {

        } else {
            System.out.print("\nPress enter for menu");
            sc.nextLine();
        }
    }

    private static void sort(){
        System.out.println("How would you like to view your list? (1-4) ");
        System.out.println("\n1. Sorted by name");
        System.out.println("2. Sorted by area");
        System.out.println("3. Sorted by length");
        System.out.println("4. Sorted by number of night stops");

        int sortChoice = sc.nextInt();
        sc.nextLine();

        switch (sortChoice){
            case 1:
                HikeManagement.sortByName();
                break;
            case 2:
                HikeManagement.sortByArea();
                break;
            case 3:
                HikeManagement.sortByLength();
                break;
            case 4:
                HikeManagement.sortByNightStops();
                break;
            default:
                System.out.println("Wrong entry");
        }

    }


    private static void showFavoriteHikes() {
        HikeManagement.showFavorites();
    }

    private static void showHikeByName() {
        System.out.print("Name of hike: ");
        String nameOfHike = sc.nextLine();
        HikeManagement.showByName(nameOfHike);
    }

    private static void showAllHikes() {
        HikeManagement.showAll();
    }

    private static void updateMountainHike() {
        System.out.print("Enter name of hike to be updated: ");
        String nameOfHike = sc.nextLine();

        if (checkIfMountainTrail(nameOfHike) == true) {

            System.out.println("What would you like to update? : (1-7)");
            System.out.println("1. Name of hike");
            System.out.println("2. Area of hike");
            System.out.println("3. Length of hike");
            System.out.println("4. Number of night stops");
            System.out.println("5. Favorite");
            System.out.println("6. HighestAltitude");
            System.out.println("7. DifficultLevel");
            System.out.println("0. Go back");

            int updateChoice = sc.nextInt();
            sc.nextLine();

            switch (updateChoice) {
                case 0:
                    break;
                case 1:
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    HikeManagement.updateByName(nameOfHike, newName);
                    break;
                case 2:
                    System.out.print("Enter new Area: ");
                    String newArea = sc.nextLine();
                    HikeManagement.updateByArea(nameOfHike, newArea);
                    break;
                case 3:
                    System.out.print("Enter new length(km): ");
                    int newLength = sc.nextInt();
                    sc.nextLine();
                    HikeManagement.updateByLength(nameOfHike, newLength);
                    break;
                case 4:
                    System.out.print("Enter new number of night stops: ");
                    int newNumberOfNightStops = sc.nextInt();
                    sc.nextLine();
                    HikeManagement.updateByNumberOfNightStops(nameOfHike, newNumberOfNightStops);
                    break;
                case 5:
                    System.out.print("Set as favorite? (yes/no)");
                    String fav = sc.nextLine();
                    HikeManagement.updateFavorite(nameOfHike, fav);
                    break;
                case 6:
                    System.out.print("Enter new highest altitude(m): ");
                    String newHighestAltitude = sc.nextLine();
                    HikeManagement.updateHighestAltitude(nameOfHike, newHighestAltitude);
                    break;
                case 7:
                    System.out.print("Enter new difficultLevel: ");
                    String newDifficultLevel = sc.nextLine();
                    HikeManagement.updateDifficultLevel(nameOfHike, newDifficultLevel);
                    break;
                default:
                    System.out.println("No such option");
            }
        } else {
            System.out.println("This is not a Mountain trail");
        }
    }

    private static void updateCoastalHike() {
        System.out.print("Enter name of hike to be updated: ");
        String nameOfHike = sc.nextLine();

        if (HikeManagement.checkIfCoastalTrail(nameOfHike) == true) {
            System.out.println("What would you like to update? : (1-7)");
            System.out.println("1. Name of hike");
            System.out.println("2. Area of hike");
            System.out.println("3. Length of hike");
            System.out.println("4. Number of night stops");
            System.out.println("5. Favorite");
            System.out.println("6. Environment");
            System.out.println("0. Go back");

            int updateChoice = sc.nextInt();
            sc.nextLine();

            switch (updateChoice) {
                case 0:
                    break;
                case 1:
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    HikeManagement.updateByName(nameOfHike, newName);
                    break;
                case 2:
                    System.out.print("Enter new Area: ");
                    String newArea = sc.nextLine();
                    HikeManagement.updateByArea(nameOfHike, newArea);
                    break;
                case 3:
                    System.out.print("Enter new length(km): ");
                    int newLength = sc.nextInt();
                    sc.nextLine();
                    HikeManagement.updateByLength(nameOfHike, newLength);
                    break;
                case 4:
                    System.out.print("Enter new number of night stops: ");
                    int newNumberOfNightStops = sc.nextInt();
                    sc.nextLine();
                    HikeManagement.updateByNumberOfNightStops(nameOfHike, newNumberOfNightStops);
                    break;
                case 5:
                    System.out.print("Set as favorite? (yes/no)");
                    String fav = sc.nextLine();
                    HikeManagement.updateFavorite(nameOfHike, fav);
                    break;
                case 6:
                    System.out.print("Enter new environment: ");
                    String newEnvironment = sc.nextLine();
                    HikeManagement.updateEnvironment(nameOfHike, newEnvironment);
                    break;
                default:
                    System.out.println("No such option");
            }
        } else {
            System.out.println("This is not at coastal trail");
        }
    }

    private static void removeHike() {
        System.out.print("Enter name of hike to be removed: ");
        String nameOfHike = sc.nextLine();
        HikeManagement.removeHike(nameOfHike);
        System.out.println("Hike " + nameOfHike + " has been removed.");
    }

    private static void addHike() {

        boolean favorite;

        System.out.print("Press M for mountain hike, press C for coastal hike: ");
        String add = sc.nextLine();


        if (add.equalsIgnoreCase("m")) {

            System.out.print("Enter name of hike: ");
            String nameOfHike = sc.nextLine();

            System.out.print("Enter area where hike is located: ");
            String areaOfHike = sc.nextLine();

            System.out.print("Enter length of hike(km): ");
            int lengthOfHike = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter number of night stops: ");
            int numberOfNightStops = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter highest altitude(m): ");
            String highestAltitude = sc.nextLine();

            System.out.print("Enter difficult level: ");
            String difficultLevel = sc.nextLine();

            System.out.print("Do you want to mark this as a favorite hike? (yes/no): ");

            if (sc.nextLine().equalsIgnoreCase("yes")) {
                favorite = true;
            } else {
                favorite = false;
            }
            MountainHike ht = new MountainHike(nameOfHike, areaOfHike, lengthOfHike, numberOfNightStops, favorite, highestAltitude, difficultLevel);
            HikeManagement.addHike(ht);

        } else if (add.equalsIgnoreCase("c")) {
            System.out.print("Enter name of hike: ");
            String nameOfHike = sc.nextLine();
            System.out.print("Enter area where hike is located: ");
            String areaOfHike = sc.nextLine();
            System.out.print("Enter length of hike(km): ");
            int lengthOfHike = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter number of night stops: ");
            int numberOfNightStops = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter sea: ");
            String sea = sc.nextLine();

            System.out.print("Enter environment: ");
            String environment = sc.nextLine();

            System.out.print("Do you want to mark this as a favorite hike? (yes/no): ");

            if (sc.nextLine().equalsIgnoreCase("yes")) {
                favorite = true;
            } else {
                favorite = false;
            }

            CoastalHike ht = new CoastalHike(nameOfHike, areaOfHike, lengthOfHike, numberOfNightStops, favorite, sea, environment);
            HikeManagement.addHike(ht);
        } else {
            System.out.println("No such option ");
        }
    }

    private static int readInt(String question){
        boolean loop = true;
        int number = 0;

        while(loop){
            System.out.println(question);
            try {
                number = sc.nextInt();
                loop = false;
            } catch (InputMismatchException e) {
                System.out.println("Wrong input, try again. ");
            }
            sc.nextLine();
        }
        return number;
    }
}
