package pro.sky.lambda_and_functional_interface;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Solution {


    static Predicate<Integer> yesOrNot() {
        return o->o > 0;
    }

    static Consumer<String> sayHello() {
        return name -> System.out.println("Hello," + name + "!");
    }
}
