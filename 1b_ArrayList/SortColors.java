// Q1b(3): Sort colors in ArrayList

import java.util.*;

public class SortColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");

        Collections.sort(colors);

        System.out.println(colors);
    }
}