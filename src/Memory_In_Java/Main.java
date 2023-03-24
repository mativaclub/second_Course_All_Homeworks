package Memory_In_Java;

import java.util.Arrays;

public class Main {


    // Задание 5
    public static void changeValue(int value) {
        value = 22;
        System.out.println(value);
    }
//    Т. е. когда мы создаем переменную int a = 5, а затем передаем ее в метод doSmth(a),
//    внутри метода мы работаем уже не с переменной a, а со значением 5.
//    Даже если мы в методе изменим значение, значение внутри переменной a останется прежним.


    //   Задание 6
    public static void changeValue(Integer value) {
        value = 22;
        System.out.println(value);
    }

//Следовательно, при попадании в метод переменная s копируется, подавая в качестве аргумента дубликат
// той ссылки, что есть вне метода.
//В итоге мы получаем две ссылки, одну назовем s, другую s2, которые ссылаются на одну ячейку памяти,
// где хранится строка "abc".
//Но что происходит, если мы присвоим s2 что-то другое, s тоже перезапишется? Нет.
//Так как s и s2 являются копиями, s2 не управляет тем, как работает s, s2 лишь создается как копия s,
// но является абсолютно самостоятельной единицей. Ее изменение никак не повлияет на s.

//String s = "abc";
//doSmth(s);
//System.out.println("s = " + s)
//Вывод будет:
//s = abc
//s2 = bcd
//s = abc

//Если мы не присваиваем s2 новый объект, а лишь меняем текущий, то этот объект меняется и по ссылке s,
// так как s и s2 ссылаются на одну и ту же ячейку памяти, следовательно, на один и тот же объект.


    //  Задание 7
    public static void changeValue(Integer[] value) {
        value = new Integer[]{1, 2};
        System.out.println(Arrays.toString(value));
    }

    //  Задание 8
    public static void changeValue1(Integer[] value) {
        value[0] = 99;
        System.out.println(Arrays.toString(value));
    }










    public static void main(String[] args) {
//        System.out.println("Задание 5");
//        int value = 33;
//        System.out.println(value);
//        changeValue(value);
//        System.out.println(value);
//        System.out.println();

//        System.out.println("Задание 6");
//        Integer value = 33;
//        System.out.println(value);
//        changeValue(value);
//        System.out.println(value);
//        System.out.println();


//        System.out.println("Задание 7");
//        Integer[] value = {3,4};
//        System.out.println(Arrays.toString(value));
//        changeValue(value);
//        System.out.println(Arrays.toString(value));
//        System.out.println();

//        System.out.println("Задание 8");
//        Integer[] value = {3, 4};
//        System.out.println(Arrays.toString(value));
//        changeValue1(value);
//        System.out.println(Arrays.toString(value));
//        System.out.println();


//        System.out.println("Задание 9");
//        Person person = new Person("Lyapis", "Trubetskoy");
//        System.out.println(person);
//        Person.changePerson(person);

//        System.out.println("Задание 10");
//        Person person1 = new Person("Lyapis", "Trubetskoy");
//        System.out.println(person1);
//        Person.changePerson1(person);


//	Book b = new Book("Book1");
//	System.out.println("Book name = " + b.getName());
//doSmth(b);
//System.out.println("Book name = " + b.getName());

//Вывод будет:
//Book name = Book1
//Book name = Book2

//В этом примере книга изменила свое состояние, так как обе ссылки (b и b2) вели на
// одну ячейку в памяти и, изменив ее по b2, мы изменили и то, что лежит в b.



    }
}