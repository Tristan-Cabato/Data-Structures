import java.io.*;
import java.util.*;

public class ClassInfo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Students.txt"));
        int totalStudents = scan.nextInt(); 
        scan.nextLine();
        Vector<Students> allStudents = new Vector<>();
    
        for (int i = 0; i < totalStudents; i++) {
            String name = scan.nextLine();
            int totalSubjects = scan.nextInt(); 
            scan.nextLine();
            
            Students student = new Students(name, 0);
            float average = student.takeSubjectAverage(scan, totalSubjects);
            student.average = average;
            allStudents.add(student);
        } scan.close();
    
        for (Students student : allStudents) {
            System.out.println(student.displayInfo());
        }
    }
    @Override
    public String toString() {
        return "";
    }
}