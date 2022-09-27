package templatePattern;

public class Tea extends CaffeineBeverage {

//    void prepareRecipe() {
//        boilWater();
//        steepTeaBag();
//        pourInCup();
//        addLemon();
//    }
//
//    public void addLemon() {
//        System.out.println("레몬을 추가하는 중");
//    }
//
//    public void pourInCup() {
//        System.out.println("컵에 따르는 중");
//    }
//
//    public void steepTeaBag() {
//        System.out.println("찻잎을 우려내는 중");
//    }
//
//    public void boilWater() {
//        System.out.println("컵에 따르는 중");
//    }

    @Override
    protected void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }

    @Override
    protected void brew() {
        System.out.println("찻잎을 우려내는 중");
    }

}
