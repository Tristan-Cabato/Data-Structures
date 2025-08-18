import javax.swing.*;

public class CabatoLawn {
    
    public static void main(String[] args) {        
        double length = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the length of the lawn (in feet):", "Cabato Lawn Mowing Service",JOptionPane.QUESTION_MESSAGE));
        double width = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the width of the lawn (in feet):", "Cabato Lawn Mowing Service", JOptionPane.QUESTION_MESSAGE));
        
        double area = length * width;
        double weeklyFee = (area < 4000) ? 250 :
            (area < 6000) ? 350 : 500;

        int choice = Integer.parseInt(JOptionPane.showInputDialog(null, """
            Payment Options:
            
            1. One-time payment (No service charge per payment)
            2. Two payments (P50 service charge per payment)
            3. Twenty weekly payments (P30 service charge per payment)
            Choose a payment option (1-3):""", "Cabato Lawn Mowing Service",JOptionPane.QUESTION_MESSAGE));
        
        switch (choice) {
            case 1 -> {
                double totalCost = weeklyFee * 20;
                JOptionPane.showMessageDialog(null, """
                Number of payments: 1
                Amount per payment: P%,.2f
                Total cost for the season: P%,.2f""".formatted(totalCost, totalCost));
                }
                
            case 2 -> { // Two Payment Fee
                double paymentAmount = (weeklyFee * 20 / 2) + 50;
                double totalCost = paymentAmount * 2;
                JOptionPane.showMessageDialog(null, """
                Number of payments: 2
                Amount per payment: P%,.2f
                Total cost for the season: P%,.2f""".formatted(paymentAmount, totalCost));
                }
                
            case 3 -> { // Twenty Weekly Payment Fee
                    double paymentAmount = weeklyFee + 30;
                    double totalCost = 20 * paymentAmount;
                    JOptionPane.showMessageDialog(null, """
                    Number of payments: 20
                    Amount per payment: P%,.2f
                    Total cost for the season: P%,.2f""".formatted(paymentAmount, totalCost));
                } default -> JOptionPane.showMessageDialog(null, "Invalid option selected. Please choose 1, 2, or 3.", "Cabato Lawn Mowing Service", JOptionPane.ERROR_MESSAGE);
        }
    }
}