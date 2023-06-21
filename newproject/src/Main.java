import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Item("book5", new Person("Anna", 25)));
        items.add(new Item("book3", null));
        items.add(new Item("book1", new Person("Peter", 30)));
        items.add(new Item("book7", new Person("Maria", 40)));
        items.stream()
                .sorted(Comparator.comparing(Item::getName))
//                sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).
                .forEach(System.out::println);
        items.stream()
                .sorted((e1, e2) -> -e1.getName().compareTo(e2.getName()))
                .forEach(System.out::println);
        items.stream()
                .filter((item) -> item.getOwner() == null)
                .forEach(System.out::println);


        String[] names = new String[]{"anna","alexandr", "marianna", "Alex", "olga", "Peter", "Anna"};
        Arrays.stream(names).distinct()
                .forEach(System.out::println);
        System.out.println();
        Arrays.stream(names)
                .limit(2)
                .forEach(System.out::println);
        System.out.println();
        Arrays.stream(names)
                .filter((e) -> e.length() > 5)
                .forEach(System.out::println);
        System.out.println();

        Arrays.stream(names)
                .forEach((e)-> System.out.println((e.substring(0,1).toUpperCase() + e.substring(1).toLowerCase())));
        System.out.println();

        Arrays.stream(names)
                .map((e) -> e.substring(0,1).toUpperCase() + e.substring(1).toLowerCase())
                .forEach(System.out::println);
        System.out.println();

        String text = "4521";
//        System.out.println(text.chars().count());
        IntStream intFromText = text.chars();
        System.out.println(intFromText.min());
        
//        System.out.println(intFromText.count());






    }
}