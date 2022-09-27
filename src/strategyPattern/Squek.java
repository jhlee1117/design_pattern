package strategyPattern;

public class Squek implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
