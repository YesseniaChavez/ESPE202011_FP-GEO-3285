package ec.edu.espe.sorting.controller;

public class Search {

    public static int searchString(String[] planets, String searchElement) {
        for (int x = 0; x < planets.length; x++) {
            if (planets[x].equals(searchElement)) {
                return x;
            }
        }
        return -1;
    }
}
