import java.util.*;

class StudentService {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(int id, String name, int age, String course, double marks) {
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("ID already exists!");
                return;
            }
        }
        students.add(new Student(id, name, age, course, marks));
        System.out.println("Student Added!");
    }

    public void viewAll() {
        if (students.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        for (Student s : students) {
            s.display();
        }
    }

    public void updateStudent(int id, String name, int age, String course, double marks) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(name);
                s.setAge(age);
                s.setCourse(course);
                s.setMarks(marks);
                System.out.println("Updated!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void deleteStudent(int id) {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
                System.out.println("Deleted!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void showTopper() {
        if (students.isEmpty()) {
            System.out.println("No data");
            return;
        }

        Student topper = students.get(0);
        for (Student s : students) {
            if (s.getMarks() > topper.getMarks()) {
                topper = s;
            }
        }
        System.out.print("Topper: ");
        topper.display();
    }
}