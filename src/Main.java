import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Trading Card Tracker");
        CollectionManager collection = new CollectionManager();
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Enter name of card to add: ");
        String cardName = keyboard.nextLine();
        System.out.printf("Enter quantity of card to add: ");
        int quantity = keyboard.nextInt();
        collection.addCard(cardName, quantity);

        collection.addCard("Pikachu", 3);
        collection.addCard("Charizard", 2);
        collection.addCard("Bulbasaur", 5);

        collection.displayCards();
        System.out.println();
        collection.findCard("Pikachu", 0);
        collection.removeCard("Charizard", 1);
        collection.displayCards();
        System.out.println();
        collection.removeCard("Bulbasaur", 5);
        collection.displayCards();
    }
}