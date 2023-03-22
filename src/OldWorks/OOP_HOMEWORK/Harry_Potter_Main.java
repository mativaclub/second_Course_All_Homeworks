package OldWorks.OOP_HOMEWORK;

public class Harry_Potter_Main {

    public static void main(String[] args) {
//""


        Hogwarts harry = new Gryffindor("Harry Potter", 79, 77,
                75, 73, 71);
        Hogwarts hermione = new Gryffindor("Hermione Granger", 89, 87,
                85, 83, 81);
        Hogwarts ron = new Gryffindor("Ron Wizli", 69, 67,
                65, 63, 61);


        Slytherin draco = new Slytherin("Draco Malfoy", 78, 76,
                74, 72, 70, 72, 74);
        Slytherin graham = new Slytherin("Graham Montague", 88, 86,
                84, 82, 80, 82, 84);
        Slytherin gregory = new Slytherin("Gregory goyle", 68, 66,
                64, 62, 60, 62, 64);


        Hufflepuff zaharia = new Hufflepuff("Zaharia Smith", 99, 97,
                95, 93, 91);
        Hufflepuff cedric = new Hufflepuff("Cedric Diggory", 98, 96,
                94, 92, 90);
        Hufflepuff justin = new Hufflepuff("Justin Finch-Fletchley", 59, 57,
                55, 53, 51);


        Ravenclaw joe = new Ravenclaw("Joe Chang", 58, 56, 54,
                52, 50, 50);
        Ravenclaw padma = new Ravenclaw("Padma Patil", 48, 46, 44,
                42, 40, 40);
        Ravenclaw marcus = new Ravenclaw("Marcus Belby", 38, 36, 34,
                32, 30, 30);


        harry.compareStudents(draco);
        System.out.println(harry);

        harry.compareStudents(hermione);
        System.out.println(harry);

        zaharia.compareHufflepuff(cedric);
        System.out.println(zaharia);



    }
}

























