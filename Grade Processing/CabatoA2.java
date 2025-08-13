import java.io.*;
import java.util.*;

public class CabatoA2 {
    public static void main(String[] args) throws FileNotFoundException {
        List<Student> students = new ArrayList<>();
        String subject = "";
        int highestGrade = -1;

        File subjectGrades = new File("grade.txt");
        Scanner scan = new Scanner(subjectGrades);
        
        if (scan.hasNextLine()) {
            subject = scan.nextLine();
        }
        
        while (scan.hasNextLine()) {
            String lastName = scan.nextLine().trim();
            if (!scan.hasNextLine()) break;
            String firstName = scan.nextLine().trim();
            if (!scan.hasNextLine()) break;
            int grade = Integer.parseInt(scan.nextLine().trim());
            
            Student student = new Student(firstName, lastName, grade);
            students.add(student);
            
            if (grade > highestGrade) {
                highestGrade = grade;
            }
        }
        scan.close();
        displayResults(students, subject, highestGrade);
    }
    
    private static void displayResults(List<Student> students, String subject, int highestGrade) {
        System.out.print("""
        Subject: %s
        %s
        """.formatted(subject, "-".repeat(50)));
        
        List<Student> passed = new ArrayList<>();
        List<Student> failed = new ArrayList<>();
        List<Student> topStudents = new ArrayList<>();
        
        for (Student student : students) {
            if (student.getGrade() >= 75) passed.add(student);
            else failed.add(student);
            
            if (student.getGrade() == highestGrade) topStudents.add(student);
        }
        
        double sum = 0;
        for (Student student : students) sum += student.getGrade();
        double average = sum / students.size();
        
        System.out.println("""
        \nNumber of students who failed: %d
        Failed students:""".formatted(failed.size()));
        for (Student student : failed) System.out.printf("  - %s\n", student.getFullName());
        
        System.out.println("""
        \nNumber of students who passed: %d
        Passed students:""".formatted(passed.size()));
        for (Student student : passed) System.out.printf("  - %s\n", student.getFullName());
        
        System.out.println("""
        \nStudent(s) with the highest grade (%d):""".formatted(highestGrade));
        for (Student student : topStudents) System.out.printf("  - %s\n", student.getFullName());
        
        System.out.println("\nAverage grade of the class: %.2f\n".formatted(average));
    }
}