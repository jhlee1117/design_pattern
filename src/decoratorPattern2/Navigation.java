package decoratorPattern2;

import java.util.ArrayList;

public class Navigation extends CarOptionDecorator{

    public Navigation(Car car) {
        this.car = car;
        this.car.getDescription().add("네비게이션");
    }

    @Override
    public double cost() {
        return car.cost() + 300;
    }

    @Override
    public ArrayList<String> getDescription() {
        return this.car.getDescription();
    }
}