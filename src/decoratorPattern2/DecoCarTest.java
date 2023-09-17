package decoratorPattern2;

public class DecoCarTest {

    public static void main(String[] args) {
        Car car = new Hyundai();
        System.out.println(car.getDescription() + " $" + car.cost());

        Car car2 = new BMW();
//        car2 = new CarOptionFirst(car2);
        car2 = new PanoramaRoof(car2);
        car2 = new Navigation(car2);
        System.out.println(car2.getDescription() + " $" + car2.cost());


    }
}
