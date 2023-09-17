package decoratorPattern2;

import java.util.ArrayList;

public class CarOptionFirst extends CarOptionPrint {

    public CarOptionFirst(Car car) {
        this.car = car;
        this.car.getDescription().remove("네비게이션");
        this.car.getDescription().remove("파노라마 썬루프");
    }

    @Override
    public ArrayList<String> getDescription() {
        this.car.getDescription().add("1번옵션");
        return this.car.getDescription();
    }
}
