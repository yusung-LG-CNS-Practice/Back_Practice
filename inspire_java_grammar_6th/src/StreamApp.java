import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import features.lambda.InspireFunction;

// 8월 18일 실습 코드
public class StreamApp {
    public static void main(String[] args) {
        InspireFunction func01 = (x,y) -> x > y ? x : y;
        System.out.println(func01.max(100, 200));

        System.out.println();
        InspireFunction func02 = (x, y) -> x + y;
        System.out.println(func02.max(100, 200));

        System.out.println();
        System.out.println("debug >>>> Supplier");
        Supplier<String> supplier = () -> "inspire";
        System.out.println(supplier.get());

        System.out.println();
        System.out.println("debug >>>> Consumer");
        Consumer<String> consumer = (str) -> System.out.println(str.split(" ")[1]);
        consumer.accept("lgcns inspire");
        // consumer.andThen(System.out::println).accept("lgcns insprie");

        System.out.println();
        System.out.println("debug >>>> Function");
        // Function<String, Integer> function = (str) -> str.length();
        Function<String, Integer> function = (str) -> {
            return str.length();
        };
        int len = function.apply("lgcns inspire 6th camp(feat. jslim)");
        System.out.println(len);
    }
}
