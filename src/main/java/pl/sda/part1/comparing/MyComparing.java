package pl.sda.part1.comparing;

/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 19.09.2020
 */
public class MyComparing {
    public static int commparePersonsSecondLetter(Person one, Person two){
        return one.getSurname().substring(1).compareTo(two.getSurname().substring(1));
    }
}
