package OldWorks.OOP_HOMEWORK;

public class Slytherin extends Hogwarts{
    private final int cunning;
    private final int determined;
    private final int ambition;
    private final int resourcefulness;
    private final int powerLust;

    public Slytherin(String studentName, int powerOfMagic, int distanceOfTransgression,
                     int cunning, int determined, int ambition, int resourcefulness, int powerLust) {
        super(studentName, powerOfMagic, distanceOfTransgression);
        this.cunning = cunning;
        this.determined = determined;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.powerLust = powerLust;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermined() {
        return determined;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPowerLust() {
        return powerLust;
    }


    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Cunning of student is " + cunning + " determined is " + determined +
                " ambition is " + ambition + " resourcefulness is " + resourcefulness
                + " powerLust is " + powerLust;
    }

    public void compareSlytherin(Slytherin student) {
        super.compareStudents(student);
        if (this.cunning > student.getCunning()) {
            System.out.println("Cunning " + this.getStudentName() + " is higher then " + student.getStudentName());
        } else if (this.cunning == student.getCunning()) {
            System.out.println("Cunning " + this.getStudentName() + " and " + student.getStudentName() + " are equal");
        } else {
            System.out.println("Cunning " + this.getStudentName() + " is lower then " + student.getStudentName());
        }

        if (this.determined > student.getDetermined()) {
            System.out.println("Determination " + this.getStudentName() + " is higher then " + student.getStudentName());
        } else if (this.determined == student.getDetermined()) {
            System.out.println("Determination " + this.getStudentName() + " and " + student.getStudentName() + " are equal");
        } else {
            System.out.println("Determination " + this.getStudentName() + " is lower then " + student.getStudentName());
        }

        if (this.ambition > student.getAmbition()) {
            System.out.println("Ambition " + this.getStudentName() + " is higher then " + student.getStudentName());
        } else if (this.ambition == student.getAmbition()) {
            System.out.println("Ambition " + this.getStudentName() + " and " + student.getStudentName() + " are equal");
        } else {
            System.out.println("Ambition " + this.getStudentName() + " is lower then " + student.getStudentName());
        }

        if (this.resourcefulness > student.getResourcefulness()) {
            System.out.println("Resourcefulness " + this.getStudentName() + " is higher then " + student.getStudentName());
        } else if (this.resourcefulness == student.getResourcefulness()) {
            System.out.println("Resourcefulness " + this.getStudentName() + " and " + student.getStudentName() + " are equal");
        } else {
            System.out.println("Resourcefulness " + this.getStudentName() + " is lower then " + student.getStudentName());
        }

        if (this.powerLust > student.getPowerLust()) {
            System.out.println("PowerLust " + this.getStudentName() + " is higher then " + student.getStudentName());
        } else if (this.powerLust == student.getPowerLust()) {
            System.out.println("PowerLust " + this.getStudentName() + " and " + student.getStudentName() + " are equal");
        } else {
            System.out.println("PowerLust " + this.getStudentName() + " is lower then " + student.getStudentName());
        }
    }


}
