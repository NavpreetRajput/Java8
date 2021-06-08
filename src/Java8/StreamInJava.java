package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class StreamInJava {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Navpreet Kaur");
        names.add("A Kan");
        names.add("Khan");
        names.add("Ram");
        names.add("Komalpreet Kaur");

        names.stream().forEach((c) -> System.out.println(c));

        /**
         * the stream() method returns a stream of all the names, the filter() method
         * returns another stream of names with length less than 5, the count() method
         * reduces this stream to the result.
         */
        long count = names.stream().filter(str -> str.length() < 5).count();

        System.out.println("There are " + count + " names which has length less than 6");

        /**
         * to print those names which has more than 10 letters.
         */
        Stream<String> allNames = names.stream();
        Stream<String> longNames = allNames.filter(str -> str.length() > 10);
        System.out.println("Long names are mentioned below:");
        longNames.forEach(System.out::println);

        /**
         * the stream() method returns a stream of all the numbers, the filter() method
         * returns another stream of numbers which are exactly divided by 3, the
         * forEach() method returns the list of that stream.
         */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        numbers.stream().filter(number -> number % 3 == 0).limit(6).forEach(System.out::println);

        /**
         * Concatinating two Lists using stream
         */
        List<String> colors = Arrays.asList("Red", "Blue", "Green", "Pink", "Yellow");
        List<String> directions = Arrays.asList("North", "South", "East", "West");
        Stream<String> streamConcat = Stream.concat(colors.stream(), directions.stream());
        streamConcat.forEach(str -> System.out.print(str + " "));

    }

}
