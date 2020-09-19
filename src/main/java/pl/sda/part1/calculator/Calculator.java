package pl.sda.part1.calculator;

import java.util.Optional;

/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 19.09.2020
 */
final class Calculator {

    @FunctionalInterface
    interface Add {
        Double add(Double a, Double b);
    }

    class AddCl implements Add {
        @Override
        public Double add(Double a, Double b) {
            return a + b;
        }
    }

    @FunctionalInterface
    interface Substract {
        Double substract(Double a, Double b);
    }

    class SubstractCl implements Substract {
        @Override
        public Double substract(Double a, Double b) {
            return a - b;
        }
    }

    @FunctionalInterface
    interface Multiply {
        Double multiply(Double a, Double b);
    }

    class multiplyCl implements Multiply {

        @Override
        public Double multiply(Double a, Double b) {
            return a * b;
        }
    }

    @FunctionalInterface
    interface Divide {
        Double divide(Double a, Double b);
    }

    class DivideCl implements Divide {

        @Override
        public Double divide(Double a, Double b) {
            return a / b;
        }
    }

    static Optional<String> getNickWithOptional() {
        return Optional.ofNullable("something");
    }


    public static void main(String[] args) {

//1.
        Add adder = (Double a, Double b) -> {
            return a + b;
        };

        Substract substract = (Double a, Double b) -> {
            return a - b;
        };

//2.
        GenericAdd<Integer> genericAdd = (a, b) -> a + b;

//3.
        getNickWithOptional()
                .map(s -> s.length())
                .ifPresent(integer -> System.out.println("Nick lenght: " + integer));
    }
}

