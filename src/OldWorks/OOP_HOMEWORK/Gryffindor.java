package OldWorks.OOP_HOMEWORK;

public class Gryffindor extends Hogwarts {

    private final int nobility;
    private final int honour;
    private final int bravery;


    public Gryffindor(String studentName, int powerOfMagic, int distanceOfTransgression,
                      int nobility, int honour, int bravery) {
        super(studentName, powerOfMagic, distanceOfTransgression);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }


    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Nobility of Student is " + nobility + ", honour is " + honour + ", bravery is " + bravery;
    }


    @Override
    public void compareStudents(Hogwarts student) {
        super.compareStudents(student);
        if (student instanceof Gryffindor) {
            Gryffindor gryffindorStudent = (Gryffindor) student;
            if (this.nobility > gryffindorStudent.getNobility()) {
                System.out.println("Nobility " + this.getStudentName() + " is higher then " + student.getStudentName());
            } else if (this.nobility == gryffindorStudent.getNobility()) {
                System.out.println("Nobility " + this.getStudentName() + " and " + student.getStudentName() + " are equal");
            } else {
                System.out.println("Nobility " + this.getStudentName() + " is lower then " + student.getStudentName());
            }

        if (this.honour > gryffindorStudent.getHonour()) {
            System.out.println("Honour " + this.getStudentName() + " is higher then " + student.getStudentName());
        } else if (this.honour == gryffindorStudent.getHonour()) {
            System.out.println("Honour " + this.getStudentName() + " and " + student.getStudentName() + " are equal");
        } else {
            System.out.println("Honour " + this.getStudentName() + " is lower then " + student.getStudentName());
        }

        if (this.bravery > gryffindorStudent.getBravery()) {
            System.out.println("Bravery " + this.getStudentName() + " is higher then " + student.getStudentName());
        } else if (this.bravery == gryffindorStudent.getBravery()) {
            System.out.println("Bravery " + this.getStudentName() + " and " + student.getStudentName() + " are equal");
        } else {
            System.out.println("Bravery " + this.getStudentName() + " is lower then " + student.getStudentName());
        }
        }
    }





    }


