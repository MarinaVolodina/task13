package ru.volodina.firstproject.task13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ivan", "Petrov", 7));
        persons.add(new Person("Boris", "Kim", 47));
        persons.add(new Person("Oleg", "Karasev", 20));
        persons.add(new Person("Petr", "Verov", 33));
        persons.add(new Person("Roman", "Karamichev", 16));

        Collections.sort(persons, new PersonComparator());

        for (Person person : persons) {
            System.out.println(person);
        }
        persons.forEach(System.out::println);
    }
}
