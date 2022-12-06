package decoratorPattern;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    private StringBuilder descBuilder = new StringBuilder();

    private static final String MENU_NAME = ", 모카";

    @Override
    public double cost() {
        switch (beverage.getSize()) {
            case TALL:
                return beverage.cost() + .30;
            case VENTI:
                return beverage.cost() + .40;
            case GRANDE:
                return beverage.cost() + .50;
            default:
                return beverage.cost() + .20;
        }
    }

    @Override
    public String getDescription() {
        descBuilder.append(beverage.getDescription());
        switch (beverage.getSize()) {
            case TALL:
                descBuilder.append(MENU_NAME);
                break;
            case VENTI:
                descBuilder.append(MENU_NAME);
                descBuilder.append(MENU_NAME);
                break;
            case GRANDE:
                descBuilder.append(MENU_NAME);
                descBuilder.append(MENU_NAME);
                descBuilder.append(MENU_NAME);
                break;
            default:
                descBuilder.append(MENU_NAME);
                break;
        }
        return descBuilder.toString();
    }
}
