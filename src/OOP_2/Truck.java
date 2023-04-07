package OOP_2;

public class Truck extends Car implements Maintainable {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    public void checkTrailer() {
        System.out.println(getModelName() + " Проверяем прицеп");
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }


}


