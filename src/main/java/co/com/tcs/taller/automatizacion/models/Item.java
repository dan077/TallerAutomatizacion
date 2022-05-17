package co.com.tcs.taller.automatizacion.models;

public class Item {
    private String name;
    private Double price;
    private int numberOfItems;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public Item(String name, Double price, int numberOfItems) {
        this.name = name;
        this.price = price;
        this.numberOfItems = numberOfItems;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", numberOfItems=" + numberOfItems +
                '}';
    }
}
