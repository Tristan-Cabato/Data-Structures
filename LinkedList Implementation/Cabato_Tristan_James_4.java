import java.io.*;
import java.util.*;

public class Cabato_Tristan_James_4 {
    public static void main(String[] args) {
        IntSLList list = new IntSLList();
        File file = new File("numbers.txt");
            
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) continue;

                switch (line.charAt(0)) {
                    case 'a' -> {
                        int num = Integer.parseInt(scanner.nextLine().trim());
                        list.addHead(num);
                    } case 'b' -> {
                        int num = Integer.parseInt(scanner.nextLine().trim());
                        list.addTail(num);
                    } case 'c' -> {
                        int deleted = list.deleteHead();
                        System.out.println(deleted + " was deleted");
                    } case 'd' -> {
                        if (list.isEmpty()) {
                            System.out.println("Linked list is empty");
                        } else {
                            int deleted = list.deleteTail();
                            System.out.println(deleted + " was deleted");
                        }
                    } case 'e' -> {
                        if (list.isEmpty()) {
                            System.out.println("Linked list is empty");
                        } else if (scanner.hasNextLine()) {
                            int num = Integer.parseInt(scanner.nextLine().trim());
                            if (list.isInList(num)) {
                                list.deleteElement(num);
                                System.out.println(num + " was deleted");
                            } else {
                                System.out.println("Number not found");
                            }
                        }
                    } default -> { System.out.println("'%c' is not a valid operation".formatted(line.charAt(0))); }
                } 
            } 
            System.out.print("Final List: ");
            list.printList();
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found");
        }
    }
}
