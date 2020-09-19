package pl.sda.part1.comparing;

import java.util.List;

/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 19.09.2020
 */
public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    static int orderPerson(Person one, Person two){
        return one.name.compareTo(two.name);
    }

    public static void main(String[] args) {
        List<Person> persons = List.of(new Person("dfhfh", "hshsdh"), new Person("dgdgd", "djhf"));

     //   persons.sort((o1,o2)->Person.orderPerson(o1,o2));
        persons.sort(Person::orderPerson);

     //   persons.sort((o1,o2)-> MyComparing.commparePersonsSecondLetter(o1,o2));
        persons.sort(MyComparing::commparePersonsSecondLetter);

    }
}
