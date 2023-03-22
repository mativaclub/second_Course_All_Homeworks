package OldWorks.OOP_HOMEWORK;

public class Hogwarts {

    private final String studentName;
    private final int powerOfMagic;
    private final int distanceOfTransgression;

    public Hogwarts(String studentName, int powerOfMagic, int distanceOfTransgression) {
        this.studentName = studentName;
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    @Override
    public String toString() {
        return "Hogwarts student " + studentName +
                " has a power Of Magic " + powerOfMagic +
                " and can transgress to the distance of " + distanceOfTransgression;
    }


    public void compareStudents(Hogwarts student) {
        if (this.powerOfMagic > student.getPowerOfMagic()) {
            System.out.println("Magic power of " + this.studentName + " is higher then " + student.getStudentName());
        } else if (this.powerOfMagic == student.getPowerOfMagic()) {
            System.out.println("Magic powers of " + this.studentName + " and " + student.studentName +
                    " students are equal");
        } else {
            System.out.println("Magic power of " + this.studentName + " is lower then " + student.getStudentName());
        }

        if (this.distanceOfTransgression > student.distanceOfTransgression) {
            System.out.println("Distance of transgression of " + this.studentName + " is higher then " +
                    student.getStudentName());
        } else if (this.distanceOfTransgression == student.getDistanceOfTransgression()) {
            System.out.println("Distance of transgression of " + this.studentName + " and " +
                    student.getStudentName() + " students are equal");
        } else {
            System.out.println("Distance of transgression of " + this.studentName + " is lower then " +
                    student.getStudentName());
        }
    }

}
