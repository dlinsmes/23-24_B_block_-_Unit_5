import java.util.ArrayList;

public class ArrayLists {
    public static void main(String [] args) {

        //with an array, the length stays the same and you can't add
        //pr remove items from it

        //ArrayLists can only hold objects, not primitives

        //declare an ArrayList that will hold Strings called words
        ArrayList<String> words = new ArrayList<String> ();
        //typical format:
        //ArrayList<ObjType> name = new ArrayList<ObjType> ();

        words.add("ryan");
        words.add("blake");
        words.add("word");

        //.size() instead of .length
        for (int i = 0; i < words.size(); i++) {

            //don't use square brackets - use .get(index) to return the
            //value at that position
            System.out.println(words.get(i));
        }

        System.out.println(words.get(2));

        //for-each loop:
        for (String word: words) {
            System.out.println(word);
        }

        //overloaded add method will insert a value at the index given
        //-this does not replace/delete the values that are already
        //in the list
        words.add(1, "bob");

        System.out.println();
        for (String word: words) {
            System.out.println(word);
        }

        //set() will replace a previous value with a new one
        words.set(2, "water bottle");

        //arraylists can be directly printed
        System.out.println(words);

        //remove the object at the given index
        words.remove(1);
        System.out.println(words);

        //the remove() method will return the item that's removed
        String removed = words.remove(2);
        System.out.println(words);
        System.out.println(removed);

        words.add("ted");
        words.add("sandwich");

        System.out.println();
        System.out.println(words);

        //write code with a loop that will remove all values in the list

        //doesn't work because as items are removed, the indexing in the
        //rest of the list will shift accordingly so that the first index is
        //always 0 and the last index is the size - 1
        //after the 0th item is removed, what WAS at index 1, is now index 0,
        //then i increments to 1 so then the new item at index 0 doesn't get
        //removed
//        for (int i = 0; i < words.size(); i++) {
//            words.remove(i);
//        }

        //works bc by removing from the end of the list, the indices
        //of the remaining values don't get shifted
//        for (int i = words.size()-1; i>= 0; i--) {
//            words.remove(i);
//        }

        for (int i = words.size()-1; i >= 0; i--) {
            words.remove(0);
        }

        System.out.println(words);

        BlackjackPlayer p = new BlackjackPlayer("grayson");
        Card c1 = new Card("Spades", 1);
        Card c2 = new Card("Spades", 7);
        Card c3 = new Card("Spades", 12);


        //score should be 18
        p.addCard(c1);
        p.addCard(c1);
        p.addCard(c3);


        System.out.println(p.getScore());

        System.out.println(p);
    }
}
