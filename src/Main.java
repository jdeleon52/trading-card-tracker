import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Trading Card Tracker");
        CollectionManager collection = new CollectionManager();
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add card");
            System.out.println("2. Display cards");
            System.out.println("3. Remove card");
            System.out.println("4. Find card");
            System.out.println("5. Create collection");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            if (!keyboard.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                keyboard.nextLine(); // consume the invalid input
                continue; // go back to the beginning of the loop
            }

            int choice = keyboard.nextInt();
            keyboard.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter name of card to add: ");
                    String cardName = keyboard.nextLine();

                    System.out.print("Enter quantity of card to add: ");
                    int quantity = keyboard.nextInt();
                    keyboard.nextLine();

                    collection.addCard(cardName, quantity);
                    break;
                case 2:
                    collection.displayCards();
                    System.out.println();
                    break;
                case 3:
                    if (collection.checkIfEmpty()) {
                        System.out.println("Collection is empty. Cannot remove card.");
                        break;
                    }

                    System.out.print("Enter name of card to remove: ");
                    String cardToRemove = keyboard.nextLine();

                    System.out.print("Enter quantity of card to remove: ");
                    int removeQuantity = keyboard.nextInt();
                    keyboard.nextLine();

                    collection.removeCard(cardToRemove, removeQuantity);
                    break;
                case 4:
                    if (collection.checkIfEmpty()) {
                        System.out.println("Collection is empty. Cannot find card.");
                        break;
                    }
                    
                    System.out.print("Enter name of card to find: ");
                    String cardToFind = keyboard.nextLine();
                    collection.findCard(cardToFind);
                    break;
                case 5:
                    System.out.print("Enter name of collection to create: ");
                    String collectionName = keyboard.nextLine();
                    collection.createCollection(collectionName);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}