package edu.learngenerics;

public class GenericsVsTypedArrays {
    public static void main(String[] args) {
        String[] names = new String[5];
        //addToArray(names, "Soumyadeep");
        String getName = names[0];
        System.out.println(getName);

        incorrectAddToArray(names, 10);
        //Now as soon as this method will be called, JVM will throw a runtime exception, called "ARRAY STORE EXCEPTION"
        //This is because unlike GENERICS, which are used as a compile time construct, Java arrays are run time construct,
        // that means even if you cheat the compiler, at runtime it'll throw the necessary exception.

    }


    /* private static void incorrectAddToArray(String[] names, Integer i) {
        names[0] = i; // obviously it'll give a compile time error as names array is a string array and we're trying
                      // tp put an integer in it.
    }*/

    private static void incorrectAddToArray(Object[] names, Integer i) {
        names[0] = i; //Since we're passing the names String array to an Object array. It can accept Integer i as
                      // integer i is also an object and we've successfully cheated the compiler and the compiler
                      // doesn't complain.
    }




//    private static void addToArray(String[] names, String getName) {
//        names[0] = getName;
//    }
}
