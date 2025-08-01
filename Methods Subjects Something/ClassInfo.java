import java.io.*;
import java.util.*;

public class ClassInfo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Students.txt"));
        int totalStudents = scan.nextInt(); scan.nextLine();
        Students allStudents[] = new Students[totalStudents];

        for (int i = 0; i < totalStudents; i++) {
            int totalUnits = 0;
            float average = 0;
            int totalSubjects = scan.nextInt(); scan.nextLine();
            String name = scan.nextLine();
            for (int j = 0; j < totalSubjects; j++) {
                scan.nextLine(); // Course
                int units = scan.nextInt();
                int grade = scan.nextInt();
                totalUnits += units;
                average += grade * units;
            } average /= totalUnits;
            allStudents[i] = new Students(name, average);
        }

        for (Students student : allStudents) {
            student.displayInfo();
        }
    }
}