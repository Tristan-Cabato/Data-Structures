import java.io.*;
import java.util.*;

public class ClassInfo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Students.txt"));
        int size = scan.nextInt(); scan.nextLine();

        Person person, data[] = new Person[size];

        for (int i = 0; i < size; i++) {
            person = new Person();
            person.name = scan.nextLine();
            person.gender = scan.nextLine().charAt(0);
            person.age = scan.nextInt();
            if (scan.hasNext()) scan.nextLine();
            data[i] = person;
        }

        System.out.println("Females:");
        for (Person p : data) {
            if (Character.toUpperCase(p.gender) == 'F') System.out.println("\t%s is %d and is Female".formatted(p.name, p.age));
        }
        System.out.println("Males:");
        for (Person p : data) {
            if (Character.toUpperCase(p.gender) == 'M') System.out.println("\t%s is %d and is Male".formatted(p.name, p.age));
        }
    }
}