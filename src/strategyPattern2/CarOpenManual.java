package strategyPattern2;

public class CarOpenManual implements CarOpenType {

    public void push() {
        System.out.println("차가 수동으로 밀어야 열린다.");
    }

    public void pull() {
        System.out.println("차가 수동으로 당겨야 열린다.");
    }

}
