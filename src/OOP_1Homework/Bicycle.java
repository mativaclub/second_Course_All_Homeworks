package OOP_1Homework;


public class Bicycle extends Vehicle implements Service{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("On duty" + getModelName());
        updateTyre();
    }



    public void checkEngine() {

    }

    public void checkTrailer() {

    }

    public void printVehicle(Vehicle car) {

    }

    public void printVehicle2(Vehicle truck) {

    }

    public void printVehicle3(Vehicle bicycle) {

    }
}
