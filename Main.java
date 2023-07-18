package ru.volodina.firstproject.task13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ivan", "Petrov", 7));
        persons.add(new Person("Boris", "Petrov-Vodkin", 47));
        persons.add(new Person("Oleg", "Karasev", 20));
        persons.add(new Person("Petr", "Ivanov-Petrov-Vodkin", 33));
        persons.add(new Person("Roman", "Karamichev", 16));

        Collections.sort(persons, (o1, o2) -> {
            int length1 = o1.getSurname().split("-").length;
            int length2 = o2.getSurname().split("-").length;
            if (length1 < length2) {
                return -1;
            }
            if (length1 > length2) {
                return 1;
            }
            return o1.getAge() - o2.getAge();

        });


        persons.forEach(System.out::println);
    }
}
