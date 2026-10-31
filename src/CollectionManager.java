// Adds, removes, searches, and displays cards
//manages multiple collections
import java.util.HashMap;

public class CollectionManager {
    private HashMap<String, Collection> cards;
    // for later versions, use following line
    // private HashMap<String, Card> cards;

    public CollectionManager() {
        cards = new HashMap<>();
    }

    public void createCollection(String collectionName) {
        //System.out.println("Collection " + collectionName + " created.");
        String key = collectionName.trim().toLowerCase();

        if (key.isEmpty()) {
            System.out.println("Collection name cannot be empty.");
            return;
        }

        if (cards.containsKey(key)) {
            System.out.println("Collection already exists.");
        } else {
            Collection newCollection = new Collection(collectionName.trim());

            cards.put(key, newCollection); // Initialize the collection with a quantity of 0
            System.out.println("Collection " + collectionName + " created.");
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

    public boolean checkIfEmpty() {
        return cards.isEmpty();
    }
}
