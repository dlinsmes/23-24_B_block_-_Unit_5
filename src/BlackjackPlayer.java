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

        int score = 0;
        int nAces = 0;

        for (int i = 0; i < hand.size(); i++) {
            Card current = hand.get(i);
            int val = current.getValue();

            int cardVal = hand.get(i).getValue();

            if (val >= 2 && val <= 10)
                score += val;
            if (val >= 11)
                score += 10;
            if (val == 1)
                nAces++;
        }

        //if there are multiple aces, only one should potentially
        //count as 11, and the others should count as 1
        while (nAces > 1) {
            score++;
            nAces--;
        }

        if (nAces == 1) {
            if (score <= 10)
                score += 11;
            else
                score++;
        }

        return score;
    }

    public String toString() {
        return "Name: " + name + "\nScore: " +
                getScore() + "\nHand: " + hand;
    }
}
