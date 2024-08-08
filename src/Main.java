// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Item side = new Item ("Fries", "Side", "S", 2.50);
        Item drink = new Item ("Coke", "Drink", "M", 1);
        Item onions = new Item ("Onion", "Topping", "M", 0.30);
        Item lettuce = new Item ("Lettuce", "Topping", "M", 0.30);
        Item tomato = new Item ("Tomato", "Topping", "M", 0.30);
        Item pickles = new Item ("Pickles", "Topping", "M", 0.30);
        Item bacon = new Item ("Bacon", "Topping", "M", 1);

        Burger burger = new Burger ("Italian Spice", 7.10);

        Burger deluxeBurger = new Burger ("Deluxe", 10.50);

        MealOrder meal = new MealOrder(side, drink, burger);
        MealOrder deluxeMeal = new MealOrder(side, drink, deluxeBurger);

//        deluxeMeal.printItemizedList();
//        deluxeMeal.printTotal();

        MealOrder mealOrder2 = new MealOrder();
        mealOrder2.printItemizedList();
        mealOrder2.printTotal();


    }
}