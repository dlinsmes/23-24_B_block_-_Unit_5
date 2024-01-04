//a class is a blueprint or template
//for something you want to represent in
//your program
public class Penguin {

    //instance variables:
    //every object we make from
    //this class gets its own
    //copy of each instance variable and can have
    //its own values for each variable

    int feet;
    String name;
    private double beak;


    //hypothetical - once a penguin can swim,
    // this cannot turn to false again

    //the "private" visibility modifier doesn't allow
    //outside classes to view or change this variable
    private boolean canSwim;


    //technically ALL instance variables should be private

    //constructor - like a method
    //but there's no return type and the name
    //needs to match the class name exactly
    //-a constructor should initialize all instance
    //variables
    //-without a constructor, all instance variables will
    //have default values of 0/0.0/null/false
    public Penguin() {
        name = "penguin";
        feet = 2;
        beak = 42.3;
        canSwim = false;
    }

    //if you don't write a constructor,
    // a default constructor is available and
    //will initialize values to 0/0.0/null/false


    //overloaded constructor (different number of parameters)
    public Penguin(String n, int f, double beak) {
        //regardless of the number of parameters, a constructor
        //should initialize ALL instance variables

        name = n;
        feet = f;
        //the "this" keyword refers to the instance variable
        //without "this" refers to the parameter
        this.beak = beak;

        //should still initialize even though there's not a param
        //for canswim
        canSwim = true;
    }

    //accessor method aka get method aka getter
    //purpose is to provide public view access to private
    //variables
    //-return type should match the variable's type
    public boolean getCanSwim() {
        return canSwim;
    }

    //return type matches the variable type
    public double getBeak() {
        return beak;
    }

    //canSwim can only ever be changed to true
    //mutator method aka set method aka setters
    //-let outside classes update instance variables
    //in a controlled way
    public void setCanSwim(boolean cs) {
        if (cs == true) {
            canSwim = true;
        }
        else {
            System.out.println("can't set to false");
        }
    }
}
