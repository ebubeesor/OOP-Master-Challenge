public class Item {
    private String name, type, size;
    private double price;


    public Item(String name, String type, String size, double price) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.price = price;
    }

//    Topping Contstructor
    public Item(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.size = "N/A";
    }

    public void setSize(String size){
        this.size = size;
    }
    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        if (type.equalsIgnoreCase("drink") || type.equalsIgnoreCase("side")) {
            return switch (size) {
                case "S" -> price * 0.8;
                case "L" -> price * 1.2;
                default -> price;
            };
        } else {
            return 0;
        }

    }

    public void printItem() {
        System.out.printf("""
                %s %s
                Size: %s%n""", name, type, size);
    }
}
