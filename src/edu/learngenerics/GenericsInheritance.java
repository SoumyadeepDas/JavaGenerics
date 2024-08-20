package edu.learngenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInheritance {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Name 1");
        names.add("Name 2");
        // printList(names);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1); // Autoboxing in action, int given, automatically boxed to Integer!
        numbers.add(2);

        // printList(numbers); //will not work.
    }
}

    //although we are creating the List names as type object, but it won't work because the idea of assigning the
    // subclass to the super class does not work in case of Java generics

    /*private static void printList(List<Object> names) {
        //names.forEach(System.out::println);
        names.add("Hello");*/


    /* why did the Java language designers did not allow this? Well, think of a case where after taking the list of
    objects, we are adding a string to it. Just like I have added in line number 24 names.add("Hello")
    This would easily work for the List<String> names : defined in line number 8, as it is a list of string, but
     for the List<Integer> numbers defined in line number 13, what would have been the implications?. This is the
     reason the language developers did not allow inheritance in Java genetics.
     Now, if they had allowed it, and if you have taken a super class, then you might have put our past
     something where it would have failed that type safety, which at the first place generics do.*/
