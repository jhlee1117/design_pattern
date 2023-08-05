package strategyPattern2;

public class CarSimulator {

    public static void main(String[] args) {
        Car car = new SuvCar(true);
        car.display();
        car.run();
        car.open();

        Car classicCar = new Chariot();
        classicCar.display();
        classicCar.open();
        System.out.println("개조 후");
        classicCar.setCarOpenType(new CarOpenManual());
        classicCar.open();
    }
}
