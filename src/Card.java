// Card object with individual details about the card, including name, set, quantity, and value

public class Card {
    private String name;
    private String set;
    private int quantity;
    private double value;

    public String getName() {
        return this.name;
    }

    public String getSet() {
        return this.set;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getValue() {
        return this.value;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString(){ //not final
        String str = "Card";
        return str;
    }
}
