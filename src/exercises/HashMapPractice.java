package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main (String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        Integer studentId;
        System.out.println("Enter your Students (or press ENTER to finish): ");
        do {

            System.out.print("Student Name: ");
            newStudent = input.nextLine();
            if (!newStudent.equals("")) {
                System.out.print("Student ID: ");
                studentId = input.nextInt();
                students.put(studentId, newStudent);
                input.nextLine();
            }
        } while(!newStudent.equals(""));

    // Print class roster
        System.out.println("\nClass roster:");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
        System.out.println(student.getKey() + " (" + student.getValue() + ")");
    }
    }
}
