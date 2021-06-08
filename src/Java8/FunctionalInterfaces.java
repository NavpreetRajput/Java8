package Java8;
import java.util.function.*;
import java.util.Scanner;

public class FunctionalInterfaces {

    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word: ");
    String enter = sc.nextLine(); 


    /**
     * Predicate takes one argument and returns a boolean.
     */
    Predicate<String> str=(s) -> s.length()<10;
    System.out.println(str.test(enter)+ ": It returns true if it has less than 10 letters, otherwise false.");

    /**
     * Consumer accepts one argument with no return value.
     */
    System.out.println("Enter anything of your choice in lower case:");
    String cons=sc.nextLine();
    Consumer<String> con=(s) -> System.out.println(s.toUpperCase());
    System.out.println(cons+" in Upper case is: ");
    con.accept(cons);

    
    try{
    /**
     * Function accepts one argument and produces a result
     */
    System.out.println("Enter any number of your choice to check its length:");
    Integer len=sc.nextInt();
    Function<Integer,String> fun=(number) ->Integer.toString(number);
    System.out.println("Length of "+len+" is: "+fun.apply(len).length());
    
    }
    catch(Exception e){
    System.out.println("The value entered was not numerical.");
    
    }
    /**
     * supplier represents a supplier of results
     */
    Supplier<String> sup= () ->"My name is Navpreet kaur and I am practicing Java.";
    System.out.println(sup.get());

    /**
     * Binary Operator takes two argument and return one and all are of same type.
     */
    System.out.println("Enter any number of your choice :");
    Integer sub1=sc.nextInt();
    System.out.println("Enter another number of your choice :");
    Integer sub2=sc.nextInt();
    BinaryOperator<Integer> subtract=(x,y)-> x-y;
    System.out.println("Subtraction of "+sub1+ " from "+ sub2 +" is: "+subtract.apply(sub1, sub2));

    /**
     * Unary Operator takes single argument with a return value
     */
    System.out.println("Enter anything of your choice in upper case:");
    String upper=sc.nextLine();
    UnaryOperator<String> uo=(message)->message.toLowerCase();
    System.out.println(upper +" in lower case is: "+uo.apply(upper));

    /**
     * Bifunction accepts two arguments and produces a result.
     */
    System.out.println("Enter any number of your choice :");
    Integer mul1=sc.nextInt();
    System.out.println("Enter another number of your choice :");
    Double mul2=sc.nextDouble();        
    BiFunction<Integer,Double,Double> bifun=(a,b)->a*b;
    System.out.println("Multiplication of numbers you entered is: "+bifun.apply(mul1, mul2));
  
}
}
