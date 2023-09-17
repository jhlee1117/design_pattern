package decoratorPattern2;

import java.util.ArrayList;

public class Benz extends Car{

    public Benz() {
        description = new ArrayList<>();
        description.add("벤츠 E클래스 기본");
    }

    // 상위 클래스의 메서드를 오버라이딩
    @Override
    public double cost() {
        return 56750;
    }
}