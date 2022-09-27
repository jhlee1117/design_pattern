package templatePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    public void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    @Override
    public void addCondiments()
    {
        System.out.println("우유와 설탕을 추가하는 중");
    }

    public boolean customerWantsCondiments() throws IOException {

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() throws IOException {

        String answer = null;
        System.out.println("커피에 우유와 설탕을 넣을까요? (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        answer = in.readLine();

        if (answer == null) {
            return "no";
        }
        return answer;
    }

}
