package edu.learngenerics.zoodemogenerics;

public class Zoo {
    public static void main(String[] args) {
        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();

        Cage.isCompatible(monkey1, monkey2);





        // Cage<Monkey> cage = new Cage(new Monkey(), new Lion());
        //Okay, so how does this work? Well the right hand side is evaluated first. The compiler thinks, it's a new
        //cage instance and since the parameterised constructor of the Cage<E> class takes "E" type, it happily processes
        // this and put this assignment to the Cage<Monkey> cage variable, the Monkey type is associated with the cage
        // variable itself and not with the Cage instance. How to solve this?

        //Cage<Monkey> cage = new Cage<>(new Monkey(), new Lion()); it's solved now, I'm attaching the Monkey type with
        //the cage instance. And now it won't allow any other object's instance inside of it other than monkey.


        //Cage<String> cage = new Cage<String>(); This won't work as my cage class takes the type E which extends animal
        // and String class quite obvious doesn't extend animal?

        //Cage<Monkey> cage = new Cage<>(new Monkey(), new Monkey());

//        System.out.println(cage.getAnimal1());
//        System.out.println(cage.getAnimal2());

        //cage.setAnimal1(new Monkey());



        /* cage.setAnimal2(new Lion()); // what is stopping someone to put a Lion with a monkey in the same cage?
        // This is not good. How do I prevent this?
        //Generics to the rescue. I've defined the Cage class as a generic type. Syntax: public class Cage<E>{}
        //now whatever type, I'm gonna create the cage with, the class E will behave like that type.
        //Since I've created the instance of the Cage class type as Monkey (line no:5), it's constructor's gonna accept
        //only instance of the Monkey class.
        //That's the reason in line no 7 the setAnimal2(new Lion()) is giving an error. */
        //cage.setAnimal2(new Monkey());
        //Monkey animal1 = cage.getAnimal1();

        Cage<Lion> lionCage = new Cage<>();
        lionCage.setAnimal1(new Lion());
        /*lionCage.setAnimal2(new Monkey());*/
        lionCage.setAnimal2(new Lion());

        //This also helps us generalise the Cage class, as, if in future there's addition to the zoo, other's can add
        //animal of their type(own class) as I've created Lion and Monkey. This is the power of Generics.
        //GENERICS is a compile time check, it helps the developer, to catch errors during development time only.

    }
}
