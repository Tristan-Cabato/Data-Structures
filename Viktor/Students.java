import java.util.*;

public class Students {
    Vector<Subject> subjects = new Vector<>();
    String name;
    float average;

    public void extraNewLines(Scanner scan) {
        if (!scan.hasNextInt() || !scan.hasNextFloat()) scan.nextLine();
    }

    public float takeSubjectAverage(Scanner scan, int totalSubjects) {
        float totalUnits = 0, totalGradePoints = 0;
        for (int i = 0; i < totalSubjects; i++) {
            String subjectName = scan.nextLine();
            int units = scan.nextInt();
            float grade = scan.nextFloat();

            this.subjects.add(new Subject(subjectName, units, grade));
            
            if (scan.hasNextLine()) scan.nextLine();
            
            totalUnits += units;
            totalGradePoints += (grade * units);
        } return totalGradePoints / totalUnits;
    }

    public Students(String name, float average) {
        this.name = name;
        this.average = average;
    }

    public String displayInfo() { 
        return """
            Name: %s
            Subjects and Grades: %s
            Average: %.2f
            """.formatted(name, subjects, average);
    }
}