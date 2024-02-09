import java.util.ArrayList;
public class CSVTester {

    public static void main(String [] args) {

        Penguin p = new Penguin("grayson", 2, 16.3);

        System.out.println(p.name);


        //copy/move csv file into top-level project folder (not in src)

        //call the static method from the CSVImporter class
        //-don't need to make an object of that class
        //-pass a string with the csv file name
        ArrayList<String []> data = CSVImporter.importData("Penguins.csv");

        //outputs memory locations bc data holds string arrays
        System.out.println(data);

        String [] row = data.get(0);
        //print the values from row 0
        for (String cell: row)
            System.out.print(cell + " ");

        //0th row is holding labels
        //-delete 0th row
        data.remove(0);

        System.out.println();

        row = data.get(0);
        //print the values from the first line of usable data
        for (String cell: row)
            System.out.print(cell + " ");

        String n = row[0];
        String feet = row[1];
        String beak = row[2];

        //doesn't work bc all data is stored as strings
        //-need to convert feet and beak to int and double
        //Penguin p1 = new Penguin(n, feet, beak);

        //parseInt and parseDouble turn strings into
        //numerical data
        int ft = Integer.parseInt(feet);
        double b = Double.parseDouble(beak);
        Penguin p1 = new Penguin(n, ft, b);

        System.out.println();
        System.out.println("penguin1: " + p1.name + " " + p1.feet + " " + p1.getBeak());

        //hold all the penguin objects made in the for loop below
        ArrayList<Penguin> waddle = new ArrayList<Penguin>();

        //iterate through data to make objects from each row
        for (String [] r: data) {
            //take each cell from the row, convert the type if needed, pass as an argument
            //to the Penguin constructor
            Penguin temp = new Penguin(r[0], Integer.parseInt(r[1]), Double.parseDouble(r[2]));
            //adds the newly made penguin object to the list
            waddle.add(temp);
        }

        System.out.println("look at all the penguins!!");
        //iterate through each penguin's names
        for (int i = 0; i < waddle.size(); i++) {
            System.out.println(waddle.get(i).name);
        }

    }
}
