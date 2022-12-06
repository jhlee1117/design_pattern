package decoratorPattern;

public abstract class Beverage {

    String description = "제목 없음";
    public enum Size { TALL, GRANDE, VENTI }
    Size size = Size.TALL;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }
}
