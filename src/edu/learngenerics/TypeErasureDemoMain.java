package edu.learngenerics;

import java.util.ArrayList;
import java.util.List;

public class TypeErasureDemoMain {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        addToNames(names, "Soumyadeep");
        addToNames(names, "Shirsak");
        addToNames(names, "Renuka");

        System.out.println(names);

        incorrectAddToNames(names,100);
        incorrectAddToNames(names,200);

        System.out.println(names);

    }

    private static void addToNames(List<String> names, String name) {
        names.add(name);
    }

    //here although we are accepting the List<String> inside the list variable of type List, the compiler doesn't complain
    //as the List<String>, the string type is associated with the variable "names" inside the main method and not associated
    // with the instance it holds that is the "ArrayList." Now when the "names" list is sent outside the method to the
    //incorrectAddToNames method, the parameter "list" that accepts it is of type "List" , since the parameter's list type
    //has got no type checking with generics, even if we send an integer, java compiler allows us to add that integer to
    //the list, it doesn't complain. And as generics is a COMPILE TIME CONSTRUCT, at runtime this thing runs without
    //complaining and adds the integer to the list and provides an output list with Strings and integers. This thing
    //is known as Type Erasure in generics.
    private static void incorrectAddToNames(List list, Integer i){
        list.add(i);
    }
}

