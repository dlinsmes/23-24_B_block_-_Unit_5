import java.util.ArrayList;
public class PersonClient {

    public static void main(String [] args) {

    //Person a = new Person();
    //the default constructor becomes unusable
        // once a constructor is defined

        Person b = new Person("Grayson");
        Person c = new Person("Ryan", 18, true);

        //name is private - can't access from an outside class
        //System.out.println(b.name);

        System.out.println(b.getName());

        b.setIntelligent(true);
        System.out.println(b.getIntelligent());

        //without a toString() defined, printing
        //an object outputs its memory location (not useful)
        System.out.println(c);

        //static methods and variables are accessed
        //directly from the class
        CSVImporter.importData("Penguins.csv");

        //static vars/methods CAN be accessed from objects:
        CSVImporter ci = new CSVImporter();
        ci.importData("Penguins.csv");

        //we know random() is a static method of Math
        //bc we've never made an object of the Math class
        //to use random();
        double r = Math.random();

        //Person.getName();
        //doesn't work bc the method is an instance method,
        // not a static (class) method

        //non-static refers to an object/instance method or variable

        System.out.println("numPeople: " + Person.numPeople);
        System.out.println("numPeople: " + b.numPeople);
        System.out.println("numPeople: " + c.numPeople);

        //changing a static variable from any object or the class
        //will change the value for all objects
        //-it's the same shared value
        b.numPeople = 100;

        System.out.println("numPeople: " + Person.numPeople);
        System.out.println("numPeople: " + b.numPeople);
        System.out.println("numPeople: " + c.numPeople);

        //can call any public static main() from another class
        //CardClient.main(args);

        //ArrayLists allow for a dynamic size - can add and remove objects
        //arrays have a fixed size

        //-ArrayLists cannot hold primitives: ints, doubles, booleans

        //declare an arraylist that holds person objects
        ArrayList<Person> people;

        //still need to instantiate the list in order to use it
        people = new ArrayList<Person>();

        //add(object) will append the object at the end of the list
        people.add(c);

        //add(index, object) will insert at the indicated position
        people.add(0, b);

        System.out.println(people);

        Person d = new Person("Leo", 16, false);

        //set will replace what's currently in the list at the indicated position
        people.set(1, d);
        System.out.println(people);

        //remove() will return the object that's removed from the list
        Person removed = people.remove(0);

        System.out.println("the removed object: " + removed);

        System.out.println("remaining list: " + people);

        people.add(b);
        people.add(c);

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).getName());
        }

        System.out.println();

        people.add(b);
        people.add(b);
        people.add(b);

        //for-each loop that iterates through people where
        //p is the actual Person object, NOT an index
        for(Person p: people) {
            System.out.println(p.getName());

            //p is an object, not an int (index)
            //System.out.println(people.get(p));
        }

        System.out.println();
        //remove all objects from the list

        //when removing from a list, indices of the remaining elements will shift
        //so that the indices range from 0 to the list size

        for (int i = 0; i < people.size(); i++) {
            people.remove(0);
            i--;
        }

        //also works
//        for (int i = people.size()-1; i >= 0; i--) {
//            people.remove(i);
//        }

        System.out.println(people.size());

        //array of Person objects
        Person [] personArray;
        personArray = new Person [3];

        //valid but there's no object in the array yet so this is null
        System.out.println(personArray[0]);
        System.out.println();

        personArray[0] = b;
        personArray[1] = c;
        personArray[2] = new Person("steve");

        for (int i = 0; i < personArray.length; i++) {
            System.out.println(personArray[i].getName());
        }

        //same as for-each loops for arraylists
        for (Person p: personArray) {
            System.out.println(p);
        }

        System.out.println();
        System.out.println(b);

        int num = 100;
        changeAge(b, num);
        //primitive values don't get changed by methods
        //objects (incl arrays and arraylists) DO get changed by methods
        System.out.println("num is: " + num);
        System.out.println("person's age is: " + b.getAge());

        //these all refer to the same object
        //if you change an object through one variable, the change is seen
        //through all the other Person variables
        Person z = b;
        Person y = b;
        Person x = z;

        y.setAge(50);

        System.out.println(b.getAge());
        System.out.println(x.getAge());
        System.out.println(y.getAge());
        System.out.println(z.getAge());

        //if you remove the toString() method definition,
        //these will all print the same memory location
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        //if you do want a separate copy, call the constructor
        Person w = new Person(b.getName(), b.getAge(), b.getIntelligent());
        w.setAge(-500);

        System.out.println(b.getAge());
        System.out.println(w.getAge());
    }

    public static void changeAge(Person p, int newAge) {
        p.setAge(newAge);
        newAge = -1;
    }
}
