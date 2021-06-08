package Java8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiFunction;

public class MethodReferences {

    public MethodReferences(String say) {
        System.out.println(say);
    }

    static Scanner sc = new Scanner(System.in);

    /**
     * Declaring an interface having display method
     */
    interface interfaces {
        void display(String say);
    }

    /**
     * declaring an interface having show method
     */
    interface MyInterface {
        void show();
    }

    /**
     * 
     * @param x x is the first number
     * @param y y is the second number
     * @return returns the addition of two numbers
     */
    public static int addition(int x, int y) {

        return x + y;
    }

    public void myMethod() {
        System.out.println("Hey, I am Navpreet Kaur.");

    }

    public static void main(String[] args) {

        /**
         * Method reference to a static Method of a class.
         */
        System.out.println("Enter any number of your choice :");
        Integer add1 = sc.nextInt();
        System.out.println("Enter another number of your choice :");
        Integer add2 = sc.nextInt();
        BiFunction<Integer, Integer, Integer> add = MethodReferences::addition;
        System.out.println("Addition of two numbers that you entered is: " + add.apply(add1, add2));
        sc.close();
        /**
         * Method reference to an Intstance Method.
         */
        MethodReferences mref = new MethodReferences("Hi");
        MyInterface obj = mref::myMethod;
        obj.show();

        /**
         * Method Reference to an instance method of an arbitrary object of a particular
         * type
         */
        String[] array = { "Navpreet Kaur", "Amandeep Kaur", "Amanjot Kaur", "Aaravbir Singh", "Hasrat",
                "Komalpreet Kaur", "Agamjot Singh" };
        Arrays.sort(array, String::compareToIgnoreCase);
        for (String arr : array) {
            System.out.println(arr);
        }

        /**
         * Method reference to a constructor
         */
        interfaces inter = MethodReferences::new;
        inter.display("This program is finished. Thanks for joining.");

    }
}
