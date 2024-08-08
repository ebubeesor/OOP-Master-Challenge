public class MealOrder {
    private Item side, drink;
    private Burger burger;

    public MealOrder(Item side, Item drink, Burger burger) {
        this.side = side;
        this.drink = drink;
        this.burger = burger;
    }

    public MealOrder() {
        this.side = new Item("Fries", "Side", "M", 2.50);
        this.drink = new Item("Coke", "Drink", "M", 1);
        this.burger = new Burger("Cheese", 7.10);
    }

    public void addToppings(Item extra1, Item extra2, Item extra3) {
        burger.addToppings(extra1, extra2, extra3);

    }

    public void addToppings(Item extra1, Item extra2, Item extra3, Item extra4, Item extra5) {
        burger.addToppings(extra1, extra2, extra3, extra4, extra5);

    }

    public void setDrinkSize(String size) {
        this.drink.setSize(size);
    }

    public void printItemizedList() {
        side.printItem();
        System.out.printf("Price: $%.2f%n", side.getAdjustedPrice());
        drink.printItem();
        System.out.printf("Price: $%.2f%n", drink.getAdjustedPrice());
        burger.printItem();

//        burger.top1().printItem();
//        System.out.printf("Price: $%.2f%n", burger.top1().getBasePrice());
//        burger.top2().printItem();
//        System.out.printf("Price: $%.2f%n", burger.top2().getBasePrice());
//        burger.top3().printItem();
//        System.out.printf("Price: $%.2f%n", burger.top3().getBasePrice());

    }

    public void printTotal() {
        double total = side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getBasePrice() + burger.totalToppingPrice();
        System.out.printf("""
                Your total is $%.2f""", total);
    }
}
