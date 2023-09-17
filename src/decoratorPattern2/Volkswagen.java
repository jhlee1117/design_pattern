package decoratorPattern2;

import java.util.ArrayList;

public class Volkswagen extends Car{

    public Volkswagen() {
        description = new ArrayList<>();
        description.add("폭스바게 아테온 기본");
    }

    @Override
    public double cost() {
        return 44230;
    }
}