public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Pineapple", 3.5, 2, 25.6);
        student1.Name();
        student1.GPA();
        student1.Absences();
        student1.Hours();
        Student student2 = new Student("Apple", 3.1, 5, 55);
        student2.Name();
        student2.GPA();
        student2.Absences();
        student2.Hours();
        Student student3 = new Student("Pen", 4.1, 0, 78.2);
        student3.Name();
        student3.GPA();
        student3.Absences();
        student3.Hours();
    }
}
