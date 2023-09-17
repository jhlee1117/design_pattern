package decoratorPattern2;

import java.util.ArrayList;

// 만약 차를 만들고 그에 대한 옵션을 추가한다고 하면
public abstract class Car {

    ArrayList<String> description;

    public ArrayList<String> getDescription() {
        return description;
    }

    // 공통 메서드는 하위 객체에서 계산할 수 있도록 사용한다.
    public abstract double cost();
}