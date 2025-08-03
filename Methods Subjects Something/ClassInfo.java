import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class ClassInfo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Students.txt"));
        int totalStudents = scan.nextInt(); 
        scan.nextLine();
        Students[] allStudents = new Students[totalStudents];
        String studentDisplay = "";
    
        for (int i = 0; i < totalStudents; i++) {
            String name = scan.nextLine();
            int totalSubjects = scan.nextInt(); 
            scan.nextLine();
            
            Students student = new Students(name, 0);
            float average = student.takeSubjectAverage(scan, totalSubjects);
            student.average = average;
            allStudents[i] = student;
        } scan.close();
    
        for (Students student : allStudents) {
            studentDisplay += student.addInfo();
        } frontEnd(studentDisplay);
    }

    public static void frontEnd(String texts) {
        JTextArea textArea = new JTextArea(texts);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        
        JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(400, 200));
        
        JOptionPane.showMessageDialog(null, scrollPane,"Students", JOptionPane.PLAIN_MESSAGE);
    }
}