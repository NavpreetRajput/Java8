package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ForEach {

    public static void main(String[] args){
        
        System.out.println("Names are: ");
        List<String> names = Arrays.asList("Ron", "Rick", "Pritam", "Jay", "Lucy", "Aamir", "Jon");
        Collections.sort(names);
        names.forEach(System.out::println);
        System.out.println("\n");
        
        System.out.println("Numbers are: ");
        List<Integer> num = Arrays.asList(6, 7, 1, 5, 3, 9,0,4,8,2);
        num.sort(Comparator.comparing(Integer::valueOf));
        num.forEach(System.out::println);
    }
}
