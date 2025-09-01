import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        try (Scanner scan = new Scanner(new File("student.txt"))) {
            while(scan.hasNextLine()) {
                String lastName = scan.nextLine();
                String firstName = scan.nextLine();
                char gender = scan.nextLine().charAt(0);
                String course = scan.nextLine();
                int yearLevel = scan.nextInt();
                double qpi = scan.nextDouble();

                if (scan.hasNextLine()) scan.nextLine();

                students.add(new Student(lastName, firstName, course, gender, yearLevel, qpi));
            }    
        } catch (Exception ex) {
            System.out.println("Reading error: " + ex.getMessage());
        } sortCourse(students);

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    public static void sortCourse(ArrayList<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int courseCompare = s1.getCourse().compareTo(s2.getCourse());
                    if (courseCompare != 0) return courseCompare;
                int lastNameCompare = s1.getLastname().compareTo(s2.getLastname());
                    if (lastNameCompare != 0) return lastNameCompare;
                return s1.getFirstname().compareTo(s2.getFirstname());
            }
        });
    }
}