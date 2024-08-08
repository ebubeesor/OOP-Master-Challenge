public class Burger extends Item {
    private Item extra1, extra2, extra3;
    private Item extra4, extra5;

    public Burger(String type, double price) {
        super("Burger", type, "N/A", price);
    }

    public void addToppings(Item extra1, Item extra2, Item extra3) {
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
    }

    public void addToppings(Item extra1, Item extra2, Item extra3, Item extra4, Item extra5) {
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
        this.extra4 = extra4;
        this.extra5 = extra5;
    }

    public double getToppingPrice(Item topping) {
        return topping.getBasePrice();
    }

    public double totalToppingPrice() {

        double total = extra1.getBasePrice() + extra2.getBasePrice() + extra3.getBasePrice();
//
       return (total != null) ? total : 0;
    }


    public Item top1() {
        return extra1;
    }

    public Item top2() {
        return extra2;
    }

    public Item top3() {
        return extra3;
    }

    public Item top4() {
        return extra4;
    }

    public Item top5() {
        return extra5;
    }

}
