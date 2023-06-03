package p08constructorStaticMethods;

public class Car {

    public Car(){
        System.out.println("Car constructor 1");
    }

    String make = "Toyota";
    String model = "Prius";
    int year = 2020;
    int price = 20000;


    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
