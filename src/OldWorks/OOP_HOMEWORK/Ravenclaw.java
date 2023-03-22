package OldWorks.OOP_HOMEWORK;

public class Ravenclaw extends Hogwarts{

    private final int clever;
    private final int wisdom;
    private final int witty;
    private final int creativity;

    public Ravenclaw(String studentName, int powerOfMagic, int distanceOfTransgression,
                     int clever, int wisdom, int witty, int creativity) {
        super(studentName, powerOfMagic, distanceOfTransgression);
        this.clever = clever;
        this.wisdom = wisdom;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getClever() {
        return clever;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Cleverness of student is " + clever + " wisdom is " + wisdom + " witty is " + witty +
                " creativity is " + creativity;
    }

    public void compareRavenclow(Ravenclaw student) {
        super.compareStudents(student);
        if (this.clever > student.getClever()) {
            System.out.println("Clever " + this.getStudentName() + " is higher then " + student.getStudentName());
        } else if (this.clever == student.getClever()) {
            System.out.println("Clever " + this.getStudentName() + " and " + student.getStudentName() + " are equal");
        } else {
            System.out.println("Clever " + this.getStudentName() + " is lower then " + student.getStudentName());
        }

        if (this.wisdom > student.getWisdom()) {
            System.out.println("Wisdom " + this.getStudentName() + " is higher then " + student.getStudentName());
        } else if (this.wisdom == student.getWisdom()) {
            System.out.println("Wisdom " + this.getStudentName() + " and " + student.getStudentName() + " are equal");
        } else {
            System.out.println("Wisdom " + this.getStudentName() + " is lower then " + student.getStudentName());
        }

        if (this.witty > student.getWitty()) {
            System.out.println("Witty " + this.getStudentName() + " is higher then " + student.getStudentName());
        } else if (this.witty == student.getWitty()) {
            System.out.println("Witty " + this.getStudentName() + " and " + student.getStudentName() + " are equal");
        } else {
            System.out.println("Witty " + this.getStudentName() + " is lower then " + student.getStudentName());
        }

        if (this.creativity > student.getCreativity()) {
            System.out.println("Creativity " + this.getStudentName() + " is higher then " + student.getStudentName());
        } else if (this.creativity == student.getCreativity()) {
            System.out.println("Creativity " + this.getStudentName() + " and " + student.getStudentName() + " are equal");
        } else {
            System.out.println("Creativity " + this.getStudentName() + " is lower then " + student.getStudentName());
        }
    }



}
