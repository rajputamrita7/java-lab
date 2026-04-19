

// Q1a: Perform operations on ArrayList and LinkedList
import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        LinkedList<String> list = new LinkedList<>();

        
        arr.add("Apple");
        arr.add("Banana");
        arr.add("Orange");

        list.addAll(arr);

        
        System.out.println("Element at index 1: " + arr.get(1));

        
        arr.set(1, "Mango");

        
        arr.remove("Orange");

       
        System.out.println("Contains Apple: " + arr.contains("Apple"));

        
        System.out.println("Size: " + arr.size());

        
        for(String s : arr)
            System.out.println(s);

       
        Collections.sort(arr);

        System.out.println("Sorted: " + arr);
    }
}