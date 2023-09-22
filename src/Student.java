public class Student {
    private String name;
    private double gpa;
    private int absences;
    private double hours;
    public Student(String sName, double sGPA, int sAbsences, double sHours) {
        name = sName;
        gpa = sGPA;
        absences = sAbsences;
        hours = sHours;
    }
    public void Name() {
        System.out.println("Name: " + name);
    }
    public void GPA() {
        System.out.println("GPA: " + gpa);
    }
    public void Absences() {
        System.out.println("Absences: " + absences);
    }
    public void Hours() {
        System.out.println("Volunteer Hours: " + hours);
    }
}
