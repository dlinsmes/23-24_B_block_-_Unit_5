public class PenguinClient {

    public static void main(String [] args) {

        //declare a Penguin object called p1
        //-an object is one specific example
        //made from the Penguin class (blueprint)
        //-instantiate by calling the no-parameter contructor
        Penguin p1 = new Penguin();

        //at this point the default values defined in the constructor are set
        System.out.println(p1.name + " has " + p1.feet + " feet");

        //change/update the instance variables of p1
        p1.name = "lynden";
        p1.feet = 6;

        System.out.println(p1.name + " has " + p1.feet + " feet");

        Penguin p2 = new Penguin();
        p2.name = "radley";
        p2.feet = 1;

        //the p2 object and variable data is independent from p1
        System.out.println(p2.name + " has " + p2.feet + " feet");

        //System.out.println(p2.beak);
        System.out.println(p2.getBeak());


        //call the overloaded constructor that lets you specify values
        //for the instance variables
        Penguin p3 = new Penguin("grayson", 11, 0.1);
        System.out.println(p3.name + " has " + p3.feet + " feet");

        //since canSwim is a private variable, it can't be used
        //outside the Penguin class
//        System.out.println("radley can swim: " + p2.canSwim);
//        p2.canSwim = false;
//        System.out.println("radley can swim: " + p2.canSwim);

        //need to use public accessor method to see the value of canSwim
        System.out.println("radley can swim: " + p2.getCanSwim());
        p2.setCanSwim(true);
        System.out.println("radley can swim: " + p2.getCanSwim());
        //the mutator method won't allow false to be set for canSwim
        p2.setCanSwim(false);
        System.out.println("radley can swim: " + p2.getCanSwim());


    }
}
