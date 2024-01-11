public class Deck {

    //a deck is multiple cards
    //this is a composition - this class is composed
    //of objects of a different class
    private Card [] cards;

    private int top;

    public Deck() {
        //every deck starts off as a set of 52 unshuffled cards
        cards = new Card[52];
        top = 0;

        int index = 0;

        //instantiate each card in the array systematically so that
        //all 52 combinations are generated
        for (int i = 1; i <= 13; i++) {
            cards[index] = new Card("Spades", i);
            index++;
        }
        for (int i = 1; i <= 13; i++) {
            cards[index] = new Card("Diamonds", i);
            index++;
        }
        for (int i = 1; i <= 13; i++) {
            cards[index] = new Card("Clubs", i);
            index++;
        }
        for (int i = 1; i <= 13; i++) {
            cards[index] = new Card("Hearts", i);
            index++;
        }
    }

    //toString()
    // -append each Card object’s toString() on a new line of a String, then return
    //the string with all of the cards' info
    public String toString() {
        String deckInfo = "";
        for (int i = 0; i < cards.length; i++) {
            deckInfo += cards[i].toString() + "\n";
        }
        return deckInfo;
    }

    //instance methods - methods that each object
    //can call
    public void shuffle() {

        for (int i = 0; i < 52; i++) {
            int rand = (int) (Math.random() * 52);
            //swap the cards at positions i and rand
            Card temp = cards[i];
            cards[i] = cards[rand];
            cards[rand] = temp;

        }
    }

    //an object can be used as a return type
    public Card draw() {
        Card toDraw = cards[top];
        top++;
        return toDraw;
    }

}
