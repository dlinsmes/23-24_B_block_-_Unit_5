import java.util.ArrayList;

public class BlackjackPlayer {

    //arrays and ArrayLists can be instance variables
    private ArrayList<Card> hand;
    private String name;

    public BlackjackPlayer(String name) {
        this.name = name;
        hand = new ArrayList<Card>();
    }

    public String getName() {
        return name;
    }

    public void addCard(Card c) {
        hand.add(c);
    }

    //calculate and return the player's score based on the cards
    //in their hand
    //-calculate optimal score by figuring out the best scenario
    //for any aces
    public int getScore() {

        return 0;
    }
}
