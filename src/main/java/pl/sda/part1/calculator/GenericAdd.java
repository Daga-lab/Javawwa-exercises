package pl.sda.part1.calculator;

/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 19.09.2020
 */

@FunctionalInterface
public interface GenericAdd<T> {
    T add (T a, T b);
}
