public class CardClient {
    public static void main(String [] args) {
        Card c1 = new Card("Spades", 1);

        System.out.println(c1);

        System.out.println();


        //make a deck object and print it out
        Deck d = new Deck();
        System.out.println(d);

        System.out.println();

        //call the shuffle method and then
        //print the shuffled deck
        d.shuffle();
        System.out.println(d);
    }
}
