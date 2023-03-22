package OldWorks.OOP_HOMEWORK;

public class Hufflepuff extends Hogwarts{

    private final int industrial;
    private final int loyal;
    private final int honesty;

    public Hufflepuff(String studentName, int powerOfMagic, int distanceOfTransgression,
                      int industrial, int loyal, int honesty) {
        super(studentName, powerOfMagic, distanceOfTransgression);
        this.industrial = industrial;
        this.loyal = loyal;
        this.honesty = honesty;
    }

    public int getIndustrial() {
        return industrial;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonesty() {
        return honesty;
    }


    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Industrious of student is " + industrial + " loyalty is " + loyal + " honesty is " + honesty;
    }

    public void compareHufflepuff(Hufflepuff student) {
        super.compareStudents(student);
        if (this.industrial > student.getIndustrial()) {
            System.out.println("Industrious " + this.getStudentName() + " is higher then "
                    + student.getStudentName());
        } else if (this.industrial == student.getIndustrial()) {
            System.out.println("Industrious " + this.getStudentName() + " and " + student.getStudentName() +
                    " students are equal");
        } else {
            System.out.println("Industrious " + this.getStudentName() + " is lower then "
                    + student.getStudentName());
        }

        if (this.loyal > student.getLoyal()) {
            System.out.println("Loyal " + this.getStudentName() + " is higher then "
                    + student.getStudentName());
        } else if (this.loyal == student.getLoyal()) {
            System.out.println("Loyal " + this.getStudentName() + " and " + student.getStudentName() +
                    " students are equal");
        } else {
            System.out.println("Loyal " + this.getStudentName() + " is lower then "
                    + student.getStudentName());
        }

        if (this.honesty > student.getHonesty()) {
            System.out.println("Honesty " + this.getStudentName() + " is higher then "
                    + student.getStudentName());
        } else if (this.honesty == student.getHonesty()) {
            System.out.println("Honesty " + this.getStudentName() + " and " + student.getStudentName() +
                    " students are equal");
        } else {
            System.out.println("Honesty " + this.getStudentName() + " is lower then "
                    + student.getStudentName());
        }
    }


}
