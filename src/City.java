//class is a template to represent something in code
//that you want multiple objects/instances (examples) of
public class City {


    //instance variables
    //each object made from this class will have
    //these features, but each object can have
    //individual values for each variable

    //the private modifier makes it so outside classes
    //cannot access these variables directly
    private String name;
    private int population;
    private String language;
    private boolean lockdown;

    //constructors are special methods that let
    //outside classes instantiate (make) objects
    //from this class
    //public Classname() - no return type, params are optional
    public City(String name, int pop, String lang) {
        //initialize all instance variables

        //use "this" if the instance var has same name as param
        this.name = name;

        population = pop;

        //doesn't make a difference to use "this" bc
        // the param is named differently
        this.language = lang;

        //even though there's no param for lockdown, the
        //constructor should still give an initial value
        lockdown = false;
    }

    //accessors aka getters aka get methods
    //give public read access to the private variables
    //-return type that matches the variable type
    //-name of getVarName
    //-no params

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }
    public String getLanguage() {
        return language;
    }

    public boolean getLockdown() {
        return lockdown;
    }

    //mutator methods aka setters aka set methods
    //allow (controlled) write access to private variables
    //public void setVariable() - void return type, optional param
    public void setLockdown() {
        lockdown = !lockdown;
    }

    //format for a mutator that updates a variable to a new value
    public void setLanguage(String newLang) {
        language = newLang;
    }


    //return a String value that represents the object
    //that will be output when you print the object
    public String toString() {
        return "City name: " + name +
                "\nPopulation: " + population +
                "\nLanguage: " + language +
                "\nlockdown: " + lockdown;
    }
}
