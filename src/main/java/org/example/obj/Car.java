package org.example.obj;

public class Car {
    private String brand;
    private String model;
    private int yearOfProduction;
    private int price;

    public Car(String model, int yearOfProduction, int price) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
    }
}
