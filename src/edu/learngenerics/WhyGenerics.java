package edu.learngenerics;

import java.util.ArrayList;
import java.util.Date;

//Two problems of not using generics:
//1. We've to do the right casting  2.There's no type safety.

public class WhyGenerics {
    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add(new Date()); //The compiler won't complain as we haven't provided type safety and we've just created
        // a raw ArrayList which takes list of objects!!!
        names.add("John");
        names.add("Jane");

        //String myFriendName = names.get(0); //This won't work
        String myFriendName = (String) names.get(0); //Will give a class caste exception
        System.out.println(myFriendName);

        //Generics to rescue: It introduces type safety, it will only allow string types to enter the list.
        // No casting required.
        ArrayList<String> list = new ArrayList<>();
        list.add("John");
        String name = (String) list.get(0);
        System.out.println(name);
    }
}
