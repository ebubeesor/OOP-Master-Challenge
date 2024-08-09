public class MealOrder {
    private Item side, drink;
    private Burger burger;

    public MealOrder() {
        this("regular", "pepsi", "fries");
    }
    public MealOrder(String burger, String drink, String side) {
        this.burger = new Burger(burger, 4.0);
        this.drink = new Item("drink", drink, 1.00);
        this.side = new Item("side", side, 1.50);
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }

    public double getTotalPrice() {
        return side.getAdjustedPrice() + drink.getAdjustedPrice() +
                burger.getAdjustedPrice();
    }

    public void printItemizedList() {
        burger.printItem();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }
}
