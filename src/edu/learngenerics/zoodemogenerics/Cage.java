package edu.learngenerics.zoodemogenerics;

//E is extending Animal class & implements Eats interface and Runs interface using the sign '&'. The class has to be
//the first thing, then interface comes.
public class Cage<E extends Animal & Eats & Runs> {
    private E animal1;
    private E animal2;

    public Cage() {
    }

    public Cage(E animal1, E animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
    }

    public E getAnimal1() {
        return animal1;
    }

    public void setAnimal1(E animal1) {
        this.animal1 = animal1;
    }

    public E getAnimal2() {
        return animal2;
    }

    public void setAnimal2(E animal2) {
        this.animal2 = animal2;
    }

    //Since our class Cage<E extends Animal> we can implement the method of the Animal class here, that's how we're
    //getting the getType() methods on animal1 and animal2.
    /*public boolean isCompatible(){
        return animal1.getType().equals(animal2.getType());
    }*/


    //E cannot be referenced from static context because E doesn't contain the type information because we are not
    //creating the the instance and the instance contains the type information.
    /*public static boolean isCompatible(E animal1, E animal2){
        return animal1.getType().equals(animal2.getType());
    }*/

    //When the call to this method is made as Cage.isCompatible(monkey1, monkey2); Then the <E extends Animal> of
    //this method becomes monkey class, and it extends animal and the this info is passed to the parameters
    //E animal1, E animal2 then animal1 can call it's method on monkey.
    public static <E extends Animal> boolean isCompatible(E animal1, E animal2){
        return animal1.getType().equals(animal2.getType());
    }




    public void feedAnimal(){
        //eat is coming from the Eats interface
        animal1.eat();
        animal2.eat();
    }
}
