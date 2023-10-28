package org.example.obj;

public class GasCar extends Car {
    private double gasPerHundredKm;
    private double gasPerHundredKmInCity;

    public GasCar(String model, int yearOfProduction, int price, double gasPerHundredKm, double gasPerHundredKmInCity) {
        super(model, yearOfProduction, price);
        this.gasPerHundredKm = gasPerHundredKm;
        this.gasPerHundredKmInCity = gasPerHundredKmInCity;
    }
}
