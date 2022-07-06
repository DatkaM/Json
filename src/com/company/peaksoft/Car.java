package com.company.peaksoft;

public class Car{
    private String country;
    private Type type;


    public Car(String country, Type type) {
        this.country = country;
        this.type = type;
    }

    public Car() {
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setCountry(String country){
        this.country = country;
    }
    public String getCountry(){
        return country;
    }

    public static Car method(String country, Type type){
        Car car = new Car();
        car.country = country;
        car.type = type;
        return car;
    }

    public Car method2(String country, Type type){
        Car car = new Car();
        car.country = country;
        car.type = type;
        return car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "country='" + country + '\'' +
                ", type=" + type +
                '}';
    }
}
