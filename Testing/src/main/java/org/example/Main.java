package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Person> people = new ArrayList<>();
        people.add(new Person(30, "Anna"));
        people.add(new Person(20, "Maria"));
        people.add(new Person(60, "Olya"));
        people.stream()
                .sorted((e1, e2) -> -e1.compareTo(e2))
                .forEach(System.out::println);


    }


}