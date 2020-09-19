package pl.sda.part1;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 19.09.2020
 */
final class Lambdas {

    // @FunctionalInterface
    interface DoubleString {
        String doubleDouble(String value);



    }

    class MyDoubleString implements  DoubleString{

        @Override
        public String doubleDouble(String value) {
            return value+value;
        }
    }

    public static void main(String[] args) {
//1.
        String myName = "Dagmara";
        Optional<String> methodName = Optional.ofNullable(myName);
        methodName.map(e -> e.length());

        methodName.map(new StringMapper());


//2.
        Function<String, Integer> changeStringToLenght = x -> Integer.parseInt(String.valueOf(x.length()));
        Stream.of("Ania", "Tomek")
                .map(changeStringToLenght)
                .forEach(System.out::println);

//3.
        Function<String, Integer> methodThird = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

//4.
        DoubleString doubleString = e -> e + e;

        doubleString.doubleDouble(myName);



    }

    static class StringMapper implements Function<String, Integer> {
        @Override
        public Integer apply(String s) {
            return s.length();
        }
    }

}
