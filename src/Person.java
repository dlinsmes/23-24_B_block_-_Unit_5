public class Person {
    //class is blueprint
    //object is one specific instance made from the class


    //instance variables - variables that each object will have,
    //but each object can have different values for each variable
    //non-static refers to an object/instance method or variable


    //private - outside classes can't access
    private String name;
    private int age;
    private boolean intelligent;


    //static variables are class variables
    // (as opposed to instance variables)

    static int numPeople = 0;
    //since this is static, it can be accessed
    //from the class itself AND any person object

    //constructors - used to make objects

    //if no constructors are defined, a default no-param
    //can be used, but all instance variable values will default to
    //0/null/false

    //when defining constructors, give all instance variables values
    //regardless of how many parameters there are

    public Person(String name, int age, boolean i) {
        //use "this" to refer to the instance var when a param
        //has the same name
        this.name = name;
        this.age = age;
        intelligent = i;


        //increment the static variable
        //every time a constructor is called
        numPeople++;
    }

    //overloaded constructor - same name, different params
    public Person (String n) {
        name = n;
        //should still set values for the other
        //instance variables
        age = 12;
        intelligent = false;

        numPeople++;
    }

    //accessor methods aka get methods or getters
    //to allow public access to private variables

    //return type matches the variable type
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getIntelligent() {
        return intelligent;
    }

    //mutators aka set methods aka setters
    //allowing outside classes to modify private variables
    public void setIntelligent(boolean newIntel) {
        intelligent = newIntel;
    }

    //toString() gets output when an object is printed
    //header must be exactly:
    public String toString() {
        //toString should NOT print, but should return
        //a string that represents the objects
        if (intelligent)
            return (name + " is a smart " + age + "-year-old person");

        return (name + " is an unintelligent " + age + "-year-old person");
    }

}
