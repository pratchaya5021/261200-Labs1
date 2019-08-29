import java.util.ArrayList;
import java.util.Scanner;

public class AverageGradeCalculator1 {
    public static ArrayList<String> students = new ArrayList<>();
    public static ArrayList<Double> grades = new ArrayList<>();

    public static double calculateAverageGrade() {
        System.out.println("\nClass roster:");
        double sum = 0.0;
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + " (" + grades.get(i) + ")");
            sum += grades.get(i);
        }
        double tmp = sum/students.size();
        System.out.println("Average grade: " + tmp);
        return tmp;
    }

    public static void main(String[] args) {
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
            Double grade = in.nextDouble();
            grades.add(grade);
        }
        double output = calculateAverageGrade();
    }
}