package strategyPattern2;

public class CarOpenOneWay implements CarOpenType {
    @Override
    public void push() {
        System.out.println("한 방향으로만 밀어서 열립니다.");
    }

    @Override
    public void pull() {
        System.out.println("한 방향으로만 당겨서 열립니다.");
    }
}
