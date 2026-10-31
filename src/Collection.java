import java.util.HashMap;
//Stores collection name and cards in a HashMap
public class Collection {
    private String collectionName;
    private HashMap<String, Integer> cards;

    public Collection(String collectionName) {
        this.collectionName = collectionName;
        this.cards = new HashMap<>();
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void addCard(String cardName, int quantity) {
        //to keep all names uniform, convert to lower case letters
        cardName = cardName.trim().toLowerCase();
        if (quantity <= 0) {
            System.out.println("Quantity must be greater than 0.");
            return;
        }

        if (cardName.isEmpty()) {
            System.out.println("Card name cannot be empty.");
            return;
        }
        
        //check if card is already in HashMap
        if (cards.containsKey(cardName)) {
            int currentQuantity = cards.get(cardName); // looks up cardName and stores its quantity in currentQuantity
            cards.put(cardName, currentQuantity + quantity); //put card name and update quantity
        } else {
            cards.put(cardName, quantity); // if no card with cardName exists, just add the card
        }
    }

    public void removeCard(String cardName, int quantity) {
        cardName = cardName.trim().toLowerCase();
        if (quantity <= 0) {
            System.out.println("Quantity must be greater than 0.");
            return;
        }

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

    public void findCard(String cardName) { //removed 'int quality' param
        // search for card by name and return its quantity
        cardName = cardName.trim().toLowerCase();
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
}
