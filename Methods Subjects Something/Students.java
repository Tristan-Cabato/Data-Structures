import java.util.*;

public class Students {
    String name;
    float average;

    public void extraNewLines(Scanner scan) {
        if (!scan.hasNextInt() || !scan.hasNextFloat()) scan.nextLine();
    }

    public float takeSubjectAverage(Scanner scan, int totalSubjects) {
        float totalUnits = 0, totalGradePoints = 0;
        
        for (int i = 0; i < totalSubjects; i++) {
            scan.nextLine(); // Supposedly subject to be stored in an array but idk what to do with it
            extraNewLines(scan); int units = scan.nextInt();
            extraNewLines(scan); float grade = scan.nextFloat();
            
            if (scan.hasNextLine()) scan.nextLine();
            
            totalUnits += units;
            totalGradePoints += (grade * units);
        } return totalGradePoints / totalUnits;
    }

    public Students(String name, float average) {
        this.name = name;
        this.average = average;
    }

    public String addInfo() { 
        return """
            Name: %s
            Average: %.2f
            
        """.formatted(name, average);
    }
}