package decoratorPattern2;


import java.util.ArrayList;

public class PanoramaRoof extends CarOptionDecorator{

    public PanoramaRoof(Car car) {
        this.car = car;
        this.car.getDescription().add("파노라마 썬루프");
    }

    @Override
    public double cost() {
        return car.cost() + 3000;
    }

    @Override
    public ArrayList<String> getDescription() {
        return this.car.getDescription();
    }
}