package strategyPattern2;

public class CarOpenAuto implements CarOpenType {
    public void push() {
        System.out.println("차가 자동으로 밀려 열린다.");
    }
    public void pull() {
        System.out.println("차가 자동으로 당겨 열린다.");
    }

    public void show() {
        System.out.println("썬루프가 올라간다");
    }

}
