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
            int newQuantity = currentQuantity - quantity; // calculate how many cards are left after removing

            if (newQuantity <= 0) {
                cards.remove(cardName);
            } else {
                cards.put(cardName, newQuantity);
            }
        } else {
            System.out.println("Card not found.");
        }
    }

    public void findCard(String cardName, int quantity) {
        // search for card by name and return its quantity
        cardName = cardName.toLowerCase();
        if (cards.containsKey(cardName)) { // check if cardName is in cards HashMap
            System.out.println("Card found. Quantity: " + cards.get(cardName)); // cardName found, display quantity
        } else {
            System.out.println("Card not found.");
        }
    }

    public void displayCards() {
        // display all cards in collection
        if (cards.isEmpty()) { // check if cards HashMap is empty
            System.out.println("No cards in collection.");
        } else {
            System.out.println("Cards in collection:");
            for (String cardName : cards.keySet()) { 
                System.out.println(cardName + ": " + cards.get(cardName));
            }
        }
    }

    public void displayTotalCards() {
        // display total number of cards in collection
        int totalCards = 0;
        for (int quantity : cards.values()) {
            totalCards += quantity;
        }
        System.out.println("Total number of cards: " + totalCards);
    }

    public void displaySingleCard(String cardName) {
        // display details of a single card
        cardName = cardName.toLowerCase();
        if (cards.containsKey(cardName)) {
            System.out.println("Card: " + cardName + ", Quantity: " + cards.get(cardName));
        } else {
            System.out.println("Card not found.");
        }
    }
}
