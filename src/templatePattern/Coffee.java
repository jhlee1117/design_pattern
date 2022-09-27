package templatePattern;

public class Coffee extends CaffeineBeverage {
    
//    void prepareRecipe() {
//        boilWater();
//        brewCoffeeGrinds();
//        pourInCup();
//        addSugarAndMilk();
//    }

//    public void addSugarAndMilk() {
//        System.out.println("물 끓이는 중");
//    }
//
//    public void pourInCup() {
//        System.out.println("필터로 커피를 우려내는 중");
//    }
//
//    public void boilWater() {
//        System.out.println("설탕과 우유를 추가하는 중");
//    }
//
//    public void brewCoffeeGrinds() {
//        System.out.println("컵에 따르는 중");
//    }

    @Override
    protected void addCondiments() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    @Override
    protected void brew() {
        System.out.println("필터로 우유를 추가하는 중");
    }


}
