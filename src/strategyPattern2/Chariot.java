package strategyPattern2;

public class Chariot extends Car {

    public Chariot() {
        carOpenType = new CarOpenOneWay();
    }

    public void display() {
        System.out.println("고전 클래식 마차");
    }

}
