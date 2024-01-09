//clients/testers make ohjects from another class
public class CityClient {

    public static void main(String [] args) {

        //0
        System.out.println("number of cities: " + City.numCities);

        //invalid bc getName() is NOT a static method - it's an instance method
        //-it can only be called from a specific object/instance
        //System.out.println(City.getName());

        //declare a City object with variable name c1
        //call the constructor that requires 3 values
        City c1 = new City("New york", 8000000, "english");

        //static variables/methods are accessed directly from the class
        System.out.println("number of cities: " + City.numCities);

        //-can also be accessed from specific objects
        System.out.println("number of cities: " + c1.numCities);



        //if no constructor is defined in the class,
        //a default no-param constuctor is available to use
        //and will set instance variables to 0/0.0/false/null
        //City c1 = new City();

        //print c1's info

        //doesn't work bc name has private access
        // -need to use a public get method instead
        //System.out.println(c1.name);

        System.out.println(c1.getName());
        System.out.println(c1.getLanguage());
        System.out.println(c1.getPopulation());
        System.out.println(c1.getLockdown());

        //doesn't work bc lockdown is private
        //c1.lockdown = true;

        //public mutator method to change the value
        //of lockdown
        c1.setLockdown();

        System.out.println(c1.getLockdown());

        City c2 = new City ("boston", 100000, "english");

        System.out.println("number of cities: " + City.numCities);

        System.out.println(c2.getName());


        System.out.println();

        //printing an object directly will output its memory location
        //(not useful) UNLESS you defined your own toString() method
        //in the class
        System.out.println(c2);
        //not necessary to actually call toString()
        //-printing the object will call that method for you
        System.out.println(c2.toString());

        System.out.println();

        //declare an array of city objects that holds 3 objects
        City [] cities = new City[3];

        cities[0] = c1;
        cities[1] = c2;
        cities[2] = new City("toronto", 100, "japanese");

        System.out.println("number of cities: " + City.numCities);


        //print the names of each city in the array
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i].getName());
        }

        //for each loop that iterates through array
        for (City c: cities) {
            System.out.println(c.getPopulation());
        }

        System.out.println();
        System.out.println("cities that speak english");

        //print the cities in the array that
        // have a language of english
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].getLanguage().equals("english")) {
                System.out.println(cities[i]);
                System.out.println();
            }
        }

        //with static variables, if the value is changed or updated, that new value is
        //shared across the whole class and all objects from that class
        System.out.println("number of cities: " + City.numCities);
        System.out.println("number of cities: " + c1.numCities);
        System.out.println("number of cities: " + c2.numCities);
        System.out.println("number of cities: " + cities[2].numCities);


        //static methods can be called directly from a class without
        //making an object
        PenguinClient.main(args);

        //random() is a method from the Math class
        //-random() is a static method - we've never made a math object
        //and we call random() directly from the Math class
        double r = Math.random();


    }
}
