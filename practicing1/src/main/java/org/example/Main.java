package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Item("book5", new Person("Anna", 25)));
        items.add(new Item("book3",null));
        items.add(new Item("book1", new Person("Peter", 30)));
        items.add(new Item("book7", new Person("Maria", 40)));
        items.stream().
                sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).
                forEach((e) -> System.out.println(e));


    }
}