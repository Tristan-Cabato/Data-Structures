import java.io.*;
import java.util.*;

public class CabatoA3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("numbers.txt"))) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    numbers.add(scanner.nextInt());
                } else scanner.next();
            }
        } catch (FileNotFoundException e) { System.out.println("File not found"); }

        System.out.println("=".repeat(20));
            bubbleSort(new ArrayList<>(numbers));
            selectionSort(new ArrayList<>(numbers));
            insertionSort(new ArrayList<>(numbers));
    }

    public static void bubbleSort(ArrayList<Integer> numbers) {
        int swaps = 0;
        boolean swapped;
        for (int i = 0; i < numbers.size(); i++) {
            swapped = false;
            for (int j = 0; j < numbers.size() - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    Collections.swap(numbers, j, j + 1);
                    swaps++;
                    swapped = true;
                }
            } if (!swapped) break;
        } System.out.println("Bubble Sort: %,d swaps".formatted(swaps));
    }

    public static void selectionSort(ArrayList<Integer> numbers) {
        int i, j, temp, swaps = 0;
        for (i = 0; i < numbers.size() - 1; i++) {
            int smallestNum = i;
            for (j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(j) < numbers.get(smallestNum)) {
                    smallestNum = j;
                }
            } if (smallestNum != i) {
                temp = numbers.get(i);
                numbers.set(i, numbers.get(smallestNum));
                numbers.set(smallestNum, temp);
                swaps++;
            }
        } System.out.println("Selection Sort: %,d swaps".formatted(swaps));
    }

    public static void insertionSort(ArrayList<Integer> numbers) {
        int i, j, temp, swaps = 0;

        for (i = 1; i < numbers.size(); i++) {
            temp = numbers.get(i);
            
            for (j = i - 1; j >= 0; j--) {
                if (numbers.get(j) > temp) {
                    numbers.set(j + 1, numbers.get(j));
                    swaps++;
                } else break;
            } numbers.set(j + 1, temp);
        } System.out.println("Insertion Sort: %,d swaps".formatted(swaps));
    }
}