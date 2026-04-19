// Q1b(2): Remove 2nd element and Blue from ArrayList
import java.util.*;

public class RemoveColor {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");

        
        colors.remove(1);

        
        colors.remove("Blue");

        System.out.println(colors);
    }
}