package decoratorPattern2;

import java.util.ArrayList;

public abstract class CarOptionPrint extends CarOptionDecorator {

    Car car;

    public abstract ArrayList<String> getDescription();

    @Override
    public double cost() {
        return car.cost();
    }
}
