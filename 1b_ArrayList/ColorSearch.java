// Q1b(1): Check if Red exists in ArrayList

import java.util.*;

public class ColorSearch {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");

        if(colors.contains("Red"))
            System.out.println("Red is present");
        else
            System.out.println("Red is not present");
    }
}