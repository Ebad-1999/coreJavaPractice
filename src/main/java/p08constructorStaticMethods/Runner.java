package p08constructorStaticMethods;

public class Runner {

    public Runner() {
    }

    public static void main(String[] args) {

        Car audi = new Car();
        System.out.println(audi.model);
        System.out.println(audi.make);


        Car bmw = new Car("BMW", "M5", 2021, 33333);
        System.out.println(bmw.year);


        Car itCar = new Car("Rolls Royce", "Cullin-an", 2024);
        System.out.println(itCar.make +" "+itCar.model+" " + itCar.year);



        Static01 obj1 = new Static01();
        Static01 obj2 = new Static01();
        Static01 obj3 = new Static01();

        System.out.println(obj3.nonStaticCounter);

        System.out.println( obj3.staticCounter);

    }

}
