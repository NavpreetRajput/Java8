package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ForEach {

    public static void main(String[] args) {

        System.out.println("Names are: ");
        // Initializing and declaring the array
        List<String> names = Arrays.asList("Ron", "Rick", "Pritam", "Jay", "Lucy", "Aamir", "Jon");

        // Sorting the Array Alphabetically.
        Collections.sort(names);

        // Printing the Array with the help of method Reference.
        names.forEach(System.out::println);
        System.out.println("\n");

        System.out.println("Numbers are: ");

        // Initializing and declaring the array
        List<Integer> num = Arrays.asList(6, 7, 1, 5, 3, 9, 0, 4, 8, 2);

        // Sorting the array numerically.
        num.sort(Comparator.comparing(Integer::valueOf));

        // Printing the array with the help of Method Reference.
        num.forEach(System.out::println);
    }
}
