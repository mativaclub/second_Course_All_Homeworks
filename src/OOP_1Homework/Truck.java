package OOP_1Homework;

public class Truck extends Vehicle implements Service{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Checking Trailer");
    }

    public void checkEngine() {
        System.out.println("Checking Engine");
    }

    @Override
    public void service() {
        System.out.println("On duty");
        updateTyre();
        checkEngine();
        checkTrailer();
    }

}
