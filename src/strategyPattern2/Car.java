package strategyPattern2;

public abstract class Car {

    CarOpenType carOpenType;
    private boolean autoYN;
    public Car() {
    }

    public void run() {
        System.out.println("차가 굴러간다");
    };

    public void open() {
        carOpenType.push();
        carOpenType.pull();
    };

    public void horn() {
        System.out.println("경적을 울리다");
    }

    public void setAutoYN(boolean autoYN) {
        this.autoYN = autoYN;
    };

    public boolean getAutoYN() {
        return autoYN;
    }

    public void setCarOpenType(CarOpenType cot) {
        carOpenType = cot;
    }

    public abstract void display();
}
