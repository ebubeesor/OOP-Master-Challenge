// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Meal Order 1: Default order
        MealOrder order1 = new MealOrder();
        System.out.println("Order 1:");
        order1.printItemizedList();

        // Meal Order 2: Custom order with small drink and fries
        MealOrder order2 = new MealOrder("chicken", "coke", "onion rings");
        order2.setDrinkSize("SMALL");
        System.out.println("Order 2:");
        order2.printItemizedList();

        // Meal Order 3: Large meal with toppings
        MealOrder order3 = new MealOrder("double beef", "sprite", "fries");
        order3.setDrinkSize("LARGE");
        order3.addBurgerToppings("bacon", "cheese", "pickles");
        System.out.println("Order 3:");
        order3.printItemizedList();

        // Meal Order 4: Veggie burger with extra toppings
        MealOrder order4 = new MealOrder("veggie", "fanta", "salad");
        order4.addBurgerToppings("onion", "tomato", "mayo");
        System.out.println("Order 4:");
        order4.printItemizedList();

        // Meal Order 5: Fish burger with no toppings
        MealOrder order5 = new MealOrder("fish", "water", "fries");
        System.out.println("Order 5:");
        order5.printItemizedList();

        // Meal Order 6: Custom drink size and extra toppings
        MealOrder order6 = new MealOrder("grilled chicken", "iced tea", "potato wedges");
        order6.setDrinkSize("LARGE");
        order6.addBurgerToppings("ham", "cheese", "ketchup");
        System.out.println("Order 6:");
        order6.printItemizedList();

        // Meal Order 7: Basic burger with all the toppings
        MealOrder order7 = new MealOrder("basic beef", "lemonade", "coleslaw");
        order7.addBurgerToppings("cheese", "bacon", "onion");
        System.out.println("Order 7:");
        order7.printItemizedList();
    }
}
