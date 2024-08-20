package edu.learngenerics;

import java.util.ArrayList;
import java.util.List;

public class WildCardsDemo {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("Name 1");
//        names.add("Name 2");
        //printList(names);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1); // Autoboxing in action, int given, automatically boxed to Integer!
        numbers.add(2);

        printList(numbers);

        //addToList(numbers,10);

        List<Number> number2 = new ArrayList<>();
        addToList(number2,10);
    }

    /*private static void addToList(List<? extends Number> numbers, Integer i) {
        numbers.add(i); //The Compiler is throwing an error because the compiler doesn't know whether the wildcard is
        //getting a double or integer or any other number format.
    }*/

    /*private static void addToList(List<? extends Number> numbers, Number i) {
        numbers.add(i);// This also doesnt work because it's accepting Number i, suppose if I pass a Double
        // or an Integer when I am calling the addToList method, then the number of i accepts that data since
        // Number is a super class for the Integer or Double class, that's why the compiler does not allow this too
    }*/

    private static void addToList(List<? super Number> numbers, Number i) {
        numbers.add(i);
        /* now, if my wild card is used as a lower bound, and it makes a call to super of Number.
           Then I can add a number or anything super class to that number. This means for the first case when we use
           extend the sub classes are more restrictive than the super class, whereas while using super the base class,
           can be accepted and anything super to that base class is accepted as anything super to the base class is
            more lenient*/
    }

    //TL;DR: SUPER IS USED FOR WRITE CASES WHEREAS EXTENDS IS USED FOR READ CASES


    /*So, how do you solve the generics inheritance problem? Wildcard is the way to solve the generics problem so you put
    a '?' inside the type, and it denotes that it is some type that the compiler doesn't know. It will allow other types
    to fit in. However, we can just read from the list, and we cannot modify or add anything to the list as the compiler
    doesn't know the type of the '?' */
    /* private static void printList(List<?> names) {
        //names.add(1); //This won't work, as the compiler doesn't know what the ? type is?
        names.forEach(System.out::println);
    }*/

    //Providing upper bound to the wild card. It ensures only list of Integers can be passed to this method signature.
    private static void printList(List<? extends Integer> names) {
        names.forEach(System.out::println);

    }


}

//PECS -> PRODUCER EXTENDS, CONSUMER SUPER
