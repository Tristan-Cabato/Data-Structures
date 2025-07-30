import java.io.*;
import java.util.*;

public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("input.txt");
        Scanner reader = new Scanner(input);
        int average = 0,count = 0;
        
        while (reader.hasNextLine()) {
            String name = reader.nextLine();
            int age = reader.nextInt();
            if (reader.hasNext()) {
                reader.nextLine();
            } count++; 
            average += age;
            System.out.printf("%s is %d years old\n", name, age);
        } 
        reader.close();
        System.out.printf("""
        -----------------------------
        Average Age Range: %.2f""".formatted((float) average/count));
    }
}