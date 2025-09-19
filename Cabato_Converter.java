import java.util.*;
import javax.swing.*;

public class Cabato_Converter {
    public static void main(String[] args) {        
        int decimalNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter a decimal number: "));
        int base = Integer.parseInt(JOptionPane.showInputDialog("Enter target base (2-9): "));
        
        if (base < 2 || base > 9) {
            message("Error: Base must be between 2 and 9.");
        } String result = convertDecimalToBase(decimalNumber, base);
        message("The equivalent of %d in base %d is: %s".formatted(decimalNumber, base, result));
    }
    
    public static String convertDecimalToBase(int number, int base) {
        if (number == 0) { return "0"; }
        
        Stack<Integer> stack = new Stack<>();
        int num = Math.abs(number);
        
        while (num > 0) {
            int remainder = num % base;
            stack.push(remainder);
            num = num / base;
        }
        
        StringBuilder result = new StringBuilder();
        if (number < 0) { result.append("-"); }
        
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        } return result.toString();
    }

    public static void message(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}