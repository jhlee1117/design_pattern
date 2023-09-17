package decoratorPattern2;

import java.util.ArrayList;

public class BMW extends Car{

    public BMW() {
        description = new ArrayList<>();
        description.add("BMW 5시리즈 기본");
    }

    @Override
    public double cost() {
        return 51526;
    }
}