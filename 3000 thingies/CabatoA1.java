import java.io.*;
import java.util.*;

public class CabatoA1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("numbers.txt"));
        
        float allEven = 0, allOdd = 0, allNum = 0;
        int evenCount = 0, oddCount = 0;
        int smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE;
        
        while (scan.hasNextInt()) {
            int num = scan.nextInt();
            allNum += num;
            if (num % 2 == 0) {
                allEven += num;
                evenCount++;
            } else {
                allOdd += num;
                oddCount++;
            }
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        } scan.close();
        System.out.printf("""
                Smallest Number: %d
                Largest Number: %d
                Average of all numbers: %.2f
                Average of all even numbers: %.2f
                Average of all odd numbers: %.2f
                """.formatted(smallest,
                              largest,
                              allNum / 3000,
                              allEven / evenCount,
                              allOdd / oddCount));
    }
} // numbers seems to only have 3000 numbers instead of 5000