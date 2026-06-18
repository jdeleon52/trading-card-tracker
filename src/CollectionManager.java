// Adds, removes, searches, and displays cards
import java.util.HashMap;

public class CollectionManager {
    private HashMap<String, Integer> cards;

    public CollectionManager() {
        cards = new HashMap<>();
    }

    public void addCard(String cardName, int quantity) {
        //to keep all names uniform, convert to lower case letters
        cardName = cardName.toLowerCase();

        //check if card is already in HashMap
        if (cards.containsKey(cardName)) {
            int currentQuantity = cards.get(cardName); // looks up cardName and stores its quantity in currentQuantity
            cards.put(cardName, currentQuantity + quantity); //put card name and update quantity
        } else {
            cards.put(cardName, quantity); // if no card with cardName exists, just add the card
        }
    }

    public void removeCard(String cardName, int quantity) {
        cardName = cardName.toLowerCase();

        // find cardName in cards HashMap
        if (cards.containsKey(cardName)) {
            int currentQuantity = cards.get(cardName); //store quantity of cardName in currentQuantity
            int newQuantity = currentQuantity - quantity; // 

            if (newQuantity <= 0) {
                cards.remove(cardName);
            } else {
                cards.put(cardName, newQuantity);
            }
        } else {
            System.out.println("Card not found.");
        }
    }

    public void findCard() {

    }

    public void displayCards() {

    }
}
