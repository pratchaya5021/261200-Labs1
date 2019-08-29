// No code to write or modify for this task.  See task description on the right.

import java.util.ArrayList;
import java.util.Scanner;

public class IncorrectAverageGradeCalculator2 {

    private static double convertGradeLetterToPoint(String grade) {
        switch (grade){
            case "A": return 4.0;
            case "B": return 3.0;
            case "C": return 2.0;
            case "D": return 1.0;
            case "F":
            default:
                return 0.0;
        }
    }

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        ArrayList<String> grades = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        String newStudent;
        System.out.println("Enter your students (or ENTER to finish)");
        //Get student names
        do {
            newStudent = in.nextLine();
            if(!newStudent.equals("")) {
                students.add(newStudent);
            }
        } while (!newStudent.equals(""));

        //Get student grades
        for(String student : students) {
            System.out.print("Grade for "+ student + ": ");
            String grade = in.nextLine();
            grades.add(grade);
        }

        //Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " (" + grades.get(i) + ")");
            sum += convertGradeLetterToPoint(grades.get(i));
        }

        //Print the average grade
        double tmp = sum / students.size();
        System.out.println("Average grade: " + tmp);
    }
}