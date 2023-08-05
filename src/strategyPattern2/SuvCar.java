package strategyPattern2;

import strategyPattern2.Car;

public class SuvCar extends Car {
    public SuvCar(boolean autoYN) {
        super.setAutoYN(autoYN);
        carOpenType = super.getAutoYN() ? new CarOpenAuto() : new CarOpenManual();
    }

    public void display() {
        System.out.println("최신식 Suv 자동차");
    }

}
