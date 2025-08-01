import java.io.*;
import java.util.*;

public class ClassInfo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Students.txt"));
        int totalStudents = scan.nextInt(); 
        scan.nextLine();
        Students[] allStudents = new Students[totalStudents];
    
        for (int i = 0; i < totalStudents; i++) {
            String name = scan.nextLine();
            int totalSubjects = scan.nextInt(); 
            scan.nextLine();
            
            Students student = new Students(name, 0);
            float average = student.takeSubjectAverage(scan, totalSubjects);
            student.average = average;
            allStudents[i] = student;
        } scan.close();
    
        for (Students student : allStudents) {
            student.displayInfo();
        }
    }
}