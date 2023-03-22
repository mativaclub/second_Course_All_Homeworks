package OOP_1Homework;
public class Main {

public static void main(String[] args) {

    Service[] vehicleAtServiceStation = new Service[] {

            new Car("car1", 4),
            new Car("car2", 4),

            new Truck("truck1", 6),
            new Truck("truck2", 8),

            new Bicycle("bicycle1", 2),
            new Bicycle("bicycle2", 2),

    };


    ServiceStation station = new ServiceStation();
    for (Service vehicle : vehicleAtServiceStation) {
        station.check(vehicle);
        
    }
//package ru.skypro;
//
//public class Bicycle extends Vehicle{
//
//    public Bicycle(String modelName, int wheelsCount) {
//        super(modelName, wheelsCount);
//    }
//
//}
// 10
//src/ru/skypro/Car.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,10 @@
//package ru.skypro;
//
//    public class Car extends Vehicle{
//
//        public Car(String modelName, int wheelsCount) {
//            super(modelName, wheelsCount);
//        }
//
//    }
//
//  21
//src/ru/skypro/Main.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -3,6 +3,23 @@
//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
//    }
//
//            Car car = new Car("car1", 4);
//            Car car2 = new Car("car2", 4);
//
//            Truck truck = new Truck("truck1", 6);
//            Truck truck2 = new Truck("truck2", 8);
//
//            Bicycle bicycle = new Bicycle("bicycle1", 2);
//            Bicycle bicycle2 = new Bicycle("bicycle2", 2);
//
//            ServiceStation station = new ServiceStation();
//            station.check(car, null, null);
//            station.check(car2, null, null);
//            station.check(null, bicycle, null);
//            station.check(null, bicycle2, null);
//            station.check(null, null, truck);
//            station.check(null, null, truck2);
//        }
//
//}
// 46
//src/ru/skypro/Service.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,46 @@
//package ru.skypro;
//
//public class Service {
//
//    public void updateTyre() {
//        System.out.println("Меняем покрышку");
//    }
//
//    public void checkEngine() {
//        System.out.println("Проверяем двигатель");
//    }
//
//    public void checkTrailer() {
//        System.out.println("Проверяем прицеп");
//    }
//
//
//    void printVehicle(Vehicle car) {
//        System.out.println("Обслуживаем " + car.getModelName());
//        for (int i = 0; i < car.getWheelsCount(); i++) {
//            updateTyre();
//        }
//        checkEngine();
//        System.out.println();
//    }
//
//    void printVehicle2(Vehicle truck) {
//        System.out.println("Обслуживаем " + truck.getModelName());
//        System.out.println();
//        for (int i = 0; i < truck.getWheelsCount(); i++) {
//            updateTyre();
//        }
//        System.out.println();
//        checkEngine();
//        System.out.println();
//    }
//
//    void printVehicle3(Vehicle bicycle) {
//        System.out.println("Обслуживаем " + bicycle.getModelName());
//        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
//            updateTyre();
//        }
//        System.out.println();
//    }
//
//}
// 18
//src/ru/skypro/ServiceStation.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,18 @@
//package ru.skypro;
//
//public class ServiceStation extends Service {
//    public void check(Car car, Bicycle bicycle, Truck truck) {
//        if (car != null) {
//            printVehicle(car);
//
//        } else if (truck != null) {
//            printVehicle2(truck);
//            checkTrailer();
//            System.out.println();
//
//        } else if (bicycle != null) {
//            printVehicle3(bicycle);
//        }
//    }
//    }
//
// 9
//src/ru/skypro/Truck.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,9 @@
//package ru.skypro;
//
//public class Truck extends Vehicle {
//
//    public Truck(String modelName, int wheelsCount) {
//        super(modelName, wheelsCount);
//    }
//
//}
// 19
//src/ru/skypro/Vehicle.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,19 @@
//package ru.skypro;
//
//public class Vehicle {
//    public String modelName;
//    public int wheelsCount;
//
//    public Vehicle(String modelName, int wheelsCount) {
//        this.modelName = modelName;
//        this.wheelsCount = wheelsCount;
//    }
//
//    public String getModelName() {
//        return modelName;
//    }
//
//    public int getWheelsCount() {
//        return wheelsCount;
//    }
//}
}
}




