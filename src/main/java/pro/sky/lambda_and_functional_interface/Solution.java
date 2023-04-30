package pro.sky.lambda_and_functional_interface;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Solution {


    static Predicate<Integer> yesOrNot() {
        return o->o > 0;
    }

    static Consumer<String> sayHello() {
        return name -> System.out.println("Hello," + name + "!");
    }

    static Function<Double, Long> longFromDouble() {
        return  Double::longValue;
    }

    static Supplier<Integer> randomNumber() {
        return () -> new Random().nextInt(100);
    }

    static class Thriller extends Genre {
        protected Thriller(String title) {
            super(title);
        }
    }

    static class Drama extends Genre {
        public Drama(String title) {
            super(title);
        }
    }

    static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super  T> predicate,
            Function<? super T, ? extends  U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return t -> predicate.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
    }

    static void dramaOfThriller(Genre genre) {
        System.out.println(
                ternaryOperator(
                        (Predicate<Genre>) genre13 -> !(genre13 instanceof Drama),
                        gener12 -> "Это триллер" + gener12.toString(),
                        genre1 -> "Это драма" + genre1.toString()).apply(genre)
        );
    }

    public static void main(String[] args) {

    }
}
