public class Students {
    String name;
    float average;

    public Students(String name, float average) {
        this.name = name;
        this.average = average;
    }

    public void displayInfo() { 
        System.out.println("""
            Name: %s
            Average: %.2f
        """.formatted(name, average));
    }
}