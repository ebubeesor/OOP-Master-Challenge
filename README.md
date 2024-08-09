# MealOrder Application

## Overview

The **MealOrder** application is a Java program that simulates a meal ordering system, allowing users to create and customize meal orders consisting of a burger, a drink, and a side item. The program supports various configurations for each item, including different sizes for drinks and the ability to add toppings to burgers. The application calculates the total price for each order based on the selected items and options.

## Features

- **Burger Customization:**
  - Choose from various types of burgers (e.g., regular, chicken, veggie).
  - Add up to three different toppings, each with its own price adjustment.
  
- **Drink Customization:**
  - Select a drink and adjust its size (Small, Medium, Large).
  
- **Side Selection:**
  - Choose from different side items (e.g., fries, onion rings, salad).

- **Price Calculation:**
  - Automatically calculates the total price of the meal based on selected items, sizes, and toppings.
  
- **Itemized Receipt:**
  - Prints an itemized list showing the individual prices of each item and the total cost.

## Classes

- **`MealOrder`:**
  - Represents a meal order consisting of a burger, a drink, and a side item.
  - Provides methods to set the drink size, add toppings to the burger, and calculate the total price.
  - Includes a method to print an itemized list of the meal order.

- **`Burger`:**
  - Extends the `Item` class, representing a burger.
  - Supports the addition of up to three toppings, each with a price adjustment based on the type of topping.
  - Overrides methods to include the name and adjusted price of the burger with toppings.

- **`Item`:**
  - A base class representing an individual item in the meal (e.g., a burger, drink, or side).
  - Contains properties for the item type, name, base price, and size.
  - Provides methods for getting the name, base price, and adjusted price based on size.
  - Includes a static method for printing formatted item information.

## Example Usage

The application creates seven different meal orders, showcasing various combinations of burgers, drinks, sides, and toppings. Each order is printed with an itemized list and the total price.

```java
public class Main {
    public static void main(String[] args) {
        // Example meal orders (see the full Main class in the source code)
        MealOrder order1 = new MealOrder();
        order1.printItemizedList();

        MealOrder order2 = new MealOrder("chicken", "coke", "onion rings");
        order2.setDrinkSize("SMALL");
        order2.printItemizedList();

        // ... Additional meal orders

        MealOrder order7 = new MealOrder("basic beef", "lemonade", "coleslaw");
        order7.addBurgerToppings("cheese", "bacon", "onion");
        order7.printItemizedList();
    }
}
