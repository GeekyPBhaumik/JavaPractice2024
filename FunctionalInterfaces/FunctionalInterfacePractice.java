package FunctionalInterfaces;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacePractice {
    public static void main(String[] args) {
        // Example 1: Printing a string using Consumer
        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("Hello World!");

        // Example 2: Incrementing each element in an array by 1
        int arr[] = {2,1,4,10,21,8};
        Consumer<Integer> increment = num -> System.out.print((num+1)+" ");
        for(Integer e:arr){
            increment.accept(e);
        }
        System.out.println();
        // Example 1: Generating a random number using Supplier
        Supplier supplier = () -> new Random().nextInt(10);
        System.out.println("Random Number:"+supplier.get());

        // Example 2: Supplying a constant value
        Supplier supplier2 = () -> "Hello Supplier!";
        System.out.println(supplier2.get());

        // Example 1: Testing if a number is even using Predicate
        Predicate<Integer> testingEven = num -> ((num%2)==0);
        System.out.println(testingEven.test(3));

        // Example 2: Testing if a string is not empty
        Predicate<String> isStrEmpty = str -> str.isEmpty();
        System.out.println(isStrEmpty.test(""));
        System.out.println(isStrEmpty.test("Strong"));

        // Example 1: Converting string to uppercase using Function
        Function<String,String> strUpperCase = str -> str.toUpperCase();
        System.out.println(strUpperCase.apply("Lambda"));

        // Example 2: Squaring a number using Function
        Function<Integer,Integer> squareNum = num -> num*num;
        System.out.println(squareNum.apply(4));
    }
}
