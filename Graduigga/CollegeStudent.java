public class CollegeStudent {
    private String lastName, firstName;
    private MyDate enrollmentDate, graduationDate;

    public CollegeStudent(String lastName, String firstName, MyDate enrollmentDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.enrollmentDate = enrollmentDate;
        this.graduationDate = new MyDate(enrollmentDate.getYear() + 4,
                                         enrollmentDate.getMonth(),
                                         enrollmentDate.getDay());
    }

    public String getLastname() { return lastName; }
    public void setLastname(String lastName) { this.lastName = lastName; }
    public String getFirstname() { return firstName; }
    public void setFirstname(String firstName) { this.firstName = firstName; }
    public MyDate getEnrollmentDate() { return enrollmentDate; }
    public void setEnrollmentDate(MyDate enrollmentDate) { this.enrollmentDate = enrollmentDate; }
    public MyDate getGraduationDate() { return graduationDate; }
    
    public void setGraduationDate(MyDate graduationDate) {
        this.graduationDate = graduationDate;
    }


}
    