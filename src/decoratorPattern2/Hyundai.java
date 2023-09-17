package decoratorPattern2;

import java.util.ArrayList;

public class Hyundai extends Car{

    public Hyundai() {
        description = new ArrayList<>();
        description.add("현대 그랜저 기본");
    }

    @Override
    public double cost() {
        return 28960;
    }
}