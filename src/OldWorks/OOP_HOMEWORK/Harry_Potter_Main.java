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
//package ru.skypro;
//
//public class Griffindor extends Hogwarts {
//    private final int nobility;
//    private final int honour;
//    private final int bravery;
//
//    public Griffindor(String name, int powerOfMagic, int distanceOfTransgression,
//                      int nobility, int honour, int bravery) {
//        super(name, powerOfMagic, distanceOfTransgression);
//        this.nobility = nobility;
//        this.honour = honour;
//        this.bravery = bravery;
//    }
//
//    public int getNobility() {
//        return nobility;
//    }
//
//    public int getHonour() {
//        return honour;
//    }
//
//    public int getBravery() {
//        return bravery;
//    }
//
//    @Override
//    public String toString() {
//        System.out.println(super.toString());
//        return "Nobility of Student is " + nobility + ", honour is " + honour + ", bravery is " + bravery;
//    }
//
//    public void compareGriffindor(Griffindor student) {
//        super.compareStudents(student);
//
//        if (this.nobility > student.getNobility()) {
//            System.out.println("Nobility " + this.getName() + " is higher then " + student.getName());
//        } else if (this.nobility == student.getNobility()) {
//            System.out.println("Nobility " + this.getName() + " and " + student.getName() + " are equal");
//        } else {
//            System.out.println("Nobility " + this.getName() + " is lower then " + student.getName());
//        }
//
//        if (this.honour > student.getHonour()) {
//            System.out.println("Honour " + this.getName() + " is higher then " + student.getName());
//        } else if (this.honour == student.getHonour()) {
//            System.out.println("Honour " + this.getName() + " and " + student.getName() + " are equal");
//        } else {
//            System.out.println("Honour " + this.getName() + " is lower then " + student.getName());
//        }
//
//
//        if (this.bravery > student.getBravery()) {
//            System.out.println("Bravery " + this.getName() + " is higher then " + student.getName());
//        } else if (this.bravery == student.getBravery()) {
//            System.out.println("Bravery " + this.getName() + " and " + student.getName() + " are equal");
//        } else {
//            System.out.println("Bravery " + this.getName() + " is lower then " + student.getName());
//        }
//    }
//}
//
// 50
//src/ru/skypro/Hogwarts.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,50 @@
//package ru.skypro;
//
//public class Hogwarts {
//    private final String name;
//    private final int powerOfMagic;
//    private final int distanceOfTransgression;
//
//    public Hogwarts(String name, int powerOfMagic, int distanceOfTransgression) {
//        this.name = name;
//        this.powerOfMagic = powerOfMagic;
//        this.distanceOfTransgression = distanceOfTransgression;
//    }
//
//    @Override
//    public String toString() {
//        return "Student" + name + " have a power of magic " + powerOfMagic +
//                " and can transgress to the distance " + distanceOfTransgression;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getPowerOfMagic() {
//        return powerOfMagic;
//    }
//
//    public int getDistanceOfTransgression() {
//        return distanceOfTransgression;
//    }
//
//
//    public void compareStudents(Hogwarts student) {
//        if (this.powerOfMagic > student.getPowerOfMagic()) {
//            System.out.println("Magic power " + this.name + " is higher then " + student.getName());
//        } else if (this.powerOfMagic == student.getPowerOfMagic()) {
//            System.out.println("Magic power " + this.getName() + " and " + student.getName() + " are equal");
//        } else {
//            System.out.println("Magic power " + this.name + " is lower then " + student.getName());
//        }
//
//    if (this.distanceOfTransgression > student.getDistanceOfTransgression()) {
//        System.out.println("Distance Of Transgression " + this.name + " is higher then " + student.getName());
//    } else if (this.distanceOfTransgression == student.getDistanceOfTransgression()) {
//        System.out.println("Distance Of Transgression " + this.getName() + " and " + student.getName() + " are equal");
//    } else {
//        System.out.println("Distance Of Transgression " + this.name + " is lower then " + student.getName());
//    }
//}
//}
// 71
//src/ru/skypro/Kogtevran.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,71 @@
//package ru.skypro;
//
//public class Kogtevran extends Hogwarts {
//    private final int clever;
//    private final int wise;
//    private final int witty;
//    private final int fullOfCreativity;
//
//
//    public Kogtevran(String name, int powerOfMagic, int distanceOfTransgression,
//                     int clever, int wise, int witty, int fullOfCreativity) {
//        super(name, powerOfMagic, distanceOfTransgression);
//        this.clever = clever;
//        this.wise = wise;
//        this.witty = witty;
//        this.fullOfCreativity = fullOfCreativity;
//    }
//
//    public int getClever() {
//        return clever;
//    }
//
//    public int getWise() {
//        return wise;
//    }
//
//    public int getWitty() {
//        return witty;
//    }
//
//    public int getFullOfCreativity() {
//        return fullOfCreativity;
//    }
//
//    public void compareKogtevran(Kogtevran student) {
//        super.compareStudents(student);
//        if (this.clever > student.getClever()) {
//            System.out.println("Clever " + this.getName() + " is higher then " + student.getName());
//        } else if (this.clever == student.getClever()) {
//            System.out.println("Clever " + this.getName() + " and " + student.getName() + " are equal");
//        } else {
//            System.out.println("Clever " + this.getName() + " is lower then " + student.getName());
//        }
//
//        if (this.wise > student.getWise()) {
//            System.out.println("Wise " + this.getName() + " is higher then " + student.getName());
//        } else if (this.wise == student.getWise()) {
//            System.out.println("Wise " + this.getName() + " and " + student.getName() + " are equal");
//        } else {
//            System.out.println("Wise " + this.getName() + " is lower then " + student.getName());
//        }
//
//        if (this.witty > student.getWitty()) {
//            System.out.println("Witty " + this.getName() + " is higher then " + student.getName());
//        } else if (this.witty == student.getWitty()) {
//            System.out.println("Witty " + this.getName() + " and " + student.getName() + " are equal");
//        } else {
//            System.out.println("Witty " + this.getName() + " is lower then " + student.getName());
//        }
//
//
//        if (this.fullOfCreativity > student.getFullOfCreativity()) {
//            System.out.println("Creativity " + this.getName() + " is higher then " + student.getName());
//        } else if (this.fullOfCreativity == student.getFullOfCreativity()) {
//            System.out.println("Creativity " + this.getName() + " and " + student.getName() + " are equal");
//        } else {
//            System.out.println("Creativity " + this.getName() + " is lower then " + student.getName());
//        }
//    }
//}
//
//  48
//src/ru/skypro/Main.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -3,8 +3,50 @@
//public class Main {
//
//    public static void main(String[] args) {
////        PersonService personService = new PersonService();
////        Person sarah = new Person();
//
//        Griffindor harry = new Griffindor("Гарри Поттер", 90,90,
//                90,90, 90);
//        Griffindor germiona = new Griffindor("Гермиона Грейнджер", 80,80,
//                80,80, 80);
//        Griffindor ron = new Griffindor("Рон Уизли ", 70,70,
//                70,70, 70);
//
//        Slitherine drako = new Slitherine("Драко Малфой", 60,60,
//                60,60, 60, 60, 60);
//        Slitherine grehem = new Slitherine("Грэхэм Монтегю", 50,50,
//                50,50, 50, 50, 50);
//        Slitherine gregori = new Slitherine("Грегори Гойл ", 40,40,
//                40,40, 40, 40, 40);
//
//        Kogtevran chou = new Kogtevran("Чжоу Чанг", 30,30,
//                30,30, 30, 30);
//        Kogtevran padma = new Kogtevran("Падма Патил", 20,20,
//                20,20, 20, 20);
//        Kogtevran markus = new Kogtevran("Маркус Белби ", 10,10,
//                10,10, 10, 10);
//
//        Puffenduy zaharia = new Puffenduy("Захария Смит", 55,55,
//                55,55, 55);
//        Puffenduy sedrik = new Puffenduy("Седрик Диггори", 88,88,
//                88,88, 88);
//        Puffenduy justin = new Puffenduy("Джастин Финч-Флетчли ", 77,77,
//                77,77, 77);
//
//
//        harry.compareStudents(drako);
//        System.out.println(harry);
//
//        harry.compareGriffindor(germiona);
//        System.out.println(harry);
//
//        zaharia.comparePuffenduy(sedrik);
//        System.out.println();
//        drako.compareSlitherine(gregori);
//        System.out.println();
//        drako.compareStudents(zaharia);
//        System.out.println();
//        System.out.println(chou);
//
//
//    }
//}
//}
// 55
//src/ru/skypro/Puffenduy.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,55 @@
//package ru.skypro;
//
//public class Puffenduy extends Hogwarts {
//    private final int industrious;
//    private final int loyal;
//    private final int honesty;
//
//    public Puffenduy(String name, int powerOfMagic, int distanceOfTransgression,
//                     int industrious, int loyal, int honesty) {
//        super(name, powerOfMagic, distanceOfTransgression);
//        this.industrious = industrious;
//        this.loyal = loyal;
//        this.honesty = honesty;
//    }
//
//    public int getIndustrious() {
//        return industrious;
//    }
//
//    public int getLoyal() {
//        return loyal;
//    }
//
//    public int getHonesty() {
//        return honesty;
//    }
//
//    public void comparePuffenduy(Puffenduy student) {
//        super.compareStudents(student);
//        if (this.industrious > student.getIndustrious()) {
//            System.out.println("Industrious " + this.getName() + " is higher then " + student.getName());
//        } else if (this.industrious == student.getIndustrious()) {
//            System.out.println("Industrious " + this.getName() + " and " + student.getName() + " are equal");
//        } else {
//            System.out.println("Industrious " + this.getName() + " is lower then " + student.getName());
//        }
//
//        if (this.loyal > student.getLoyal()) {
//            System.out.println("Loyal " + this.getName() + " is higher then " + student.getName());
//        } else if (this.loyal == student.getLoyal()) {
//            System.out.println("Loyal " + this.getName() + " and " + student.getName() + " are equal");
//        } else {
//            System.out.println("Loyal " + this.getName() + " is lower then " + student.getName());
//        }
//
//        if (this.honesty > student.getHonesty()) {
//            System.out.println("Honesty " + this.getName() + " is higher then " + student.getName());
//        } else if (this.honesty == student.getHonesty()) {
//            System.out.println("Honesty " + this.getName() + " and " + student.getName() + " are equal");
//        } else {
//            System.out.println("Honesty " + this.getName() + " is lower then " + student.getName());
//        }
//    }
//}
//
// 86
//src/ru/skypro/Slitherine.java
//Marking files as viewed can help keep track of your progress, but will not affect your submitted reviewViewed
//Comment on this file
//@@ -0,0 +1,86 @@
//package ru.skypro;
//
//public class Slitherine extends Hogwarts {
//    private final int cunning;
//    private final int determination;
//    private final int ambition;
//    private final int resourcefulness;
//    private final int powerLust;
//
//    public Slitherine(String name, int powerOfMagic, int distanceOfTransgression,
//                      int cunning, int determination, int ambition, int resourcefulness, int powerLust) {
//        super(name, powerOfMagic, distanceOfTransgression);
//        this.cunning = cunning;
//        this.determination = determination;
//        this.ambition = ambition;
//        this.resourcefulness = resourcefulness;
//        this.powerLust = powerLust;
//    }
//
//    public int getCunning() {
//        return cunning;
//    }
//
//    public int getDetermination() {
//        return determination;
//    }
//
//    public int getAmbition() {
//        return ambition;
//    }
//
//    public int getResourcefulness() {
//        return resourcefulness;
//    }
//
//    public int getPowerLust() {
//        return powerLust;
//    }
//
//    public void compareSlitherine(Slitherine student) {
//        super.compareStudents(student);
//        if (this.cunning > student.getCunning()) {
//            System.out.println("Cunning " + this.getName() + " is higher then " + student.getName());
//        } else if (this.cunning == student.getCunning()) {
//            System.out.println("Cunning " + this.getName() + " and " + student.getName() + " are equal");
//        } else {
//            System.out.println("Cunning " + this.getName() + " is lower then " + student.getName());
//        }
//
//        if (this.determination > student.getDetermination()) {
//            System.out.println("Determination " + this.getName() + " is higher then " + student.getName());
//        } else if (this.determination == student.getDetermination()) {
//            System.out.println("Determination " + this.getName() + " and " + student.getName() + " are equal");
//        } else {
//            System.out.println("Determination " + this.getName() + " is lower then " + student.getName());
//        }
//
//        if (this.ambition > student.getAmbition()) {
//            System.out.println("Ambition " + this.getName() + " is higher then " + student.getName());
//        } else if (this.ambition == student.getAmbition()) {
//            System.out.println("Ambition " + this.getName() + " and " + student.getName() + " are equal");
//        } else {
//            System.out.println("Ambition " + this.getName() + " is lower then " + student.getName());
//        }
//
//        if (this.resourcefulness > student.getResourcefulness()) {
//            System.out.println("Resourcefulness " + this.getName() + " is higher then " + student.getName());
//        } else if (this.resourcefulness == student.getResourcefulness()) {
//            System.out.println("Resourcefulness " + this.getName() + " and " + student.getName() + " are equal");
//        } else {
//            System.out.println("Resourcefulness " + this.getName() + " is lower then " + student.getName());
//        }
//
//        if (this.powerLust > student.getPowerLust()) {
//            System.out.println("PowerLust " + this.getName() + " is higher then " + student.getName());
//        } else if (this.powerLust == student.getPowerLust()) {
//            System.out.println("PowerLust " + this.getName() + " and " + student.getName() + " are equal");
//        } else {
//            System.out.println("PowerLust " + this.getName() + " is lower then " + student.getName());
//        }
//    }
//    }


    }
}

























