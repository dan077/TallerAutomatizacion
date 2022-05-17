package co.com.tcs.taller.automatizacion.models;

import cucumber.api.java.eo.Do;

import java.util.Objects;

public class Item {
    private String name;
    private Double pricePerUnit;
    private int numberOfItems;

    private double total;

    public Item(String name, Double price, int numberOfItems) {
        this.name = name;
        this.pricePerUnit = price;
        this.numberOfItems = numberOfItems;
        this.total = price*numberOfItems;
    }

    public Item(String name, Double price, int numberOfItems, Double total) {
        this.name = name;
        this.pricePerUnit = price;
        this.numberOfItems = numberOfItems;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(Double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }



    public Boolean compare(Item otherItem){
        return otherItem.name.equals(name) && otherItem.numberOfItems == otherItem.numberOfItems && otherItem.total == total;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", pricePerUnit=" + pricePerUnit +
                ", numberOfItems=" + numberOfItems +
                ", total=" + total +
                '}';
    }


}
