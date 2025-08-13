public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    
    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public int getGrade() {
        return grade;
    }
}