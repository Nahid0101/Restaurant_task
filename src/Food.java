public class Food {//construktor
    private String name;
    private double price;
    private String category;

    public Food(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "name =" + name + "\n" +
                "price =" + price + "\n" +
                "category = " + category;
    }


}
