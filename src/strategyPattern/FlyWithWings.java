package strategyPattern;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("오리 날다!!!");
    }
}
