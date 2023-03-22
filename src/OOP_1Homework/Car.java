package OOP_1Homework;

public class Car extends Vehicle implements Service{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Checking an engine");
    }

    public void service() {
        System.out.println("On duty");
        updateTyre();
        checkEngine();
    }
}