// Program 2: Stack operations using ArrayList
import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        ArrayList<Integer> stack = new ArrayList<>();

        // Push
        stack.add(10);
        stack.add(20);
        stack.add(30);

        System.out.println("Stack: " + stack);

        // Peek
        System.out.println("Top element: " + stack.get(stack.size() - 1));

        // Pop
        stack.remove(stack.size() - 1);

        System.out.println("After pop: " + stack);
    }
}