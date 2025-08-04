public class Subject {
    String subjectName;
    int units;
    double grade;

    public Subject(String subjectName, int units, double grade) {
        this.subjectName = subjectName;
        this.units = units;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "%s (%.2f)".formatted(subjectName, grade);
    }
}
