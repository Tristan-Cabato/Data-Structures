import java.io.*;
import java.util.*;

public class ClassInfo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Students.txt"));
        int size = scan.nextInt();
        scan.nextLine();

        String[] names = new String[size];
        int[] ages = new int[size];
        char[] genders = new char[size];

        String females = "Females:";
        String males = "Males:";

        for (int i = 0; i < size; i++) {
            names[i] = scan.nextLine();
            genders[i] = scan.nextLine().charAt(0);
            ages[i] = scan.nextInt();
            scan.nextLine();
            if (genders[i] == 'F') {
                females += String.format("\n\t%s -- %d", names[i], ages[i]);
            } else {
                males += String.format("\n\t%s -- %d", names[i], ages[i]);
            }
        } scan.close();
        System.out.println(females);
        System.out.println(males);
    }
}