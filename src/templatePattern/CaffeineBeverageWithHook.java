package templatePattern;

import java.io.IOException;

public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() throws IOException {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    protected void boilWater() {
        System.out.println("물 끓이는 중");
    };

    protected void pourInCup() {
        System.out.println("컵에 따르는 중");
    };

    boolean customerWantsCondiments() throws IOException {
        return true;
    };

}
