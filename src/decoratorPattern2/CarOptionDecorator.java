package decoratorPattern2;

import java.util.ArrayList;

// 추상 클래스로 상속하기 때문에 직접 cost()를 오버라이딩하는 건 아니다
public abstract class CarOptionDecorator extends Car {

    Car car;

    public abstract ArrayList<String> getDescription();

}
